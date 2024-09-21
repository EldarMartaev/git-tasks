import java.util.HashMap;
public class FirstTask {
    public static void main(String[] args) {
//        Магазин 1:
        HashMap<String, Integer> sales1 = new HashMap<>();
        sales1.put("Товар A", 10);
        sales1.put("Товар B", 5);
        sales1.put("Товар C", 8);
//        Магазин 2:
        HashMap<String, Integer> sales2 = new HashMap<>();
        sales2.put("Товар B", 3);
        sales2.put("Товар D", 7);
        sales2.put("Товар E", 2);
        HashMap<String, Integer> totalSales = new HashMap<>();
        for (String product : sales1.keySet()) {
            if (totalSales.containsKey(product)) {
                totalSales.put(product, totalSales.get(product) + sales1.get(product));
            } else {
                totalSales.put(product, sales1.get(product));
            }
        }
        for (String product : sales2.keySet()) {
            if (totalSales.containsKey(product)) {
                totalSales.put(product, totalSales.get(product) + sales2.get(product));
            } else {
                totalSales.put(product, sales2.get(product));
            }
        }
        System.out.println(totalSales);
    }
}
