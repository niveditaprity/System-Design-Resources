package DesignPatterns.Creational.Builder.House;

//Product
public class House {
    private String type;
   private double area;
   private Integer bedrooms;
   private Integer bathrooms;
   private Integer floors;
   private Boolean garden;

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setBathrooms(Integer bathrooms) {
        this.bathrooms = bathrooms;
    }

    public void setBedrooms(Integer bedrooms) {
        this.bedrooms = bedrooms;
    }

    public void setFloors(Integer floors) {
        this.floors = floors;
    }

    public void setGarden(Boolean garden) {
        this.garden = garden;
    }

    public Boolean getGarden() {
        return garden;
    }

    public double getArea() {
        return area;
    }

    public Integer getBathrooms() {
        return bathrooms;
    }

    public Integer getBedrooms() {
        return bedrooms;
    }

    public Integer getFloors() {
        return floors;
    }
}
