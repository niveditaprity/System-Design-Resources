package DesignPatterns.Creational.AbstractFactory.HealthCare;

public class GovernmentNurse implements Nurse {
    @Override
    public void assistDoctor() {
        System.out.println("Government Nurse assisting the doctor in a public hospital.");
    }
}
