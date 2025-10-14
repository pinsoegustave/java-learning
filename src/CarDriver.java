public class CarDriver {

    public static void main(String[] args) {

//        Build the factories
        CarFactoryPA pa = new CarFactoryPA();
        CarFactoryNY ny = new CarFactoryNY();

//        Build cars
        pa.buildCars();
        ny.buildCars();

//        Display the cars
        pa.displayCars();
        System.out.println();
        ny.displayCars();
    }
}
