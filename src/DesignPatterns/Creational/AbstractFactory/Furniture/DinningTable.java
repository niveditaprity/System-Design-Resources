package DesignPatterns.Creational.AbstractFactory.Furniture;

public class DinningTable implements  Table{
    @Override
    public void create() {
        System.out.println("Dinning Table is getting created");
    }
}
