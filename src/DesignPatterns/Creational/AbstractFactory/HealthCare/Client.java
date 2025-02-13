package DesignPatterns.Creational.AbstractFactory.HealthCare;

public class Client {
    public static void main(String[] args) {
        // Government Hospital
        System.out.println("Government Hospital Services:");
        HospitalFactory govFactory = HospitalFactoryProducer.getFactory("GOVERNMENT");
        govFactory.createDoctor().treatPatient();
        govFactory.createNurse().assistDoctor();
        govFactory.createMedicine().prescribe();

        // Private Hospital
        System.out.println("\nPrivate Hospital Services:");
        HospitalFactory privateFactory = HospitalFactoryProducer.getFactory("PRIVATE");
        privateFactory.createDoctor().treatPatient();
        privateFactory.createNurse().assistDoctor();
        privateFactory.createMedicine().prescribe();
    }
}
