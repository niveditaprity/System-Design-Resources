package DesignPatterns.Creational.AbstractFactory.HealthCare;

public class PrivateDoctor implements Doctor {
    @Override
    public void treatPatient() {
        System.out.println("Private Doctor treating a patient with specialized care.");
    }
}
