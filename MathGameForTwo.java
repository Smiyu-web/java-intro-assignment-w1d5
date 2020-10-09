import java.util.Scanner;
import java.lang.Math;

public class MathGameForTwo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Hello and welcome to the two player math game, would you like to play? Yes(1) or No(0) : ");
        int answer = input.nextInt();

        System.out.println("Each of you have 3 lives.");

        int playerOneLives = 3;
        int playerTwoLives = 3;

        while (playerOneLives > 0 || playerTwoLives > 0){
        if (answer == 1) {

            byte firstNum = (byte)(Math.random());
            byte secondNum = (byte)(Math.random());

            System.out.println("Player 1: what is " + firstNum + " + " + secondNum);
            byte playerOneAnswer = input.nextByte();
            
            if (playerOneAnswer == (firstNum + secondNum)) {
                System.out.println("Correct!");
                System.out.println("The lives: Player 1: " + playerOneLives + "/3 Player 2: " + playerTwoLives + "/3");
            } else {
                System.out.println("Incorrect! The answer was " + (firstNum + secondNum) + ".");
                playerOneLives--;
                System.out.println("The lives: Player 1: " + playerOneLives + "/3 Player 2: " + playerTwoLives + "/3");
            }

            System.out.println("Player 2: what is " + firstNum + " + " + secondNum);
            byte playerTwoAnswer = input.nextByte();
            
            if (playerTwoAnswer == (firstNum + secondNum)) {
                System.out.println("Correct!");
                System.out.println("The lives: Player 1: " + playerOneLives + "/3 Player 2: " + playerTwoLives + "/3");
            } else {
                System.out.println("Incorrect! The answer was " + (firstNum + secondNum) + ".");
                playerTwoLives--;
                System.out.println("The lives: Player 1: " + playerOneLives + "/3 Player 2: " + playerTwoLives + "/3");
            }

        } else {
            System.out.println("See you!");
            break;
        }
        }
        if (playerOneLives == 0) {
            System.out.println("Player2 won!");
        } else {
            System.out.println("Player1 won!");
        }

    }
}