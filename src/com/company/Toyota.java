package Abstract;

public class Toyota extends abstractCar {

    @Override
    public int topMPH() {
        return 90;
    }

    @Override
    public String brakes() {
        return "ABS";
    }

    @Override
    public double engineSize() {
        return 2.5;
    }

    @Override
    public int doorNumber() {
        return 4;
    }

    @Override
    public String make() {
        return "Toyota";
    }

    @Override
    public String model() {
        return "Corolla";
    }

    @Override
    public int year() {
        return 2015;
    }
}
