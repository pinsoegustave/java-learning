public class PinsoeGustaveHW3 {
    public static void main(String[] args) {

//      Question 1:
        //    Create the startYear Variable
        int startYear = 2005;
        int endYear = startYear + 20;

//        FOR Loop to get us 20 years
        for (int x = startYear; x <= endYear; x++){
//            Condition to print year born in and start at Duquesne
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
