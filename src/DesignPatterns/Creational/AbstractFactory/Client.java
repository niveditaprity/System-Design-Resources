package DesignPatterns.Creational.AbstractFactory;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        FurnitureFactory furnitureFactory = null;
        Scanner scn = new Scanner(System.in);
        String furnitureType = scn.nextLine();
        if(furnitureType.equalsIgnoreCase("chair")) {
            furnitureFactory = new ChairFactory();
        }else if(furnitureType.equalsIgnoreCase("Table")) {
            furnitureFactory = new TableFactory();
        }else if(furnitureType.equalsIgnoreCase("Bed")) {
            furnitureFactory = new BedFactory();
        }

        assert furnitureFactory != null;
        furnitureFactory.createFurniture().create();
    }
}
