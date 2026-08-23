package org.example;

import org.example.arge.CarSkeleton;
import org.example.arge.GasPoweredCar;

public class Main {
    public static void main(String[] args) {

/*
        Car car = new Car(8, "Base car");
        printResult(car);

        System.out.println("**************************************");

        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD"); //upcasting
        printResult(mitsubishi);

        System.out.println("**************************************");

        Car ford = new Ford(6, "Ford Falcon");
        printResult(ford);

        System.out.println("**************************************");

        Car holden = new Holden(6, "Holden Commodore");
        printResult(holden);

        System.out.println("**************************************");

        Holden holden2 = new Holden(4, "myModel"); // upcasting argüman olarak gidince oluyor..
        printResult(holden2);
*/
        CarSkeleton gasPoweredCar = new GasPoweredCar("Haval", "MyFirstCar", 5, 4);

        System.out.println(gasPoweredCar.startEngine());


    }

/*
    public static void printResult(Car car) {
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
    }
*/
}