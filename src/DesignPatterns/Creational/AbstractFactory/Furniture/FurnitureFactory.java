package DesignPatterns.Creational.AbstractFactory.Furniture;

public interface FurnitureFactory {
    public Chair createChair();
    public  Table createTable();
    public Bed createdBed();
}
