package DesignPatterns.Creational.AbstractFactory.HealthCare;

public class PrivateHospitalFactory implements HospitalFactory {
    @Override
    public Doctor createDoctor() {
        return new PrivateDoctor();
    }

    @Override
    public Nurse createNurse() {
        return new PrivateNurse();
    }

    @Override
    public Medicine createMedicine() {
        return new PrivateMedicine();
    }
}
