import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class FilePractice3 {

    public static void main(String[] args) {
        String fileName =  "numbers.txt";
        int[] numbers = new int[4];
        numbers[0] = 10;
        numbers[1] = 24;
        numbers[2] = 35;
        numbers[3] = 42;

//        Write data to the file
        PrintWriter outputStream = null;

        try {
            outputStream = new PrintWriter(new FileOutputStream(fileName));
        } catch (FileNotFoundException e) {
            System.out.println(" Error opening file for write");
        }

        for (int n: numbers) {
            outputStream.println(n);
        }
        outputStream.close();

//        Read the data
        Scanner inputStream = null;

        try {
            inputStream = new Scanner(new FileInputStream(fileName));
        } catch (FileNotFoundException e) {
            System.out.println("Error opening file for read");
            System.exit(1);
        }

        int total = 0;
        int currentNumber;

        while (inputStream.hasNextInt()) {
            currentNumber = inputStream.nextInt();
            total += currentNumber;
        }
        System.out.println("Total = "+ total);


    }
}
