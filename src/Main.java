import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            String player1 = "";
            String player2 = "";
            boolean done = false;
            boolean gameOver = false;
            String gameIsOver = "";
            do {
                do {
                    System.out.println("Player 1, your move. (R, P or S uppercase or lowercase) ");
                    Scanner input = new Scanner(System.in);
                    player1 = input.nextLine();
                    if (player1.equals("R") || player1.equals("P") || player1.equals("S") || player1.equals("r") || player1.equals("p") || player1.equals("s")) {
                        done = true;
                    } else {
                        System.out.println("Please enter a valid move. (R, P or S uppercase or lowercase) )");
                    }
                } while (!done);
                done = false;
                do {
                    System.out.println("Player 2, your move. (R, P or S uppercase or lowercase) ");
                    Scanner input2 = new Scanner(System.in);
                    player2 = input2.nextLine();
                    if (player2.equals("R") || player2.equals("P") || player2.equals("S") || player2.equals("r") || player2.equals("p") || player2.equals("s")) {
                        done = true;
                    } else {
                        System.out.println("Please enter a valid move. (R, P or S uppercase or lowercase) )");
                    }
                } while (!done);
                done = false;
                if (player1.equals("r")){
                    player1 = "R";
                }
                if (player1.equals("s")){
                    player1 = "S";
                }
                if (player1.equals("p")){
                    player1 = "P";
                }
                if (player2.equals("r")){
                    player2 = "R";
                }
                if (player2.equals("p")){
                    player2 = "P";
                }
                if (player2.equals("s")) {
                    player2 = "S";
                }
                if (player1.equals("R") && player2.equals("S")) {
                    System.out.println("Rock breaks scissors.");
                    System.out.println("Player 1 wins");
                }
                if (player1.equals("S") && player2.equals("R")) {
                    System.out.println("Rock breaks scissors.");
                    System.out.println("Player 2 wins");
                }
                if (player1.equals("R") && player2.equals("P")) {
                    System.out.println("Paper covers rock.");
                    System.out.println("Player 2 wins");
                }
                if (player1.equals("P") && player2.equals("R")) {
                    System.out.println("Paper covers rock.");
                    System.out.println("Player 1 wins");
                }
                if (player1.equals("S") && player2.equals("P")) {
                    System.out.println("Scissors cuts paper.");
                    System.out.println("Player 1 wins");
                }
                if (player1.equals("P") && player2.equals("S")) {
                    System.out.println("Scissors cuts paper.");
                    System.out.println("Player 2 wins");
                }
                if (player1.equals("R") && player2.equals("R")) {
                    System.out.println("Rock vs Rock");
                    System.out.println("The game is a tie.");
                }
                if (player1.equals("S") && player2.equals("S")){
                    System.out.println("Scissors vs Scissors");
                    System.out.println("The game is a tie.");
                }
                if (player1.equals("P") && player2.equals("P")){
                    System.out.println("Paper vs Paper");
                    System.out.println("The game is a tie.");
                }
                System.out.println("Would you like to play again? (Y/N)");
                Scanner over = new Scanner(System.in);
                gameIsOver = over.nextLine();
                if (gameIsOver.equals("Y")) {
                    gameOver = false;
                    System.out.println("Restarting game... ");
                } else if (gameIsOver.equals("N")) {
                    gameOver = true;
                }

            }while (!gameOver);
    }
}