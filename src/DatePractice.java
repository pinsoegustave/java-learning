import java.util.Calendar;
import java.util.Date;

public class DatePractice {
    public static void main(String[] args) {
        Date myDate = new Date();
        System.out.println(myDate);

//        New and improved
        Calendar c = Calendar.getInstance();
        c.set(2025, 11, 10, 54, 30);

        Date cDate = c.getTime();
        System.out.println(cDate);
    }
}
