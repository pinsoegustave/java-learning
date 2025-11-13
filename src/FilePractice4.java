import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class FilePractice4 {

    public static void main(String[] args) {
        String fileName =  "roster.txt";
        Student[] roster = new Student[4];
        roster[0] = new Student("Alice", 20);
        roster[1] = new Student("BobB", 32);
        roster[2] = new Student("Carol", 35);
        roster[3] = new Student("Doug", 20);

//        Write data to the file
        PrintWriter outputStream = null;

        try {
            outputStream = new PrintWriter(new FileOutputStream(fileName));
        } catch (FileNotFoundException e) {
            System.out.println(" Error opening file for write");
        }

        for (Student n: roster) {
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

        int currentNumber;

        while (inputStream.hasNextInt()) {
            currentNumber = inputStream.nextInt();

        }
        System.out.println("Total = "+ );


    }
}
