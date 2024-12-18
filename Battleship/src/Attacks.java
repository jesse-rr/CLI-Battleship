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

    public static List<int[][]> generateShips() {
        List<int[][]> generateShips = new ArrayList<>();

        int[][] ship_1 = {{0, 0}, {0, 1}, {0, 2}};
        int[][] ship_2 = {{1, 0}, {1, 1}, {2, 1}, {3, 1}, {4, 1}};
        int[][] ship_3 = {{3, 3}, {3, 4}, {4, 4}, {5, 4}};
        int[][] ship_4 = {{4, 0}, {4, 1}};
        int[][] ship_5 = {{5, 0}};
        int[][] ship_6 = {{6, 0}, {6, 1}, {6, 2}, {6, 3}, {7, 2}, {7, 3}, {7, 4}};

        generateShips.add(ship_1);
        generateShips.add(ship_2);
        generateShips.add(ship_3);
        generateShips.add(ship_4);
        generateShips.add(ship_5);
        generateShips.add(ship_6);
        return generateShips;
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
                String choice = userInput.next().toUpperCase();
                char column = choice.charAt(0);
                int row = Integer.parseInt(choice.substring(1)) - 1;
                if (row < 0 || row >= 10 || letters.indexOf(column) == -1) {
                    System.out.println("Invalid input, please try again.");
                    continue;
                }
                System.out.printf("Orientation (horizontally/vertically) - Ship %s/6:  ", sum);
                String orientation = userInput.next().toLowerCase();

                int columnIndex = letters.indexOf(column);
                if (isValidPlacement(ship, playerBoard1, row, columnIndex, orientation)) {
                    placeShip(ship, playerBoard1, row, columnIndex, orientation);
                    isValidPlacement = true;
                    sum++;
                } else {
                    System.out.println("Invalid Placement, try again...");
                }
            }
        }
    }

    public static boolean isValidPlacement(int[][] ship, int[][] board, int row, int column, String orientation) {
        for (int[] part : ship) {
            int dx = part[0];
            int dy = part[1];
            int newX = row + (orientation.equals("v") ? dy : dx);
            int newY = column + (orientation.equals("v") ? dx : dy);

            if (newX < 0 || newX >= 10 || newY < 0 || newY >= 10) {
                return false;
            }
            if (board[newX][newY] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void placeShip(int[][] ship, int[][] board, int row, int column, String orientation) {
        for (int[] part : ship) {
            int dx = part[0];
            int dy = part[1];
            int newX = row + (orientation.equals("v") ? dy : dx);
            int newY = column + (orientation.equals("v") ? dx : dy);

            board[newX][newY] = 1;
        }
        printBoard(board);
    }

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
}
