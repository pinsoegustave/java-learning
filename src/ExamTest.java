public class ExamTest {

    public static void main(String[] args) {

            for (int i = 2; i <= 20; i++) {  // Notice: checking all numbers now
                if (i % 2 == 0) {
                    System.out.println(i);// only numbers divisible by 2
                    if (i % 3 == 0) {  // this runs only if number was already divisible by 2
                        System.out.println(i + " (multiple of 3)");
                    }
                }
            }


    }
}
