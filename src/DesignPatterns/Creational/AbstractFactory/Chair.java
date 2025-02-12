package DesignPatterns.Creational.AbstractFactory;

public class Chair implements  Furniture{
    @Override
    public void create() {
        System.out.println("Chair......");
    }
}
