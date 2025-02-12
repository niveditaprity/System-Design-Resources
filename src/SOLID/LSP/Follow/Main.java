package SOLID.LSP.Follow;

import SOLID.LSP.Follow.Car;
import SOLID.LSP.Follow.Cycle;
import SOLID.LSP.Follow.Vehicle;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Cycle cycle = new Cycle();

        car.move();
        car.startEnginee();
        cycle.move(); //cycle can't call startEngine which is correct



    }
}
