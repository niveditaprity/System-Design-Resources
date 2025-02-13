package DesignPatterns.Creational.AbstractFactory.Furniture;

public class ReclinerChair  implements Chair{
    @Override
    public void create() {
        System.out.println("Recliner Chair is getting created");
    }
}
