package SOLID.ISP.Follows;

import SOLID.ISP.Violates.Printer;

public class AdvancePrinter implements Printable,Scanable,Faxable {

    @Override
    public void print() {
        System.out.println("Advance Printing....");
    }

    @Override
    public void scan() {
        System.out.println("Advance Scanning....");
    }

    @Override
    public void fax() {
        System.out.println("Advance faxing.....");
    }
}
