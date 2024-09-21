public class SecondTask {
    public static void main(String[] args) {

    }
}
class Employee {
    private String name;
    private String position;
    private double salary;

    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Имя: " + name + "\nДолжность: " + position + "\nЗарплата: " + salary);
    }
}

class Manager extends Employee {
    private String department;

    public Manager(String name, double salary, String department) {
        super(name, "Менеджер", salary);
        this.department = department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Отдел: " + department);
    }
}

class Developer extends Employee {
    private String mainProgrammingLanguage;

    public Developer(String name, double salary, String mainProgrammingLanguage) {
        super(name, "Разработчик", salary);
        this.mainProgrammingLanguage = mainProgrammingLanguage;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Основной язык программирования: " + mainProgrammingLanguage);
    }
}
