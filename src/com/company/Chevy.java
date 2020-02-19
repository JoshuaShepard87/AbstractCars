package com.company;

public class Chevy extends Car{

    int speed;
    String brakes;
    String engineSize;
    int doors;
    String Make;
    String Model;

    public Chevy(int speed, String brakes, String engineSize, int doors, String make, String model) {
        this.speed = speed;
        this.brakes = brakes;
        this.engineSize = engineSize;
        this.doors = doors;
        Make = make;
        Model = model;
    }

    @Override
    public int MPH() {
        return 145;
    }

    @Override
    public String breaks() {
        return "ABS";
    }

    @Override
    public String engineSize() {
        return "5.8L V8";
    }

    @Override
    public int doorNumber() {
        return 4;
    }

    @Override
    public String Make() {
        return "Chevrolet";
    }

    @Override
    public String Model() {
        return "Colorado";
    }


}
