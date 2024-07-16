package org.example.factory_method;

public class NotificationFactory {

    public Notification createdNotification(String message) {
        if (message == null || message.isEmpty())
            return null;
        return switch (message) {
            case "SMS" -> new SMSNotification();
            case "EMAIL" -> new EmailNotification();
            default -> throw new IllegalArgumentException("Unlnown message" + message);
        };
    }
}
