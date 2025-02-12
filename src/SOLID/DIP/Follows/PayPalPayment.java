package SOLID.DIP.Follows;



public class PayPalPayment implements  PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Payment is getting Processed  through PayPal RS." + amount);
    }
}
