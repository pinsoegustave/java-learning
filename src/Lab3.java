import java.util.Scanner;
public class Lab3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
/* -----Question 1 3 sentences explaining why String
comparison
* requires .equals() and how && and || change the result.*/

//        Variable initialization by input from user
        System.out.println("Enter your username: ");
        String username = input.nextLine();
        System.out.println("Enter your password: ");
        String password = input.nextLine();

        if (username.equals("admin") && password.equals("admin123")) {
            System.out.println("Access Granted");
        }
        else if(username.equals("guest") || password.equals("1234")) {
            System.out.println("Limited access granted");
        }
        else  {
            System.out.println("Access Denied");
        }

/* Question 2 print "Stop."
* - "yellow" print "Go."
* - Anything else 3 sentences explaining why switch is
cleaner than
* if-else here and what happens if you forget break.
*
*
*
*
*/
/* Question 3 print "You can watch PG movies only."
* - If 13 print "You can watch PG-13 movies."
* - If age >= 18 OR parent is "yes" print "Not allowed
to watch this movie."
*/
// WRITE YOUR CODE HERE
/* Explanation: Write 2 Weather Clothing Advice
* Ask the user two questions:
* 1. "Is it raining?" ("yes" or "no")
* 2. "Is it cold?" ("yes" or "no")
* Rules:
* - If raining AND cold print "Bring an umbrella, but a
jacket is fine."
* - If NOT raining OR cold t need an umbrella, but
dress warm if it print "Nice weather3 sentences explaining why
multiple && and ||
* conditions are needed and why switch is not a good fit
here.
*
*
*
*/
        input.close();
    }
}