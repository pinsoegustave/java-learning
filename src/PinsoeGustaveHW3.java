public class PinsoeGustaveHW3 {
    public static void main(String[] args) {
        //    Create the startYear Variable
        int startYear = 2005;
        int endYear = startYear + 20;

        for (int x = startYear; x <= endYear; x++){
            if (x == 2005) {
                System.out.println("I was born in this year");
            } else if (x == 2025) {
                System.out.println("I started at Duquesne this year");
            } else {
                System.out.println("Year "+ x);
            }
        }
    }

}
