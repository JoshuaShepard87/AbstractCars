package com.company.GroupAssignment021820;

public class CarDriver {
    public static void main(String[] args) {

        Car car = new Subaru();

        System.out.println("The car I created was a " + car.carYear() + " " + car.carMake() + " " + car.carModel() + ".");
        System.out.println("The " + car.carModel() + " has a top speed of " + car.carTopMPH() + " MPH with a " + car.carEngineSize() + " liter engine.");
        System.out.println("The car has " + car.carDoorNumber() + " doors and " + car.carBrakes() + " brakes!");
    }
}
