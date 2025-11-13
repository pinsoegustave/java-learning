import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class FilePractice2 {
    public static void main(String[] args) {

        String fileName = "MySecondFile.txt";
        File myFile = new File(fileName);

//        See if the file exits
        if (myFile.exists()) {
            System.out.println("I found the file");
        }
        else {
            System.out.println("I did not find the file");
            System.out.println("I'm now creating the file");

            try {
                myFile.createNewFile();
            } catch (IOException e) {
                System.out.println("Error creating file");
                System.exit(1);
            }
        }

//        Once we get here, we know there is a file
//        Write date
        PrintWriter outputStream = null;
        try {
            outputStream = new PrintWriter(new FileOutputStream(myFile));
        }
        catch (Exception e) {
            System.out.println("Error opening the file for write");
            System.exit(1);
        }

        outputStream.println("Gustave");
        outputStream.println("bbb");
        outputStream.println("ccccccc");
        outputStream.println("cristiano");

        outputStream.close();

        boolean result = myFile.renameTo(new File("ggg.txt"));
        System.out.println(result);
    }
}
