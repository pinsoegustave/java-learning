public class OperatorsPractice {
    public static void main(String[] args) {

        // Demonstrate PEMDAS
        int x = 3 + 4 * 5;
//        System.out.println(x);
//
//        // String concatenation
//        String myString =  "abc" + "def";
//        System.out.println(myString);
//
//        String str1 = "abc";
//        String str2 = "xyz";
//        String str3 = str1 + str2;
//        System.out.println(str3);

        // Combine operators
//        x = 10;
//        x += 4;  // This adds 4 to x
//        System.out.println(x);
//        x++;   // This adds 1 to x
//        System.out.println(x);
//        x *= 6;
//        System.out.println(x);
//        System.out.println(9 % 4);

        // Longer Example: Sample quiz question
        int a = 3;
        int b = 4, c = 5;

        a += 2;  // a=5
        b -= c;  // b=-1
        c *= 3;  // c=15
        a = a + c; // a=20
        c *= 4;  // c= 60
        a++;  // a=21
        b--;  // -2
        System.out.println(a+b+c);   //79

    }
}
