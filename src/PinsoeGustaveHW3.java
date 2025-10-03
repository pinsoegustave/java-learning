import java.util.Random;
import java.util.Scanner;

public class PinsoeGustaveHW3 {
    public static void main(String[] args) {

//      Question 1:
        //    Create the startYear Variable
        int startYear = 2005;
        int endYear = startYear + 20;

//        FOR Loop to get us 20 years
        for (int x = startYear; x <= endYear; x++){
//            Condition to print year born in and start at Duquesne
            if (x == 2005) {
                System.out.println("I was born in this year");
            } else if (x == 2025) {
                System.out.println("I started at Duquesne this year");
            } else {
                System.out.println("Year "+ x);
            }
        }

//        Question 2:
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Welcome to the Maths practice!");

        int correctCount = 0;
        int incorrectCount = 0;
        String userInput = "";

        while (!userInput.equals("quit")) {
//            Generate numbers and calculate answer first
            int firstNum = r.nextInt(1, 21);
            int secondNum = r.nextInt(1, 11);
            int correctAnswer = firstNum - secondNum;

//            Asking the question
            System.out.println("What is "+firstNum+" - "+secondNum+" ? ");
            userInput = s.nextLine();

//            Check if the answer is correct
            if (!userInput.equals("quit")) {
                int userAnswer = Integer.parseInt(userInput);
                if (userAnswer == correctAnswer) {
                    System.out.println("That's correct.");
                    correctCount++;
                }
                else {
                    System.out.println("Sorry, the correct answer is "+correctAnswer+".");
                    incorrectCount++;
                }
            }
        }
//            Display the messages
            System.out.println("Number of questions correct: "+correctCount);
            System.out.println("Number of questions incorrect: "+incorrectCount);
            System.out.println("Thanks for playing!!!");
    }

}
