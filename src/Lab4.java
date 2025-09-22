
import java.util.Scanner;
import java.util.Random;

public class Lab4 {
    public static void main(String[] args) {
/* ------------------- Question 1 -------------------
Question:
Use a for-loop to print all numbers from 1 to 30,
BUT skip numbers that are multiples of 4.
When you reach 25, stop the loop completely.
(Hint: Use 'continue' to skip and 'break' to stop).
*/
// WRITE CODE HERE
        /* EXPLANATION:
         *Why did you choose to use 'continue' and 'break' the way you did?
         *What happens in your code when the loop hits those points?*/

        for (int a = 1; a < 31; a++) {

            if (a % 4 == 0) continue;  // Used continue to skip whenever the number is a multiple of 4
            System.out.println(a);

//            Condition in if-clause to check when we reach 25 and break the loop
            if (a == 25) break;
        }
/* ------------------- Question 2 -------------------
Question:
Use nested for-loops to print a multiplication table from 1 to 5.
Each row should show the results for one number.
Example (first two rows):
1 2 3 4 5
2 4 6 8 10
...
(Hint: Outer loop controls the row, inner loop controls the column).
You can use System.out.print() inside the inner loop to keep numbers on
the same line,
and System.out.println() after the inner loop to move to the next row.
*/
// WRITE CODE HERE
        /* EXPLANATION:
         *Why did you set the outer loop and inner loop to run the way they do?
         *What would change if you swapped their ranges or order?  */

//        Outer loop helps to set the numbers of rows.
        for (int x = 1; x <= 2; x++) {

//            Inner loop helps to control the columns needed.
            for (int y = 1; y <=5; y++) {

//                Output of multiplication
                System.out.print(x * y +" ");
            }
//            output to break the line for the first row
                System.out.println(" ");
        }
//        If I switched the rows with column, I would have a two column output with five rows

/* ------------------- Question 3 -------------------
Question:
Create a random number guessing game.
The computer picks a number between 1 and 20.
The user has exactly 5 tries to guess it.
After 5 tries, the program should stop even if the guess is wrong.
OUTPUT:
- If the guess is correct, print: "You got it! The number was X" (replace
X with the number).
- else if the guess is too low, print: "Too low."
- else, print: "Too high."
(Hint: Use a while loop with a counter to track the number of tries and
check if the number is correct.).
*/
// WRITE CODE HERE
/* EXPLANATION:
*Why did you organize your loop this way?
*How does your setup make sure the game ends after the correct number of
tries?*/

        Random r = new Random();
        Scanner x = new Scanner(System.in);

        int guessNumber = r.nextInt(20) + 1;
        int numTries = 0;
        boolean correctGuess = false;

        while (numTries < 5) {
            System.out.println("Enter the number you guess: ");
            String userInput = x.nextLine();
            int guessUser = Integer.parseInt(userInput);

            numTries++;

            if (guessUser == guessNumber) {
                System.out.println("You got it! The number was "+ guessNumber);
                correctGuess = true;
                break;
            }
            else if (guessUser < guessNumber) {
                System.out.println("Too low.");
            } else {
                System.out.println("Too high.");
            }
        }
    }
}
