public class Scooter {
    int availableScooters;
    int scootersInUse;
    int defaultPrice = 29; // Цена аренды по умолчанию
    int additionalPrice = 5; // Добавочная стоимость при повышенном спросе

    Scooter(int inputAvailableScooters, int inputScootersInUse) {
        availableScooters = inputAvailableScooters;
        scootersInUse = inputScootersInUse;
    }

    void getPrice() {
        if (availableScooters > 0) {
            int currentPrice = (scootersInUse + 1) / availableScooters * additionalPrice + defaultPrice;
            System.out.println("Текущая стоимость проката: " + currentPrice + " тг/мин");
        } else {
            System.out.println("Нет доступных самокатов.");
        }
    }

    void rentScooter() {
        if (availableScooters > 0) {
            int currentPrice = (scootersInUse + 1) / availableScooters * additionalPrice + defaultPrice;
            scootersInUse++;
            availableScooters--;
            System.out.println("Выдайте самокат по цене " + currentPrice + " тг/мин");
            System.out.println("Самокатов в аренде: " + scootersInUse);
            System.out.println("Самокатов доступно: " + availableScooters);
        } else {
            System.out.println("Доступных самокатов не осталось.");
        }
    }

    void returnScooter() {
        if (scootersInUse > 0) {
            scootersInUse--;
            availableScooters++;
            System.out.println("Самокат принят.");
            System.out.println("Самокатов в аренде: " + scootersInUse);
            System.out.println("Самокатов доступно: " + availableScooters);
        } else {
            System.out.println("Все самокаты уже возвращены.");
        }
    }
}