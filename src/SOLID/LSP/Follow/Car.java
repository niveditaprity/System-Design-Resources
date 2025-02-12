package SOLID.LSP.Follow;

import SOLID.LSP.Follow.Vehicle;

public class Car extends Vehicle implements EnginePowered {

    @Override
    public void startEnginee() {
        System.out.println("Engine has started....");
    }
}
