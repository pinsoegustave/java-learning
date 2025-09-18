public class SelfTest {
    public static void main(String[] args) {

        // Display days and months of 2025

        for (int months = 1; months <= 12; months++) {
            for (int days = 1; days <= 31; days++) {

                if (months == 2 && months > 28) continue;

                if ((months == 4 || months == 6 || months == 9 || months == 11) && days > 30) continue;

                if (days ==4 ) break;
                System.out.println(months +" / "+ days+" / "+ "2025");
            }

        }
    }
}
