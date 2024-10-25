public class hw_task2 {}

enum PhoneType {
    HOME,
    WORK,
    MOBILE
}

class Phone {
    String phoneNumber;
    PhoneType phoneType;
}

class Address {
    String street;
    PhoneType city;
    String state;
    String zipCode;
}

interface Pet1 {
    void play();
}

abstract class Animal1 {
    String name;
    int age;
    abstract void eat();
    abstract void sleep();
}
class Dog1 extends Animal1 implements Pet1 {
    String breed;

    @Override
    public void play() {
        System.out.println("Играет");
    }

    @Override
    void eat() {
        System.out.println("Кушает");
    }

    @Override
    void sleep() {
        System.out.println("Спит");
    }
    void bark() {
        System.out.println("Гав гав");
    }
}
class Cat1 extends Animal1 implements Pet1 {
    String furColor;

    @Override
    public void play() {
        System.out.println("Играет");
    }

    @Override
    void eat() {
        System.out.println("Кушает");
    }

    @Override
    void sleep() {
        System.out.println("Спит");
    }
    void meow() {
        System.out.println("Мяу мяу");
    }
}
class Person {
    String name;
    int age;
    Address address;
    Phone phone;

    void adoptPet(Pet pet) {
        System.out.println("Приютил питомца");
    }
}