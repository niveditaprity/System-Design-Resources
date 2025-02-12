package DesignPatterns.Creational.Factory.Furniture;

public class BedFactory implements FurnitureFactory {
    @Override
    public Furniture createFurniture() {
        return new Bed();
    }
}
