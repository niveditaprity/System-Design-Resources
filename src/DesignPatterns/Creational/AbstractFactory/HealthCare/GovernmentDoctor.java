package DesignPatterns.Creational.AbstractFactory.HealthCare;

public class GovernmentDoctor implements Doctor {
    @Override
    public void treatPatient() {
        System.out.println("Government Doctor treating a patient for free.");
    }
}
