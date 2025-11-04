import java.util.Arrays;

public class Practices {

    public static void main(String[] args) {

        int[] numbers = { 56, 489, 21, 5, 77, 981, 44, 67, 81, 29 };

        for (int i = 0; i < numbers.length; i++) {

            int minIndex = i;

            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }

//            Swap the found minimum element with first element of the array
            int temp = numbers[minIndex];
            numbers[minIndex] = numbers[i];
            numbers[i] = temp;
        }

        for (int x : numbers) {
            System.out.println(x);
        }

    }
}
