import java.util.Scanner;

public class PinsoeGustaveHW1 {
    public static void main(String[] args) {

//        Question 1:
//        Variable declaration
//        String firstName;
//        String lastName;
//        int age;
//        String favoriteFood;
//        double costOfSoda;
//        boolean isWinter;
//
////        Variable initialization
//        firstName = "Pinsoe";
//        lastName = "Gustave";
//        age = 19;
//        favoriteFood = "Burger";
//        costOfSoda = 8.99;
//        isWinter = false;
//
////        Printing out the message
//        System.out.print("My name is "+ firstName+" "+lastName +"and I am "+age+ " years old \n");
//        System.out.println(favoriteFood+ " is my favorite food.");
//        System.out.println("It is "+ isWinter +" that is winter");

//        Question 2:
        int a = 5;

        System.out.println(a);
        a += 24;
        System.out.println(a);
        a /= 4;
        System.out.println(a);
        a *= 15;
        System.out.println(a);
        a -= 7;
        System.out.println(a);

//        Question 3:
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your firstName: ");
        String firstName = s.nextLine();
        System.out.println("Enter your lastName: ");
        String lastName = s.nextLine();

        System.out.println("First name: " + firstName);
        System.out.println("Last name: "+ lastName);
        System.out.println("Full Name "+ firstName +" "+ lastName);

    }
}