package abstract_factory;

 interface AbstractFactory <T> {
     T created(String type);
}
