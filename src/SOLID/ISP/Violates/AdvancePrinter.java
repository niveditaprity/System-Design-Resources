package SOLID.ISP.Violates;

public class AdvancePrinter implements  Printer{
    @Override
    public void print() {
        System.out.println("Advanced Printing.....");

    }

    @Override
    public void scan() {
        System.out.println("Advanced Scanning.....");
    }

    @Override
    public void fax() {
        System.out.println("Advanced Faxing.....");
    }
}
