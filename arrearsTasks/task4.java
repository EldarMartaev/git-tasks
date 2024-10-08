import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int monthNumber;

        while (true) {
            System.out.println("Когда планируется путешествие? Введите номер месяца от 1 до 12.");
            monthNumber = scanner.nextInt();

            if (monthNumber > 0 && monthNumber < 13) { // Номер месяца должен быть в диапазоне от 1 до 12
                break;
            } else {
                System.out.println("Некорретный номер месяца. Введите ещё раз.");
            }
        }

        String season = getSeasonByNumber(monthNumber);

        if (season.equals("Лето") || season.equals("Зима")) { // Не рекомендуем лететь в Париж в летние и зимние месяцы
            System.out.println("В это время года лучше остаться в Астане.");
            return;
        }


        System.out.println("Укажите стоимость прямых билетов из Астаны в Париж:");
        int ticketAstanaParis = scanner.nextInt();
        System.out.println("Укажите стоимость билетов из Астаны в Париж с пересадкой в Лондоне:");
        int ticketAstanaLondonParis = scanner.nextInt();
        System.out.println("У вас есть британская виза?");
        System.out.println("1 - да, виза есть");
        System.out.println("0 - визы нет");
        int britainVisa = scanner.nextInt();

        boolean directTicketsCheaper = (ticketAstanaParis < ticketAstanaLondonParis);// Сравнение стоимости билетов
        boolean hasBritainVisa = (britainVisa == 1);// Проверка наличия визы

        if (directTicketsCheaper && hasBritainVisa) { // Проверить в одном условии наличие дешёвых билетов и визы
            System.out.println("Летим через Лондон!");
        } else {
            System.out.println("Летим через Париж!");
        }
    }

    private static String getSeasonByNumber(int monthNumber) {
        if (monthNumber < 3) {
            return "Зима";
        } else if (monthNumber < 6) {
            return "Весна";
        } else if (monthNumber < 9) {
            return "Лето";
        } else if (monthNumber < 12) {
            return "Осень";
        } else {
            return "Зима";
        }
    }
}