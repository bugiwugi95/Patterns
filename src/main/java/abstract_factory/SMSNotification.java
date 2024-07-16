package abstract_factory;

public class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.print("SMS Notification");
    }
}
