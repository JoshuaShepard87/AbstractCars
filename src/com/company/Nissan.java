package AbstractCar;

public class Nissan extends abstractCar {


    @Override
    public int topMPH() {
        return 120;
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
        return "Nissan";
    }

    @Override
    public String model() {
        return "Altima";
    }

    @Override
    public int year() {
        return 2020;
    }
}
