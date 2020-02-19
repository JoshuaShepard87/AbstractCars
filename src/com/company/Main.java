package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Car chevy = new Chevy(80, "ABS", "5.7L V8",4, "Chevy", "Silverado");

        Chevy chevy1 = new Chevy(43, "Nope", "rubber band", 2,"Chevy", "Clowncar");
        chevy.printCar();
        System.out.println("\n");
        chevy1.printCar();




    }

}
