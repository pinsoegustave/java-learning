import java.util.Scanner;

public class Whileloop {
    public static void main(String[] args) {
//        Initialize
        Scanner s = new Scanner(System.in);
        String enteredPassword;
        String password = "12345";
        boolean passwordIsCorrect = false;
        int numTries = 0;

//        Main loop
        while (passwordIsCorrect == false && numTries < 3) {
//            Prompt for the password
        System.out.println("Enter the password: ");
        enteredPassword = s.nextLine();
        numTries++;

//        Check the password
            if (enteredPassword.equals(password)) {
                passwordIsCorrect = true;
            }
            else {
                System.out.println("Incorrect. Try Again");
            }
        }  // End of while loop

        System.out.println("Done");

//        Break and contine example
        int n = 0;
        while (n < 10) {
            n++;
//            if (n == 3) break;
            if (n == 3) continue;
            System.out.println(n);
        }

    }
}
