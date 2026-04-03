package basketballquizgame;

import java.util.Scanner;

public class BasketballQuizGame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int score = 0;

        // Question 1
        System.out.println("1. How many points is a free throw worth?");
        System.out.println("A. 1 B. 7 C. 2 D. 5");
        String answer1 = input.nextLine();

        if (answer1.equalsIgnoreCase("A")) {
            score++;
        }

        // Question 2 
        System.out.println("\n2. What is a double dribble?");
        System.out.println("A. Running B. Passing C. Shooting D. Dribbling by catching or resting the ball in one or both hands");
        String answer2 = input.nextLine();

        if (answer2.equalsIgnoreCase("D")) {
            score++;
        }

        //Question 3
        System.out.println("\n3. What counts as a 3-point shot?");
        System.out.println("A. Shot behind the arc B. Free throw C. layup D. Dunk");
        String answer3 = input.nextLine();

        if (answer3.equalsIgnoreCase("A")) {
            score++;
        }

        //Question 4 
        System.out.println("\n4. What is it called when you take too many steps without dribbling?");
        System.out.println("A. Foul B. Travel C. Block D. Assist");
        String answer4 = input.nextLine();

        if (answer4.equalsIgnoreCase("B")) {
            score++;
        }

        //Question 5
        System.out.println("\n5. How many players are on the court per team?");
        System.out.println("A. 4 B. 8 C. 5 D. 6");
        String answer5 = input.nextLine();

        if (answer5.equalsIgnoreCase("C")) {
            score++;
        }

        //Final Results 
        System.out.println("\n============================");
        System.out.println("QUIZ OVER!");
        System.out.println("Your final score is: " + score + " out of 5");
        System.out.println("============================");

        input.close(); 
    }
}