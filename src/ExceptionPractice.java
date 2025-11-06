public class ExceptionPractice {
    public static void main(String[] args) {

        int x = 5;
        int y = 0;
        int quotient = 0;

        try {
            quotient = x / y;
        } catch (ArithmeticException e) {
            System.out.println("You are diving by zero");
            e.printStackTrace();
        }
    }
}
