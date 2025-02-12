package DesignPatterns.Creational.AbstractFactory;

public class ChairFactory implements  FurnitureFactory{
    @Override
    public Furniture createFurniture() {
        return  new Chair();
    }
}
