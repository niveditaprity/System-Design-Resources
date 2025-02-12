package SOLID.SRP.WT;

public class Employee {

    private String name;
    private double hourlyRate;
    private int totalHours;

    Employee(String name, double hourlyRate) {
        this.name = name;
        this.hourlyRate = hourlyRate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setTotalHours(int totalHours) {
        this.totalHours = totalHours;
    }

    public int getTotalHours() {
        return totalHours;
    }
}
