package DesignPatterns.Creational.AbstractFactory.HealthCare;

public class PrivateMedicine implements Medicine {
    @Override
    public void prescribe() {
        System.out.println("Prescribing branded medicine.");
    }
}
