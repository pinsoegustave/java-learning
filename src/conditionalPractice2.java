import java.util.Scanner;

public class conditionalPractice2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter your name: ");
        String name = s.nextLine();

//        if (name.equals("Bob Ross")) {
        if (name.equalsIgnoreCase("Bob Ross")) {
            System.out.println("Can you paint me some happy clouds?");
        }
        else {
            System.out.println("I don't know you");
        }
    }
}
