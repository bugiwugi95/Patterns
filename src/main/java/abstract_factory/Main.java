package abstract_factory;


public class Main {
    public static void main(String[] args) {
        FactoryProvider factoryProvider = new FactoryProvider();
        AbstractFactory<Notification> notification = factoryProvider.getFactory("notification");
        Notification sms = notification.created("SMS");
        Notification email = notification.created("EMAIL");
        sms.notifyUser();
        email.notifyUser();

    }
}