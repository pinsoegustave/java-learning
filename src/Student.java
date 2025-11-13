public class Student {

//    Instance variables
    private String name;
    private int age;

//    Constructor
    public Student (String argName, int argAge) {
        name = argName;
        age = argAge;
    }

    public String toString() {
        return name+" : "+age;
    }
}
