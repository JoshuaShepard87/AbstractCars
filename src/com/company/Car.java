package com.company;

abstract class Car {

    abstract public int MPH();
    abstract public String breaks();
    abstract public String engineSize();
    abstract public int doorNumber();
    abstract public String Make();
    abstract public String Model();

    public void printCar() {
        System.out.println("My top speed is" + MPH());
        System.out.println("my brake type: " + breaks());
        System.out.println("My engine size: " + engineSize());
        System.out.println("Vehicle has " + doorNumber() + " doors");
        System.out.println("Make: " + Make());
        System.out.println("Model: " + Model());
    }
}
