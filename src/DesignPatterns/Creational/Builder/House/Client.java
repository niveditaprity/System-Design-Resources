package DesignPatterns.Creational.Builder.House;

public class Client {
    public static void main(String[] args) {
        HouseDirector houseDirector = new HouseDirector();
        ApartmentBuilder apartmentBuilder  = new ApartmentBuilder();
        BungalowBuilder bungalowBuilder = new BungalowBuilder();
        VillaBuilder villaBuilder = new VillaBuilder();
        System.out.println("Constructing an Apartment:");
        houseDirector.constructHouse(apartmentBuilder);
        System.out.println("Constructing a Villa:");
        houseDirector.constructHouse(villaBuilder);
        System.out.println("Constructing a Bungalow:");
        houseDirector.constructHouse(bungalowBuilder);

    }
}
