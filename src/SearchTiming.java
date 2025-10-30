import java.util.Arrays;
import java.util.Random;

public class SearchTiming {
    public static void main(String[] args) {

        int desiredNumber = 783487646;
//        Generate an array of random integers
        long startTime = System.currentTimeMillis();
        Random r = new Random();
        int numItems = 10;
        int[] numbers = new int[numItems];

        for (int i = 0; i < numItems; i++) {
            numbers[i] = r.nextInt(100000000);
        }

        long endTime = System.currentTimeMillis();
        numbers[0] = desiredNumber;
        System.out.println("Generate Array: " + (endTime - startTime));

//        Sort the array
        startTime = System.currentTimeMillis();
        Arrays.sort(numbers);

//        Print
        for (int n : numbers) {
            System.out.println(n);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Sort Array: " + (endTime - startTime));

//        Linear search
        startTime = System.currentTimeMillis();
        int numComparisons = 0;
        for (int i = 0; i < numItems; i++) {
            numComparisons++;
            if (numbers[i] == desiredNumber) {
                System.out.println("Linear search: Found at positon: "+ i);
                break;
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println("Linear search Time: "+ (endTime - startTime));
        System.out.println("Num comparisons: "+ numComparisons);

//        Binary search
        startTime = System.currentTimeMillis();
        numComparisons = 0;

        int lower = 0;
        int upper = numItems - 1;
        int middle;
        while (lower <= upper) {
//            Calculate the middle position
            middle = (upper+lower)/2;

//            Check the value at the middle position
            numComparisons++;
            if (numbers[middle] == desiredNumber) {
                System.out.println("Binary search: Found at pos"+ middle);
                break;
            }
            else if (desiredNumber < numbers[middle]) {
                upper = middle - 1;
            }
            else {  // desiredNumber > numbers[middle]
                lower = middle + 1;
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println("Binary search time: "+ (endTime - startTime));
        System.out.println("Num comparisons: "+ numComparisons);
    }
}
