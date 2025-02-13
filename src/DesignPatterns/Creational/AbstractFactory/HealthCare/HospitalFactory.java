package DesignPatterns.Creational.AbstractFactory.HealthCare;

public interface HospitalFactory {
    Doctor createDoctor();
    Nurse createNurse();
    Medicine createMedicine();
}
