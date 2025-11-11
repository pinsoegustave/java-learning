public class ArrayPractice {

    public static void main(String[] args) {
//        Create an array of 5 animals
        String[] animals = new String[5];

//        Initialize all the elements
        animals[0] = "Monkeys";
        animals[1] = "Birds";
        animals[2] = "Lions";
        animals[3] = "Tigers";
        animals[4] = "Bears";

//        Display the array
        for (int i=0; i < animals.length; i++) {
            System.out.println(i + ": "+ animals[i]);
        }

//        Try printing the name of the array
        System.out.println(animals);


//        Create another array using the shortcut
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80};

        int total = 0;
        for (int n: numbers) {
            total += n;
        }
        System.out.println("Total ="+ total);

//        Demonstrate how copying arrays is really worse

    }
}
