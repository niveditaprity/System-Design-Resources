package DesignPatterns.Creational.Factory;

public class PushNotification implements NotificationService{
    @Override
    public void sendNotification(String msg) {
        System.out.println("Sending Push Notification:" + msg);
    }
}
