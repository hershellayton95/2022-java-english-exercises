package javaadvanced._2;

import java.util.HashMap;
import java.util.Map;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    public static <T> void myPrint(T param){
        System.out.println(param);
    }
    /**
     * 1: Follow the steps below
     */
    private static void exercise1() {
        // 1a. Create a map of integers to strings
        Map<Integer, String> myFirstMap = new HashMap<>();

        // 1b. Add 3 elements to the map .put
        myFirstMap.put(0, "Item0");
        myFirstMap.put(1, "Item1");
        myFirstMap.put(2, "Item2");
        // 1c. Print the map
        System.out.println(myFirstMap);
        // 1d. Access an element in the map with .get
        myPrint(myFirstMap.get(0));
        // 1e. Remove an element from the map .remove
        myFirstMap.remove(0);
        // 1f. Print the map again to confirm the element was removed
        myPrint(myFirstMap);
    }

    /**
     *  2: Follow the instructions in the code
     */
    private static void exercise2() {
        Map<String, Double> menuCostsInEuro = new HashMap<>();

        menuCostsInEuro.put("Fries", 3.50);
        menuCostsInEuro.put("Pizza", 11.80);
        menuCostsInEuro.put("Burger", 8.50);

        String mostExpensiveMenuItemName = null;

        // 2a. Loop over the map entries with menuCostsInEuro.entrySet()
        //     and set out the most expensive items name
        //     use for(Map.Entry<String, Double> entry : menuCostsInEuro.entrySet()) and entry.getKey and entry.getValue
        //     to do so

        // Your code
        for(Map.Entry<String, Double> entry : menuCostsInEuro.entrySet()){
            String meal = entry.getKey();
            double cost = entry.getValue();

            if(mostExpensiveMenuItemName == null){
                mostExpensiveMenuItemName = meal;
            }
            if(cost > menuCostsInEuro.get(mostExpensiveMenuItemName)){
                mostExpensiveMenuItemName = meal;
            }
        }

        if (mostExpensiveMenuItemName.equals("Pizza")) {
            System.out.println("2a. Correct!");
        } else {
            System.out.println("2a. Incorrect!");
        }
    }

    /**
     * 3: Follow the instructions in the code
     */
    private static void exercise3() {
        Map<String, Integer> fruitWeights = new HashMap<>();

        fruitWeights.put("Apple", 5);
        fruitWeights.put("Banana", 3);
        fruitWeights.put("Orange", 8);
        fruitWeights.put("Kiwi", 1);
        fruitWeights.put("Mango", 4);
        fruitWeights.put("Grapes", 8);
        fruitWeights.put("Peach", 5);
        fruitWeights.put("Pineapple", 1);

        int totalWeight = 0;
        // 3a. Use a for loop with fruitWeights.values() and sum up the total weight

        // Your code
        for (int weight : fruitWeights.values()){
            totalWeight += weight;
        }

        if (totalWeight == fruitWeights.values().stream().mapToInt(Integer::intValue).sum()) {
            System.out.println("3. Correct!");
        } else {
            System.out.println("3. Incorrect!");
        }
    }
}
