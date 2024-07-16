package abstract_factory;

public class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.print("Email Notification");
    }
}
