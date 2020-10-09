// michaela and miyu

import java.util.Scanner;
import java.lang.Math;

public class MathGameForTwo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Hello and welcome to the two player math game, would you like to play? y or n : ");
        String answer = input.next();


        int playerOneLives = 3;
        int playerTwoLives = 3;


        if (answer.equals("y")) {
          System.out.println("Each of you have 3 lives.");

            while (playerOneLives > 0 && playerTwoLives > 0){
                int firstNum = (int)(Math.random() * 100);
                int secondNum = (int)(Math.random() * 100);

                System.out.println("Player 1: what is " + firstNum + " + " + secondNum);
                int playerOneAnswer = input.nextInt();
                
                if (playerOneAnswer == (firstNum + secondNum)) {
                    System.out.println("Correct!");
                    System.out.println("The lives: Player 1: " + playerOneLives + "/3 Player 2: " + playerTwoLives + "/3");
                } else {
                    System.out.println("Incorrect! The answer was " + (firstNum + secondNum) + ".");
                    playerOneLives--;
                    System.out.println("The lives: Player 1: " + playerOneLives + "/3 Player 2: " + playerTwoLives + "/3");
                }

                int thirdNum = (int)(Math.random() * 100);
                int forthNum = (int)(Math.random() * 100);

                System.out.println("Player 2: what is " + thirdNum + " + " + forthNum);
                int playerTwoAnswer = input.nextInt();
                
                if (playerTwoAnswer == (thirdNum + forthNum)) {
                    System.out.println("Correct!");
                    System.out.println("The lives: Player 1: " + playerOneLives + "/3 Player 2: " + playerTwoLives + "/3");
                } else {
                    System.out.println("Incorrect! The answer was " + (thirdNum + forthNum) + ".");
                    playerTwoLives--;
                    System.out.println("The lives: Player 1: " + playerOneLives + "/3 Player 2: " + playerTwoLives + "/3");
                }   
            }

        } else {
            System.out.println("See you!");
        }

        if (playerOneLives == 0) {
            System.out.println("Player2 won!");
        } else if (playerTwoLives == 0) {
            System.out.println("Player1 won!");
        } 
    }
}