package DesignPatterns.Creational.Factory.Furniture;

public class ChairFactory implements FurnitureFactory {
    @Override
    public Furniture createFurniture() {
        return  new Chair();
    }
}
