package abstract_factory;



public class FactoryProvider {
   public AbstractFactory<Notification> getFactory(String factoryType) {
        if (factoryType == null || factoryType.isEmpty())
            return null;
       if (factoryType.equals("notification")) {
           return new NotificationFactory();
       }
       throw new IllegalArgumentException("Unlnown factoryType" + factoryType);
   }
    }

