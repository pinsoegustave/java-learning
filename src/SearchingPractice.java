public class SearchingPractice {
    public static void main(String[] args) {
//        Create arrays
        int[] numbers = {89, 6, 47, 55, 2, 144};
        int desiredNumber = 55;
        String[][]  books= {{"b1", "b2", "b3"}, {"b4", "b5", "b6"},{"b7", "b8", "b9"}};
        String desiredBook  = "b3";

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

//        Searching a two-dimensional array
        int shelfIndex = -1;
        int bookIndex = -1;

//        Loop through the shelves
        for (int s = 0; s < 3; s++) {
//
            for (int b=0; b < 3; b++) {
//                See if this is the book
                if (books[s][b].equals(desiredBook)) {
                    shelfIndex = s;
                    bookIndex = b;
                    break;
                }
            }
        }

        if (shelfIndex == -1) {
            System.out.println("Book not found");
        }
        else {
            System.out.println("Book found ");
            System.out.println("Shelf: "+ shelfIndex);
            System.out.println("Book #:"+ bookIndex);
        }
    }
}
