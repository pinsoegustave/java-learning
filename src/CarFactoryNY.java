public class CarFactoryNY {

    private Car car1, car2, car3;

    //    This build one car per variable
    public void buildCars() {
        car1 = new Car("Rolls Royce", "Phantom", "silver");
        car2 = new Car("VW", "Passat", "White");
        car3 = new Car("Jeep", "Renegade", "silver");
    }

    //    Display the cars
    public void displayCars() {
        System.out.println("NY Factory: ");
        System.out.println("car1 = "+car1);
        System.out.println("car2 = " + car2);
        System.out.println("car3 = "+ car3);
    }
}
