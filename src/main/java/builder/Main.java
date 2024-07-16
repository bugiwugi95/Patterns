package builder;

public class Main {
    public static void main(String[] args) {
        new PersonBuilder().myName().myAge().myEmail().build();
    }


}

class Person {
    String name;
    int age;
    String email;

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }
}

class PersonBuilder {
    private String name;
    private int age;
    private String email;

    PersonBuilder myName() {
        System.out.printf("my name is %s\n", name = "Klark");
        return this;
    }

    PersonBuilder myAge() {
        System.out.printf("age is %d\n", age = 26);
        return this;
    }

    PersonBuilder myEmail() {
        System.out.printf("email is %s\n", email = "dssdsdfsf@143");
        return this;
    }

    Person build() {
        return new Person(this.name, this.age, this.email);
    }


}
