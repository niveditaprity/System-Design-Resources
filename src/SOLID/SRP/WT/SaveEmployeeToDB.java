package SOLID.SRP.WT;

public class SaveEmployeeToDB {
    public void saveToDatabase(Employee employee) {
        System.out.println("Saving " + employee.getName() + " to database...");
    }
}
