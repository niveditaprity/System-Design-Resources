package SOLID.SRP.WT;

public class SalaryCalculation {
    public double calculateSalary(Employee employee) {
        return employee.getHourlyRate()*employee.getTotalHours();
    }
}
