public class hm_task1 {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        Swan swan = new Swan();
        eagle.hunt();
        eagle.fly();
        eagle.land();
        eagle.soarHigh();
        eagle.huntSmallAnimals();
        swan.fly();
        swan.land();
        swan.swim();
        swan.gracefulSwim();
    }
}
interface Flyable { // способность летать
    void fly(); //метод полёта
    void land(); //метод посадки
}
interface Waterfowl { // способность плавать
    void swim(); // метод плаванья
}

interface Hunter { // способность охотиться
    void hunt(); // метод охоты
}
abstract class Animal{
    String voice;
    void makeSoung() {
        System.out.println(voice);
    }
}
abstract class BirdOfPrey extends Animal implements Hunter{
    void huntSmallAnimals() {
        System.out.println("Охотиться на мелких животных");
    }
}
class Eagle extends BirdOfPrey implements Flyable{
    void soarHigh() {
        System.out.println("Парит высоко в небе");
    }

    @Override
    public void fly() {
        System.out.println("Летит");
    }

    @Override
    public void land() {
        System.out.println("Приземлился");
    }

    @Override
    public void hunt() {
        System.out.println("Охотиться");
    }
}
class Swan extends Animal implements Flyable, Waterfowl {
    void gracefulSwim() {
        System.out.println("Изящно плавает");
    }

    @Override
    public void fly() {
        System.out.println("Летит");
    }

    @Override
    public void land() {
        System.out.println("Приземлился");
    }

    @Override
    public void swim() {
        System.out.println("Плавает");
    }
}