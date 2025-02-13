package DesignPatterns.Creational.AbstractFactory.Furniture;

public class CoffeeTable implements  Table{
    @Override
    public void create() {
        System.out.println("Coffee Table is getting created");
    }
}
