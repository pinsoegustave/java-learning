import java.util.Scanner;

public class InputPractice {
    public static void main(String[] args) {

//        Create the scanner
        Scanner s = new Scanner(System.in);

//        Get keyboard input
        System.out.println("Please enter your name: ");
        String enteredLine = s.nextLine();

        System.out.println("Please enter your age: ");
        String enteredAge = s.nextLine();
        int age = Integer.parseInt(enteredAge);

//        Display what was entered
        System.out.println("Hello, : "+ enteredLine);
        System.out.println("You are " + age + " years old");
        System.out.println("In 10 years, you will be " + (age + 10));
    }
}
