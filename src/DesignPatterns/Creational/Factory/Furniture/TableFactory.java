package DesignPatterns.Creational.Factory.Furniture;

public class TableFactory implements FurnitureFactory {
    @Override
    public Furniture createFurniture() {
        return  new Table();
    }
}
