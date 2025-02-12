package DesignPatterns.Creational.Factory.Furniture;

public class Table implements Furniture {
    @Override
    public void create() {
        System.out.println("Table......");
    }
}
