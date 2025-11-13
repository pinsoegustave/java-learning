import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class FilePractice {

    public static void main(String[] args) {
//        Create a variable that will connect to our text file (output stream)
        PrintWriter outputStream = null;

//        Open the file
//        try {
//            outputStream = new PrintWriter(new FileOutputStream("MyFirstFile.txt"));
//        } catch (FileNotFoundException e) {
//            System.out.println("Error opening file for write");
//            System.exit(1);
//        }

//        Write to the file
//        outputStream.println("Alice");
//        outputStream.println("BoboQ");
//
//        Close the file
//        outputStream.close();

//        Read from the file
        Scanner inputStream = null;

        try {
            inputStream = new Scanner(new FileInputStream("MyFirstFile.txt"));

        } catch (FileNotFoundException e) {
            System.out.println("Error opening file for read");
            System.exit(1);
        }

        String input;
        while (inputStream.hasNextLine()) {
            input = inputStream.nextLine();
            System.out.println(input);
        }

        inputStream.close();

    }
}
