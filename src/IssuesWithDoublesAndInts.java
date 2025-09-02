public class IssuesWithDoublesAndInts {
    public static void main(String[] args) {

        // Java uses the integer division
        double minute= 59;
        System.out.println(minute/60.0);

        // More Examples
        double test = 2;
        System.out.println(test);

        int num1 = 3;
        int num2 = 2;
        double sum = num1 + num2;
        System.out.println(sum);   // Java will always return a double when it is assigned on the variable

//        int numA = 3;
//        double numB = 4.2;
//        int numC = numA + numB;
//        System.out.println(numC);   This is an error, you can't store a double into an int datatype

//        int numC = 3;
//        int numD;
//        double numE = numC + numD;
//        System.out.println(numE);  This is an error, numD has not been initialized
        double a = 8.3;
        int b = (int)a;
        System.out.println(b);
    }
}
