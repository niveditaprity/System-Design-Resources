package DesignPatterns.Creational.Builder.House;

public interface HouseBuilder {
    void buildType();
    void buildArea();
    void buildBedrooms();
    void buildFloors();
    void buildBahtRooms();
    void buildGarden();
    House build();

}
