import java.util.Scanner;

public class Ass01_RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playerA;
        String playerB;
        String playAgain;

        do {
            // Player A move
            do {
                System.out.print("Player A, make your move (R, P, S): ");
                playerA = scanner.nextLine();
            } while (!playerA.equalsIgnoreCase("R") && !playerA.equalsIgnoreCase("P") && !playerA.equalsIgnoreCase("S"));

            // Player B move
            do {
                System.out.print("Player B, make your move (R, P, S): ");
                playerB = scanner.nextLine();
            } while (!playerB.equalsIgnoreCase("R") && !playerB.equalsIgnoreCase("P") && !playerB.equalsIgnoreCase("S"));

            // Results
            if (playerA.equalsIgnoreCase(playerB)) {
                System.out.println("It's a tie!");
            } else if (playerA.equalsIgnoreCase("R")) {
                if (playerB.equalsIgnoreCase("S")) {
                    System.out.println("Rock breaks Scissors. Player A wins!");
                } else {
                    System.out.println("Paper covers Rock. Player B wins!");
                }
            } else if (playerA.equalsIgnoreCase("P")) {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Paper covers Rock. Player A wins!");
                } else {
                    System.out.println("Scissors cuts Paper. Player B wins!");
                }
            } else {
                if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Scissors cuts Paper. Player A wins!");
                } else {
                    System.out.println("Rock breaks Scissors. Player B wins!");
                }
            }

            // Prompt to play again
            do {
                System.out.println("Would you like to play again? (Y/N): ");
                playAgain = scanner.nextLine();
            } while (!playAgain.equalsIgnoreCase("Y") && !playAgain.equalsIgnoreCase("N"));

        } while (playAgain.equalsIgnoreCase("Y"));

        System.out.println("Thanks for playing!");
    }
}
