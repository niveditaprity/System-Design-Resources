package DesignPatterns.Creational.AbstractFactory;

public class Bed implements  Furniture{
    @Override
    public void create() {
        System.out.println("Bed.......");
    }
}
