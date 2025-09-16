import java.util.Random;

public class RandomNumberPractice {
    public static void main(String[] args) {

        int n = 0;
        Random r = new Random();
        int myNumber;
        double myDouble;

        while (n < 10) {
            n++;
//            myNumber = r.nextInt();     // any integer
//            myNumber = r.nextInt(5);     // 0(inclusive) - 5(Exclusive)
//            myNumber = r.nextInt(5, 14);    // 5(incl) - 14(excl)
            myDouble = r.nextDouble();    // double 0(incl) - 1 (excl)
//            System.out.println(myNumber);
            System.out.println(myDouble);
        }
    }
}
