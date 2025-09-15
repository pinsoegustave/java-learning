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

//        Conditions to give a user access permissions.
        if (username.equals("admin") && password.equals("admin123")) {   // Used .equals() to string because it checks the values without going checking the memory reference whereas == checks(that's why we can't use it on strings). && operator will help us to check if both values are true, inorder for our condition to run perfect.
            System.out.println("Access Granted");
        }
        else if(username.equals("guest") || password.equals("1234")) {   // Used || operator at least to check between two values if one is correct we can give access to the user with limited access
            System.out.println("Limited access granted");
        }
        else  {
            System.out.println("Access Denied");
        }

        /* Question 2 print "Stop."
        * - "yellow" print "Go."
        * - Anything else 3 sentences explaining why switch is
                cleaner than
        * if-else here and what happens if you forget break. */

        System.out.println("Enter the traffic light color: ");
        String color = input.nextLine();

        switch (color) {
            case "red":
                System.out.println("Stop.");
                break;
            case  "yellow":
                System.out.println("Go");
                break;
            default:
                System.out.println("Enter the traffic light color");
        }
//        - Switch can run many conditions testing on one value
//        - Switch provides more readable code than if-else statements
//        - When you forget break, the computer continues to test on other conditions and it runs all other remaining cases.

        /* Question 3
                print "You can watch PG movies only."
                * - If 13 print "You can watch PG-13 movies."
                * - If age >= 18 OR parent is "yes" print "Not allowed
                            to watch this movie." */
        // WRITE YOUR CODE HERE
        System.out.println("Enter age: ");
        String getAge = input.nextLine();
        int age = Integer.parseInt(getAge);
        System.out.println("Enter whether they have a parent with them");
        String withParent = input.nextLine();

        if (age < 13) {
            System.out.println("You are allowed to watch this movie alone.");
        } else if (age == 13) {
            System.out.println("You can watch PG-13 movies.");
        } else if (age >= 18 || withParent.equals("yes")) {
            System.out.println("Not allowed to watch this movie.");
        } else {
            System.out.println("First grow");
        }




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
                                here.*/
        System.out.println("Is it raining?");
        String rainAnswer = input.nextLine();
        System.out.println("Is it cold? ");
        String coldAnswer = input.nextLine();

        if (rainAnswer.equals("yes") && coldAnswer.equals("yes")) {
            System.out.println("Bring an umbrella, but a jacket is fine.");
        } else if (rainAnswer.equals("no") || coldAnswer.equals("no")) {
            System.out.println("You don't need an umbrella");
        }
        else  {
            System.out.println("Nice weather, dress warm");
        }

//        Switch statement can't be a good fit because we have to test between two values
//        We use multiple && and || operators because we need two check two conditions to get the value.

        input.close();
    }
}