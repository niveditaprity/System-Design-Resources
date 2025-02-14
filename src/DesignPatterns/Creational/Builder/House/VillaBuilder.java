package DesignPatterns.Creational.Builder.House;

public class VillaBuilder implements  HouseBuilder{
    private House house;

    VillaBuilder() {
        this.house = new House();
    }
    @Override
    public void buildType() {
        this.house.setType("Villa");
    }

    @Override
    public void buildArea() {
        this.house.setArea(3500.0);

    }

    @Override
    public void buildBedrooms() {
        this.house.setBedrooms(5);

    }

    @Override
    public void buildFloors() {
        this.house.setFloors(2);

    }

    @Override
    public void buildBahtRooms() {
        this.house.setBathrooms(4);

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
