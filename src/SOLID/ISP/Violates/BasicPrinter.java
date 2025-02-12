package SOLID.ISP.Violates;

public class BasicPrinter implements  Printer{

    @Override
    public void print() {
        System.out.println("Basic Printing.....");

    }

    @Override
    public void scan() {
        System.out.println("Basic Scanning....."); // doesn't support still have to implement
    }

    @Override
    public void fax() {
        System.out.println("Basic Faxing....."); // doesn't support still have to implement
    }
}
