// Дополните объявление класса Contact
public abstract class Contact {
    // Класс должен содержать одно поле - имя пользователя name
    String name;
    // И два метода - sendMessage() для отправки сообщения и print() для печати информации о контакт
    abstract void sendMessage();
    abstract void print();

    public String getName() {
        return name;
    }
}