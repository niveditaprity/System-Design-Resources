package SOLID.ISP.Follows;



public class Main {
    public static void main(String[] args) {
        BasicPrinter basicPrinter = new BasicPrinter();
        AdvancePrinter advancePrinter = new AdvancePrinter();
        basicPrinter.print();
        advancePrinter.fax();
        advancePrinter.print();
        advancePrinter.scan();
    }
}
