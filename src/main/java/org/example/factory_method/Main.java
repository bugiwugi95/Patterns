package org.example.factory_method;


public class Main {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification sms = notificationFactory.createdNotification("SMS");
        Notification email = notificationFactory.createdNotification("EMAIL");
        sms.notifyUser();
        email.notifyUser();

    }
}