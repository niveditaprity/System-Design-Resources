package SOLID.ISP.Violates;

public class Main {
    public static void main(String[] args) {
        BasicPrinter basicPrinter = new BasicPrinter();
        AdvancePrinter advancePrinter = new AdvancePrinter();

        basicPrinter.print();
        basicPrinter.scan(); // but this printer doesn't support this functionality
        basicPrinter.fax(); // but this printer doesn't support this functionality
    }
}
