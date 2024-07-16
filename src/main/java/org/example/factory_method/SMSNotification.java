package org.example.factory_method;

public class SMSNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.print("SMS Notification");
    }
}
