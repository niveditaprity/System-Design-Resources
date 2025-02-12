package SOLID.LSP.Violate;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();

        Cycle cycle = new Cycle();
        cycle.startEngine(); // Cycle does NOT have an engine, but forced to implement startEngine()
    }
}
