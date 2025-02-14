package DesignPatterns.Creational.Builder.House;

public class ApartmentBuilder implements  HouseBuilder{
    private House house;


    ApartmentBuilder() {
        house  = new House();
    }
    @Override
    public void buildType() {
        this.house.setType("Apartment");

    }

    @Override
    public void buildArea() {
        this.house.setArea(1200.5);

    }

    @Override
    public void buildBedrooms() {
        this.house.setBedrooms(3);

    }

    @Override
    public void buildFloors() {
        this.house.setFloors(1);

    }

    @Override
    public void buildBahtRooms() {
        this.house.setBathrooms(3);

    }

    @Override
    public void buildGarden() {
        this.house.setGarden(false);

    }

    @Override
    public House build() {
        System.out.println("Type: " + house.getType() + " " + "Floors: " + house.getFloors() + " "+
        "BedRooms: " + house.getBedrooms() + " "+ "BathRooms: " + house.getBathrooms() + " "+
        "Garden: " + house.getGarden());
        return this.house;
    }
}
