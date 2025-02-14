package DesignPatterns.Creational.Builder.House;

public class HouseDirector {
    public House constructHouse(HouseBuilder houseBuilder) {
        houseBuilder.buildType();
        houseBuilder.buildArea();
        houseBuilder.buildFloors();
        houseBuilder.buildBedrooms();
        houseBuilder.buildBahtRooms();
        houseBuilder.buildGarden();
        return houseBuilder.build();

    }
}
