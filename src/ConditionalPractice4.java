public class ConditionalPractice4 {
    public static void main(String[] args) {

        int weight = 230;

        if (weight >= 130 && weight <= 230) {
            System.out.println("You may fly");
        }
        else {
            System.out.println("No fly for you");
        }


//        Example using OR
        int age = 10;

//        Display the price of a movie
        if (age < 12 || age > 50) {
            System.out.println("The price is $7.50");
        }
        else {
            System.out.println("The price is $12.50");
        }

//        Short circuit example
        int x = 15;
        int y = 2;

        if ( y != 0 || x/y > 1) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }

//        Switch statement
        int a = 6;

        switch(a) {
            case 1: {
                System.out.println("Option #1");
                break;
            }
            case 2, 3: {
                System.out.println("Option #2");
                break;
            }
            default: {
                System.out.println("Option #3 running as the default");
            }
        }

    }
}
