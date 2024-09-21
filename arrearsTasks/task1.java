public class task1 {
    public static void main(String[] args) {
        String pixelKcalDay = "43";
        String beefKcal = "30.2";
        String chickenKcal = "23.8";
        String creamKcal = "32.1";
        String milkKcal = "13.5";

        float pixelChoice = getMinKcalsSum(beefKcal, chickenKcal, creamKcal, milkKcal);
        float totalKcal = Float.parseFloat(pixelKcalDay) + pixelChoice;

        checkKcal(totalKcal);
    }
    private static float getMinKcalsSum(String firstDishKcal, String secondDishKcal, String firstDesertKcal, String secondDesertKcal) {
        float dish1 = Float.parseFloat(firstDishKcal);
        float dish2 = Float.parseFloat(secondDishKcal);
        float dessert1 = Float.parseFloat(firstDesertKcal);
        float dessert2 = Float.parseFloat(secondDesertKcal);
        float minDishKcal = Float.min(dish1, dish2);
        float minDesertKcal = Float.min(dessert1, dessert2);
        return minDishKcal + minDesertKcal;
    }
    private static void checkKcal(float catKcal) {
        System.out.println("Калорийность рациона Пикселя за день: " + catKcal);
        if (catKcal > 100) {
            System.out.println("Пиксель сегодня не уложился в норму.");
        } else {
            System.out.println("Лимит не превышен!");
        }
    }
}
