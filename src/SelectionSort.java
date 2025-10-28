public class SelectionSort {
    public static void main(String[] args) {

        int smallestIndex, temp;
        int[] numbers = { 56, 489, 21, 5, 77, 981, 44, 67, 81, 29 };

//        Outer loop. These are the positions we are trying to fill on each pass
        for (int posToFill = 0; posToFill < numbers.length; posToFill++) {

//            Initially, the smallest is posToFill
            smallestIndex = posToFill;

//            Inner loop. Look for the smallest number
            for (int i = posToFill; i < numbers.length; i++) {
//                Compare the value at [i] with the value at [smallestIndex]
                if (numbers[i] < numbers[smallestIndex]) {
//                    We found a smaller, save this new value's index
                    smallestIndex = i;
                }
            }
//            End of inner loop
//            Once we get there, the smallestIndex is pointing at the number that belongs in posToFill. Swap
            temp = numbers[posToFill];
            numbers[posToFill] = numbers[smallestIndex];
            numbers[smallestIndex] = temp;

        }
//        End of outer loop
//        Display the output
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
