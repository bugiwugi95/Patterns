package org.example.factory_method;

public class EmailNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.print("Email Notification");
    }
}
