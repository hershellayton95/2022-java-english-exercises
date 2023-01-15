package shared;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Main {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Path ordersCsvPath = Path.of("orders.csv");

        if (!Files.exists(ordersCsvPath)) {
            Map<String, Meal> menu = generateMenu();
            List<Meal> orders = generateOrders(menu);
            String fileContent = convertOrdersToCsvContent(orders);

            writeToFile(fileContent, ordersCsvPath);
        }

        String ordersRaw = readContentFromFile(ordersCsvPath);

        String[] orderRows = ordersRaw.split("\n");

        double totalIncomeEuro = 0;

        for (int i = 1; i < orderRows.length; i++) {
            String orderRow = orderRows[i];
            //1,3.5,250,[Loads of oil, Potato]
            String[] rowCells = orderRow.split(",");
            String rowPriceValueRaw = rowCells[1];
            totalIncomeEuro = totalIncomeEuro + Double.valueOf(rowPriceValueRaw);
        }

        System.out.println("Total income from all orders=" + totalIncomeEuro);
    }

    private static String readContentFromFile(Path ordersCsvPath) {
        try {
            return Files.readString(ordersCsvPath);
        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
        return null;
    }

    private static void writeToFile(String fileContent, Path orderPath) {
        try {
            Files.writeString(orderPath, fileContent);
        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
    }

    private static String convertOrdersToCsvContent(List<Meal> orders) {
        StringBuilder fileContentBuilder = new StringBuilder();
        fileContentBuilder.append("Order Number,Price,Weight in grams,Ingredients\n");

        for (int i = 0; i < orders.size(); i++) {
            Meal order = orders.get(i);
            fileContentBuilder
                    .append(i + 1)
                    .append(",")
                    .append(order.getPrice())
                    .append(",")
                    .append(order.getWeightInGrams())
                    .append(",")
                    .append(order.getIngredients())
                    .append("\n");
        }

        return fileContentBuilder.toString();
    }

    private static List<Meal> generateOrders(Map<String, Meal> menu) {
        List<Meal> orders = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            orders.add(menu.get(new ArrayList<>(menu.keySet()).get(RANDOM.nextInt(menu.size()))));
        }
        return orders;
    }

    public static Map<String, Meal> generateMenu() {
        Map<String, Meal> menu = new HashMap<>();
        menu.put("Burger", new Meal(7.80, 500, Set.of(Ingredient.BUN, Ingredient.PATTY, Ingredient.SAUCE)));
        menu.put("Cheese Burger", new Meal(8., 500, Set.of(Ingredient.BUN, Ingredient.PATTY, Ingredient.SAUCE, Ingredient.CHEESE)));
        menu.put("Fries", new Meal(3.50, 250, Set.of(Ingredient.POTATO, Ingredient.OIL)));
        menu.put("Pizza", new Meal(10.0, 700, Set.of(Ingredient.CHEESE, Ingredient.DOUGH, Ingredient.TOMATO)));
        menu.put("Cheesy Potato", new Meal(10.0, 700, Set.of(Ingredient.CHEESE, Ingredient.POTATO)));

        return menu;
    }
}
