package DesignPatterns.Creational.Factory.Furniture;

public class Chair implements Furniture {
    @Override
    public void create() {
        System.out.println("Chair......");
    }
}
