package DesignPatterns.Creational.AbstractFactory.Furniture;

public class PlatformBed implements  Bed{
    @Override
    public void create() {
        System.out.println("Platform bed is getting created");
    }
}
