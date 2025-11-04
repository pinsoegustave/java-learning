public class StringPractice {
    public static void main(String[] args) {

//        Standard way of creating a string
        String str1 = "Star Wars";

//        Alternate way of creating a string
        String str2 = new String("world");

//        Get the length
        System.out.println(str1.length());

//        Find the position of another string
        System.out.println(str1.indexOf("a"));

//        -1 means "not found"
        System.out.println(str1.indexOf("x"));

//        Get the char at a certain position
        char c = str1.charAt(1);
        System.out.println(c);
        System.out.println(c+1);
        System.out.println((char)(c+1));

//        Get a portion of the string
        System.out.println(str1.substring(3));
        System.out.println(str1.substring(3, 7));     // 7 is excluded

    }
}
