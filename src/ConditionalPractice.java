import java.util.Scanner;

public class ConditionalPractice {
    public static void main(String[] args) {
//        Prompt the age
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter your age: ");
        String input = s.nextLine();
        int age = Integer.parseInt(input);
        System.out.println("Your age is " + age +".");

//        Display an appropriate message
        if (age > 15) {
            System.out.println("You are eligible for a permit");
//            System.out.println("abc");
        }
        else {
            System.out.println("Sorry, you are not eligible for a permit");
        }

//        Goodbye message
        System.out.println("Goodbye ");
    }
}
