package DesignPatterns.Creational.AbstractFactory.HealthCare;

public class GovernmentMedicine implements Medicine {
    @Override
    public void prescribe() {
        System.out.println("Providing free government medicine.");
    }
}
