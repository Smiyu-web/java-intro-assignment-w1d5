import java.util.Scanner;
import java.lang.Math;

public class MathGame {

    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Hello and welcome to the two player math game, would you like to play? Yes or no?");
        String answer = input.next();

        int PlayerOneLives = 3;
        int PlayerTwoLives = 3;

        while (PlayerOneLives > 0 || PlayerTwoLives > 3) {

        if (answer != "yes") { 
            System.out.println("Ok, thank you, bye.");
            break;
        } else {
            System.out.println("Each of you have 3 lives.");

            byte firstNum = (byte)(Math.random());
            byte secondNum = (byte)(Math.random());

            System.out.println("What is " + firstNum + " + " + secondNum);
            short playerOneAnswer = input.nextShort();

            if (playerOneAnswer == (firstNum + secondNum)) {
                System.out.println("Correct");
                System.out.println("The lives: Player 1: " + PlayerOneLives + "/3 Player 2: " + PlayerTwoLives + "/3");
            } else {
                System.out.println("Incorrect! The answer was " + (firstNum + secondNum));
                PlayerOneLives--;
                System.out.println("The lives: Player 1: " + PlayerOneLives + "/3 Player 2: " + PlayerTwoLives + "/3");
            }

            System.out.println("What is " + firstNum + " + " + secondNum);
            short playerTwoAnswer = input.nextShort();

            if (playerTwoAnswer == (firstNum + secondNum)) {
                System.out.println("Correct");
                System.out.println("The lives: Player 1: " + PlayerOneLives + "/3 Player 2: " + PlayerTwoLives + "/3");
            } else {
                System.out.println("Incorrect! The answer was " + (firstNum + secondNum));
                PlayerTwoLives--;
                System.out.println("The lives: Player 1: " + PlayerOneLives + "/3 Player 2: " + PlayerTwoLives + "/3");
            }
 

        }
    }



    }
}