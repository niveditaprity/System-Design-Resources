package DesignPatterns.Creational.AbstractFactory.HealthCare;

public class HospitalFactoryProducer {
    public static HospitalFactory getFactory(String type) {
        if ("GOVERNMENT".equalsIgnoreCase(type)) {
            return new GovernmentHospitalFactory();
        } else if ("PRIVATE".equalsIgnoreCase(type)) {
            return new PrivateHospitalFactory();
        }
        throw new IllegalArgumentException("Unknown hospital type: " + type);
    }
}
