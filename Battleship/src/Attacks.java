import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Attacks {
    public static void main(String[] args) {
    }

    public static void specialAbilities(Scanner userInput) {
        String option;
        do {
            ASCII.menus(2);
            option = userInput.next().toLowerCase();

            switch (option) {
                case "h":
                    do {
                        ASCII.menus(4);
                        option = userInput.next().toLowerCase();
                    } while (!option.equals("x"));
                    break;
                case "l": // TODO
                    break;
                case "s":
                    break;
                case "m":
                    break;
                case "a":
                    attack(userInput);
                    break;
            }
        } while (!option.equals("x"));
    }


    public static void attack(Scanner userInput) {
        int[][] playerBoard1 = new int[10][10];
        String letters = "ABCDEFGHIJ";
        var sum = 1;

        List<int[][]> ships = generateShips();
        for (int[][] ship : ships) {
            boolean isValidPlacement = false;

            while (!isValidPlacement) {
                ASCII.showShips(sum);
                System.out.printf("Choose grid placement [10x10] (ex: A1) - Ship %s/6:  ", sum);

                String choice = userInput.next().toLowerCase();
                int column = choice.charAt(0) - 'a';
                int row = Integer.parseInt(choice.substring(1)) - 1;

                if (row < 0 || row >= 10 || column < 0 || column >= 10) {
                    System.out.println("Invalid input, please try again.");
                    continue;
                }

                System.out.printf("Orientation [LEFT/UP/DOWN/RIGHT] - Ship %s/6:  ", sum);
                String orientation = userInput.next().substring(0, 1).toLowerCase();

                if (placeShip(ship, playerBoard1, row, column, orientation)) {
                    isValidPlacement = true;
                    sum++;
                } else {
                    System.out.println("Invalid Placement, try again...");
                }
            }
        }
    }

    public static boolean placeShip(int[][] ship, int[][] board, int row, int column, String orientation) {
        int[][] adjustedShip = new int[ship.length][2];

        rotateShip(adjustedShip, ship, row, column, orientation);

        for (int[] coord : adjustedShip) {
            int rowV = coord[0];
            int columnV = coord[1];

            if (rowV < 0 || rowV >= 10 || columnV < 0 || columnV >= 10 || board[rowV][columnV] != 0) {
                return false;
            }
        }

        for (int[] coord : adjustedShip) {
            board[coord[0]][coord[1]] = 1;
        }

        printBoard(board);
        return true;
    }

    private static void rotateShip(int[][] adjustedShip, int[][] ship, int row, int column, String orientation) {
        if (ship.length == 4) {
            if (ship[0][0] == 0 && ship[1][0] == 0 && ship[2][0] == 1 && ship[3][0] == 2) {
                if (orientation.equals("r") || orientation.equals("l")) {
                    adjustedShip[0] = new int[]{row, column};
                    adjustedShip[1] = new int[]{row, column + 1};
                    adjustedShip[2] = new int[]{row + 1, column + 1};
                    adjustedShip[3] = new int[]{row + 2, column + 1};
                } else {
                    adjustedShip[0] = new int[]{row, column};
                    adjustedShip[1] = new int[]{row + 1, column};
                    adjustedShip[2] = new int[]{row + 1, column + 1};
                    adjustedShip[3] = new int[]{row + 2, column + 1};
                }
            }
            else if (ship[0][0] == 6 && ship[1][0] == 6 && ship[2][0] == 7 && ship[3][0] == 7) {
                if (orientation.equals("r") || orientation.equals("l")) {
                    adjustedShip[0] = new int[]{row, column};
                    adjustedShip[1] = new int[]{row, column + 1};
                    adjustedShip[2] = new int[]{row + 1, column + 1};
                    adjustedShip[3] = new int[]{row + 2, column + 1};
                } else {
                    adjustedShip[0] = new int[]{row, column};
                    adjustedShip[1] = new int[]{row + 1, column};
                    adjustedShip[2] = new int[]{row + 1, column + 1};
                    adjustedShip[3] = new int[]{row + 1, column + 2};
                }
            } else {
                switch (orientation) {
                    case "r":
                        for (int i = 0; i < ship.length; i++) {
                            adjustedShip[i][0] = row;
                            adjustedShip[i][1] = column + i;
                        }
                        break;
                    case "l":
                        for (int i = 0; i < ship.length; i++) {
                            adjustedShip[i][0] = row;
                            adjustedShip[i][1] = column - i;
                        }
                        break;
                    case "d":
                        for (int i = 0; i < ship.length; i++) {
                            adjustedShip[i][0] = row + i;
                            adjustedShip[i][1] = column;
                        }
                        break;
                    case "u":
                        for (int i = 0; i < ship.length; i++) {
                            adjustedShip[i][0] = row - i;
                            adjustedShip[i][1] = column;
                        }
                        break;
                }
            }
        }
    }


    // ADMIN
    public static void printBoard(int[][] board) {
        System.out.println("Current Board:");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    System.out.print("  X  ");
                } else {
                    System.out.print("  O  ");
                }
            }
            System.out.println();
        }
    }

    // ADMIN
    public static List<int[][]> generateShips() {
        List<int[][]> generateShips = new ArrayList<>();

        int[][] ship_1 = {{0, 0}, {0, 1}, {0, 2}}; // ──
        int[][] ship_2 = {{0, 0}, {0, 1}, {1, 1}, {2, 1}}; // ┐
        int[][] ship_3 = {{3, 0}, {3, 1}, {3, 2}, {3, 3}}; // ───
        int[][] ship_4 = {{1, 0}, {1, 1}, {1, 2}, {2, 1}}; // ┬
        int[][] ship_5 = {{4, 0}}; // ─
        int[][] ship_6 = {{6, 0}, {6, 1}, {7, 1}, {7, 2}}; // ┐└

        generateShips.add(ship_1);
        generateShips.add(ship_2);
        generateShips.add(ship_3);
        generateShips.add(ship_4);
        generateShips.add(ship_5);
        generateShips.add(ship_6);

        return generateShips;
    }

}
