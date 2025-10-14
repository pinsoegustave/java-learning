public class MathClassPractice {
    public static void main(String[] args) {
        int x;
        double y;

//        Absolute value
        x = Math.abs(-4);
        System.out.println(x);

//        Minimum of two values
        x = Math.min(7, 2);
        System.out.println(x);

//        Maximum of two values
        x = Math.max(14, 3);
        System.out.println(x);

//        Round to nearest integer (returns double)
        y = Math.round(6.134534);
        System.out.println(y);

//        Always rounds up
        y = Math.ceil(6.123);
        System.out.println(y);

//        Always rounds down
        y = Math.floor(6.999);
        System.out.println(y);

//        Square root of a number
        y = Math.sqrt(4);
        System.out.println(y);

//        Exponents
        y = Math.pow(2, -3);
        System.out.println(y);

//        Area of circle
        int r = 5;
        double area = Math.PI * Math.pow(r, 2);
        System.out.println(area);
    }
}
