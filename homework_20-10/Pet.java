public abstract class Pet {
    int pawCount;
    void sleep() {
        System.out.println("Сплю");
    }
    void play() {
        System.out.println("Играю");
    }
    abstract void giveVoice();

    int getPawCount() {
        return pawCount;
    }
}

class Fish extends Pet{
    int pawCount = 0;

    @Override
    void giveVoice() {
        System.out.println("буль буль");
    }

    @Override
    public int getPawCount() {
        return pawCount;
    }
}

class Spider extends Pet{
    int pawCount = 8;

    @Override
    void giveVoice() {
        System.out.println("хфушфхушхфушхфушфхуш");
    }
    @Override
    public int getPawCount() {
        return pawCount;
    }
}

class Dog extends Pet{
    int pawCount = 4;

    @Override
    void giveVoice() {
        System.out.println("гав гав");
    }
    void bringStick() {
        System.out.println("Принёс палочку, как хороший мальчик!");
    }
    @Override
    public int getPawCount() {
        return pawCount;
    }
}

class Cat extends Pet{
    int pawCount = 4;

    @Override
    void giveVoice() {
        System.out.println("мяу...... мяЯЯЯЯЯЯЯЯЯЯЯУУУУ");
    }
    void catchMouse() {
        System.out.println("Поймала мышку!");
    }
    @Override
    public int getPawCount() {
        return pawCount;
    }
}

class Hamster1 extends Pet{
    int pawCount = 4;

    @Override
    void giveVoice() {
        System.out.println("Я без понятия как изобразить буквами звук хомяка");
    }
    void hideFood() {
        System.out.println("Вся еда — в щёчках!");
    }
    @Override
    public int getPawCount() {
        return pawCount;
    }
}

class Main{
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.catchMouse();
        cat.giveVoice();

        Dog dog = new Dog();
        dog.bringStick();
        dog.play();

        Hamster1 hamster = new Hamster1();
        hamster.hideFood();
        hamster.sleep();

        Fish fish = new Fish();
        fish.sleep();

        Spider spider = new Spider();
        System.out.println("У паука " + spider.getPawCount() + " лапок.");
    }
}