package DesignPatterns.Creational.AbstractFactory.HealthCare;

public class PrivateNurse implements Nurse {
    @Override
    public void assistDoctor() {
        System.out.println("Private Nurse assisting the doctor in a private hospital.");
    }
}
