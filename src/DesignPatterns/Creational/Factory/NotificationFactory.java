package DesignPatterns.Creational.Factory;

public class NotificationFactory {
    public NotificationService getNotification(String notificationType) {
        if (notificationType.equalsIgnoreCase("email")) {
            return new EmailNotification();
        } else if (notificationType.equalsIgnoreCase("sms")) {
            return new SmsNotification();
        } else if (notificationType.equalsIgnoreCase("push")) {
            return new PushNotification();
        } else {
            throw new IllegalArgumentException("Invalid notification type: " + notificationType);
        }
    }
}
