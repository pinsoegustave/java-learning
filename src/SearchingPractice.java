public class SearchingPractice {
    public static void main(String[] args) {
//        Create arrays
        int[] numbers = {89, 6, 47, 55, 2, 144};
        int desiredNumber = 55;

//        Linear search
        int foundPos = -1;
        for (int i=0; i < numbers.length; i++) {
            if (numbers[i] == desiredNumber) {
                foundPos = i;
                break;
            }
        }

//        Once we get here, foundPos will be either the index where we found our number or -1 (not found)
        if (foundPos == -1) {
            System.out.println("not found");
        }
        else {
            System.out.println("Found at pos"+ foundPos);
        }
    }
}
