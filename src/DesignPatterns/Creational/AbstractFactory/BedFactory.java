package DesignPatterns.Creational.AbstractFactory;

public class BedFactory implements  FurnitureFactory{
    @Override
    public Furniture createFurniture() {
        return new Bed();
    }
}
