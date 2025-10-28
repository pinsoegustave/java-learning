import java.lang.reflect.Array;
import java.util.Arrays;

public class SortingPratice {
    public static void main(String[] args) {

//        Create an array of names
        String[] names = {"George", "Barbara", "Zelda", "Jason"};

//        Display the array
        for (int i=0; i < names.length; i++) {
            System.out.println(names[i]);
        }
//        Sort the array
        Arrays.sort(names);

//        Display the array
        System.out.println();

        for (int i=0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
