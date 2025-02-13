package DesignPatterns.Creational.AbstractFactory.HealthCare;

public class GovernmentHospitalFactory implements HospitalFactory {
    @Override
    public Doctor createDoctor() {
        return new GovernmentDoctor();
    }

    @Override
    public Nurse createNurse() {
        return new GovernmentNurse();
    }

    @Override
    public Medicine createMedicine() {
        return new GovernmentMedicine();
    }
}
