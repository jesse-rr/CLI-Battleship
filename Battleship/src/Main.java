import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner userInput = new Scanner(System.in);
        String choice;

        do {
            ASCII.menus(3);
            choice = userInput.next().trim().toLowerCase();

            switch (choice) {
                case "p":
                    startGame(userInput);
                    break;
                case "h":
                    defaultChoice(userInput, false);
                    break;
                default:
                    defaultChoice(userInput, true);
                    break;
            }
        } while (!choice.equals("x"));
        closeApplication(false, userInput);
    }

    private static void defaultChoice(Scanner userInput, boolean choice) {
        String goBack;
        if (choice) {
            do {
                ASCII.defaultChoice();
                goBack = userInput.next().toLowerCase();
            } while (!goBack.equals("x"));
        } else {
            do {
                ASCII.showHelpMenu();
                goBack = userInput.next().toLowerCase();
            } while (!goBack.equals("x"));
        }
    }

    private static void closeApplication(boolean isForfeit, Scanner userInput) throws InterruptedException {
        if (isForfeit) {
            System.out.print("Are you sure Y/N: ");
            String choice = userInput.next().toLowerCase();
            if (choice.equals("y")) {
                ASCII.thanksForPlaying();
                System.exit(0);
            }
        } else {
            for (int i = 0; i < 3; i++) {
                System.out.print("Closing game\r");
                Thread.sleep(220);
                System.out.print("Closing game.\r");
                Thread.sleep(330);
                System.out.print("Closing game..\r");
                Thread.sleep(400);
                System.out.print("Closing game...\r");
                Thread.sleep(350);
            }
            ASCII.thanksForPlaying();
            System.exit(0);
        }

    }

    private static void startGame(Scanner userInput) throws InterruptedException {
        String option;
        do {
            ASCII.generateBoard();
            ASCII.menus(1);

            option = userInput.next().toLowerCase();

            switch (option) {
                case "s":
                    Attacks.specialAbilities(userInput);
                    break;
                case "a":
                    Attacks.attack(userInput);
                    break;
                case "h":
                    defaultChoice(userInput, false);
                    break;
            }
        } while (!option.equals("f"));
        closeApplication(true, userInput);
    }
}
