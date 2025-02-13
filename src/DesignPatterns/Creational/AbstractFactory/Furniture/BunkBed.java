package DesignPatterns.Creational.AbstractFactory.Furniture;

public class BunkBed implements  Bed{
    @Override
    public void create() {
        System.out.println("Bunk Bed is getting created");
    }
}
