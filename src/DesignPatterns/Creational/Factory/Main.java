package DesignPatterns.Creational.Factory;

public class Main {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();

        NotificationService notificationService = notificationFactory.getNotification("sms");
        notificationService.sendNotification("Hello World");

        notificationService = notificationFactory.getNotification("email");
        notificationService.sendNotification("Hi Nivedita");

        notificationService = notificationFactory.getNotification("push");
        notificationService.sendNotification("New Update Available!");
    }
}
