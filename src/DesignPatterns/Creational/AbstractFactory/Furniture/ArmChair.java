package DesignPatterns.Creational.AbstractFactory.Furniture;

public class ArmChair implements  Chair{
    @Override
    public void create() {
        System.out.println("ArmChair is getting created");
    }
}
