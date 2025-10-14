public class Car {

//    Instance variables
    private String make, model, color;

//    Constructor
    public Car(String argMake, String argModel, String argColor) {
        make = argMake;
        model = argModel;
        color = argColor;
    }

//    Printing
    public String toString() {
        return "Car = "+ make + " - Model = "+ model +" - Color = "+ color;
    }
}
