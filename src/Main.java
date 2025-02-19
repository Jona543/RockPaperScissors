import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
        while(true) {
            String[] rps = {"Rock", "Paper", "Scissors"};
            String computerMove = rps[new Random().nextInt(rps.length)];

            String playerMove;

            while (true) {
                System.out.println("Please enter your move (rock, paper or scissors)");
                playerMove = scanner.nextLine();
                if (playerMove.equalsIgnoreCase("rock") || playerMove.equalsIgnoreCase("paper") || playerMove.equalsIgnoreCase("scissors")) {
                    break;
                }
                System.out.println(playerMove + " is not valid");
            }

            System.out.println("Computer move is: " + computerMove);

            if (playerMove.equalsIgnoreCase(computerMove)) {
                System.out.println("Game was a tie");
            } else if (playerMove.equalsIgnoreCase("rock")) {
                if (computerMove.equalsIgnoreCase("paper")) {
                    System.out.println("You lose");
                } else if (computerMove.equalsIgnoreCase("scissors")) {
                    System.out.println("You win");
                }
            } else if (playerMove.equalsIgnoreCase("paper")) {
                if (computerMove.equalsIgnoreCase("rock")) {
                    System.out.println("You win");
                } else if (computerMove.equalsIgnoreCase("scissors")) {
                    System.out.println("You lose");
                }
            } else if (playerMove.equalsIgnoreCase("scissors")) {
                if (computerMove.equalsIgnoreCase("paper")) {
                    System.out.println("You win");
                } else if (computerMove.equalsIgnoreCase("rock")) {
                    System.out.println("You lose");
                }
            }

            System.out.println("Play again? (Y or N)");
            String playAgain = scanner.nextLine();

            if (!playAgain.equalsIgnoreCase("Y")) {
                System.out.println("Game over");
                break;
            }
        }
    }
}
