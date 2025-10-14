public class Car {

//    Static variables
    public static int NUM_CARS = 0;

//    Instance variables
    private String make, model, color;

//    Constructor
    public Car(String argMake, String argModel, String argColor) {
        make = argMake;
        model = argModel;
        color = argColor;

//        Keep track of number of cars created
        NUM_CARS++;
    }

//    Printing
    public String toString() {
        return "Car = "+ make + " - Model = "+ model +" - Color = "+ color;
    }
}
