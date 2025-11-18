import java.io.*;
import java.util.Scanner;

public class FilePractice4 implements Serializable {

    public static void main(String[] args) {
        String fileName =  "roster.dat";
        Student[] roster = new Student[4];
        roster[0] = new Student("Alice", 20);
        roster[1] = new Student("BobB", 32);
        roster[2] = new Student("Carol", 35);
        roster[3] = new Student("Doug", 20);

//        Write the data to the file
        ObjectOutputStream outputStream = null;

        try {
            outputStream = new ObjectOutputStream(new FileOutputStream(fileName));

            for (Student s: roster) {
                outputStream.writeObject(s);
            }
            outputStream.close();
        } catch (Exception e) {
            System.out.println("Error writing to file");
//            e.printStackTrace();
            System.exit(1);
        }

//        Read the file and print the students
        ObjectInputStream inputStream = null;

        try {
            inputStream = new ObjectInputStream(new FileInputStream(fileName));

            while (true) {
                Student nextStudent = (Student)inputStream.readObject();
                System.out.println(nextStudent);
            }
        } catch (EOFException e) {
            System.out.println("Finished reading file");
        }
        catch (Exception e) {
            System.out.println("Error reading the file");
        }

    }
}
