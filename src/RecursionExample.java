public class RecursionExample {

    public int factorialNoRecursion(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public int factorial(int n) {
        if (n==0) return 1;
        else return n * factorial(n-1);
    }

    public int fibonacci(int n) {
//        Base cases
        if (n == 1) return 0;
        if (n == 2) return 1;

//        Recursive case
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public boolean collatz(int n) {
        System.out.println(n);
        if (n == 1) return false;
        if (n % 2 == 0) collatz(n/2);
        else collatz((3*n)+1);

        return false;
    }
}
