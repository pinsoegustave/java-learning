import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
    public static void main(String[] args) {

//        Initialize
        Random r = new Random();
        int myNumber = r.nextInt(1, 101);
        System.out.println("I'm thinking of an integer from 1 - 100");
        int guess;
        String input;
        boolean continueAsking = true;
        Scanner s = new Scanner(System.in);

//        Main game loop
        while(continueAsking) {
            // Prompt for a guess
            System.out.println("Enter your guess: ");
            input = s.nextLine();
            guess = Integer.parseInt(input);

//            Check the guess
            if (guess == myNumber){
//                Correct
                System.out.println("You win");
                continueAsking = false;
            }
            else if (guess < myNumber){
//                Guess is too low
                System.out.println("Too low");
            }
            else {
//                Guess is too high
                System.out.println("Too high");
            }
        }
        System.out.println("Thanks for playing");
    }
}
