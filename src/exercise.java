public class exercise {
    public static void main(String[] args) {
        int a = 50;

        if ( a > 100) {
            System.out.println("A");
        }
        else if (a > 60) {
            System.out.println("B");
        }
        else {
            System.out.println("C");
            System.out.println("D");
        }

//        second if statement
        if (a % 4 == 0) {
            System.out.println("E");
        } else if (a % 2 == 0) {
            System.out.println("F");
        } else if (a % 3 == 0) {
            System.out.println("G");
        }

    }
}
