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
}
