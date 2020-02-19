package AbstractCar;

public class CarDriver {
    public static void main(String[] args) {
        abstractCar car = new Nissan();
        System.out.println("Name " + car.make());
        System.out.println("Model " + car.model());
        System.out.println("Year " + car.year());
        System.out.println("Doors " + car.doorNumber());
        System.out.println("Engine " + car.engineSize());
        System.out.println("Top MPH " + car.topMPH());
        System.out.println("Brakes " + car.brakes());
    }
}
