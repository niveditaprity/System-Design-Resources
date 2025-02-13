package DesignPatterns.Creational.AbstractFactory.Furniture;

public class StudyTable implements  Table{
    @Override
    public void create() {
        System.out.println("Study Table is getting created");
    }
}
