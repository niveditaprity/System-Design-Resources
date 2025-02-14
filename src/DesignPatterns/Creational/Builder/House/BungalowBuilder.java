package DesignPatterns.Creational.Builder.House;

public class BungalowBuilder implements HouseBuilder{
    private House house;

    BungalowBuilder() {
        this.house = new House();
    }
    @Override
    public void buildType() {
        this.house.setType("Bungalow");
    }

    @Override
    public void buildArea() {
        this.house.setArea(2500.0);

    }

    @Override
    public void buildBedrooms() {
        this.house.setBedrooms(4);

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
        this.house.setGarden(true);

    }

    @Override
    public House build() {
        System.out.println("Type: " + house.getType() + " " + "Floors: " + house.getFloors() + " "+
                "BedRooms: " + house.getBedrooms() + " "+ "BathRooms: " + house.getBathrooms() + " "+
                "Garden: " + house.getGarden());
        return this.house;
    }
}
