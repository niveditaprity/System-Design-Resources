package SOLID.DIP.Follows;

public class UPI implements  PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Payment is getting Processed  through UPI RS." + amount);
    }
}
