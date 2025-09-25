import java.util.Scanner;

public class PinsoeGustaveHW2 {
    public static void main(String[] args) {

//        Question 1
//        Create scanner
        Scanner s = new Scanner(System.in);

//        Get keyboard input
        System.out.println("Please enter your grade below: ");
        String getGrade = s.nextLine();
        int grade = Integer.parseInt(getGrade);

//        Display the letter for the grade
        if (grade >= 90 ) {
            System.out.println("A");
        } else if (grade >= 80) {
            System.out.println("B");
        } else if (grade >= 70) {
            System.out.println("C");
        } else if (grade >= 65) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

//        Question 2
//        Get age from keyboard input
        System.out.println("Enter your age: ");
        String getAge = s.nextLine();
        int age = Integer.parseInt(getAge);

//        Condition to check Secret club #1
        if (age >= 26 || age % 3 == 0) {
            System.out.println("You may enter Secret Club #1");
        }
        else {
            System.out.println("Sorry, you cannot enter Secret club");
        }
//         Condition to check Secret club #2
        if (age >= 26 && age % 3 == 0) {
            System.out.println("You may enter Secret Club #2");
        }
        else {
            System.out.println("Sorry, you cannot enter the Secret Club");
        }
    }
}
