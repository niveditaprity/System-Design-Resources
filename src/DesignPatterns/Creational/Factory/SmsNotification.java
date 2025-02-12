package DesignPatterns.Creational.Factory;

public class SmsNotification implements  NotificationService{
    @Override
    public void sendNotification(String msg) {
        System.out.println("Senidng SmsNotification:" + msg);
    }
}
