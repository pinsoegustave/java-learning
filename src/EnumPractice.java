import java.util.Scanner;

public class EnumPractice {
    public static void main(String[] args) {
        Flavor f1 = Flavor.RASPBERRY;
        System.out.println(f1);

        if (f1 == Flavor.PISTACCHIO) System.out.println("A");
        else System.out.println("not found");

//        Convert the enum value to a string
        String str = f1.toString();
        System.out.println(str.substring(3));
        System.out.println(str.toLowerCase());

//        Convert an entered string into the enum value
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a flavor: ");
        String input = s.nextLine();
        Flavor enteredFlavor = Flavor.valueOf(input);
        System.out.println("Enum value: "+enteredFlavor);

//        Get an array of enum values
        Flavor[] availableFlavors = Flavor.values();
        for (int i = 0; i < availableFlavors.length; i++) {
            System.out.println(i + ": "+availableFlavors[i]);
        }
    }
}
