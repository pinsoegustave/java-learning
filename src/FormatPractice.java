import java.util.Arrays;

public class FormatPractice {
    public static void main(String[] args) {


        System.out.println("12345678901234567890");
        double a = 1.2;
        int b = 7;
        double c = 1235.245235;
        double d = 987654321.123456789;
        String e = "Hi there";

//        System.out.printf("%6.2f", b);   // You can't format an integer/sth that can't be changed
        System.out.printf("%6.2f\n", c);  // You can't format an integer/sth that can't be changed
        System.out.printf("I have %.2f in the bank\n", c);
        System.out.printf("%5d\n", b);
        System.out.printf("%16.3e\n", c);
        System.out.printf("%,16.2f\n", d);
        System.out.printf("%12s", e);
    }
}
