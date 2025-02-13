package DesignPatterns.Creational.AbstractFactory.Furniture;

public class OfficeChair implements  Chair{
    @Override
    public void create() {
        System.out.println("OfficeChair is getting created");
    }
}
