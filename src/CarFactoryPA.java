public class CarFactoryPA {

    private Car car1, car2;

//    This build one car per variable
    public void buildCars() {
        car1 = new Car("Nissan", "Rogue", "blue");
        car2 = new Car("Ford", "Escape", "White");
    }

//    Display the cars
    public void displayCars() {
        System.out.println("car1 = "+car1);
        System.out.println("car2 = " + car2);
    }
}
