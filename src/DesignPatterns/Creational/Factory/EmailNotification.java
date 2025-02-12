package DesignPatterns.Creational.Factory;

public class EmailNotification implements NotificationService{
    @Override
    public void sendNotification(String msg) {
        System.out.println("Sending Email Notification:" + msg);
    }
}
