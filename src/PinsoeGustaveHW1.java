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
//        System.out.println("It is "+ isWinter +" that is winter");Writing & analysis

//        Question 2:
//        int a = 5;
//
//        System.out.println(a);
//        a += 24;
//        System.out.println(a);
//        a /= 4;
//        System.out.println(a);
//        a *= 15;
//        System.out.println(a);
//        a -= 7;
//        System.out.println(a);
//
////        Question 3:
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter your firstName: ");
//        String firstName = s.nextLine();
//        System.out.println("Enter your lastName: ");
//        String lastName = s.nextLine();
//
//        System.out.println("First name: " + firstName);
//        System.out.println("Last name: "+ lastName);
//        System.out.println("Full Name "+ firstName +" "+ lastName);

//        Question 4:
//        Scanner p = new Scanner(System.in);
//        System.out.println("Enter player name: ");
//        String playerName = p.nextLine();
//        System.out.println("Enter total games played: ");
//        String totalGamesPlayed = p.nextLine();
//        int totalGames = Integer.parseInt(totalGamesPlayed);
//        System.out.println("Enter the total goals: ");
//        String totalGoals = p.nextLine();
//        int goals = Integer.parseInt(totalGoals);
//
//        double ppg;
//        ppg = (double) goals / totalGames;
////        System.out.println(playerName + " has a goals per game average of "+ ppg + ", where "+ playerName+" is the player's name and "+ ppg+" is the calculated average.");   // Test with full decimal places(34.8 = 0.23529411764705882)
//        System.out.printf( playerName + " has a goals per game average of %.2f, where "+ playerName+" is the player's name and %.2f is the calculated average.", ppg, ppg);

//        Question 5:
        String numM = "15";
        String numN = "33";

        int numO = 5;
        int numP = 6;

        double numQ = 4;
        double numR = 3;

        int totalA = numO - numP;
        System.out.println(totalA);   //-1

        double totalB = numQ + numP*2;
        System.out.println(totalB);   //40.0

        String totalC = numR + numP + numN;
        System.out.println(totalC);  //3633

        String totalE = numQ + numO + numM;
        System.out.println(totalE);  //4515

        String totalF = numN + numO + numP;
        System.out.println(totalF);  //3356

        int totalG = numP / numO;
        System.out.println(totalG);  //1

        double totalH = numP / numQ;
        System.out.println(totalH);  //1.5

        int i = -9;
        int j = 4;

        int k = i/j;
        System.out.println(k);  //-2

        int m = 6 + i/j;
        System.out.println(m); //4

        String bla = numO + numP + numM + numQ + i;
        System.out.println(bla); //Err

    }
}