public class Practices {

    public static void main(String[] args) {

        for (int rows = 1; rows <= 5; rows++) {
            System.out.println(rows);
            for (int columns = 1; columns <= 10; columns++) {
                System.out.println(rows+"*"+columns+"="+ rows * columns);
            }
            System.out.println();
        }
    }
}
