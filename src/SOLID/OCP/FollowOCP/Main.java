package SOLID.OCP.FollowOCP;

public class Main {
    public static void main(String[] args) {
        DebitCardPayment debitCardPayment = new DebitCardPayment();
        CreditCardPayment creditCardPayment = new CreditCardPayment();
        PaymentProcessor processor = new PaymentProcessor();

        processor.processPayment(debitCardPayment,200.0);
    }
}
