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

    }
}
