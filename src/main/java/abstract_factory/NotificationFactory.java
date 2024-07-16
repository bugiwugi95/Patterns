package abstract_factory;

public class NotificationFactory implements AbstractFactory<Notification> {
    @Override
    public Notification created(String message) {
        if (message == null || message.isEmpty())
            return null;
        return switch (message) {
            case "SMS" -> new SMSNotification();
            case "EMAIL" -> new EmailNotification();
            default -> throw new IllegalArgumentException("Unlnown message" + message);
        };
    }
}
