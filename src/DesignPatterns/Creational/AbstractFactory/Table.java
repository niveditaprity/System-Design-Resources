package DesignPatterns.Creational.AbstractFactory;

public class Table implements  Furniture{
    @Override
    public void create() {
        System.out.println("Table......");
    }
}
