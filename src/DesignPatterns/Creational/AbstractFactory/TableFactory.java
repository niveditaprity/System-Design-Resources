package DesignPatterns.Creational.AbstractFactory;

public class TableFactory implements  FurnitureFactory{
    @Override
    public Furniture createFurniture() {
        return  new Table();
    }
}
