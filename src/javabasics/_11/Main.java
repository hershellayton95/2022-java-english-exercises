package javabasics._11;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3Bonus();
    }

    /**
     * 1: Finish this switch statement to include:
     *    "cheeseburger" cost: 7.99 and calories 850
     *     "fries" cost: 3.99 and calories 250
     */
    public static void exercise1() {
        System.out.println("Exercise 1 - Fast Food Order:");
        String fastFoodOrder = "hamburger";
        double orderCost = 0;
        int orderCalories = 0;

        switch (fastFoodOrder) {
            case "hamburger":
                orderCalories = 700;
                orderCost = 5.99;
                break;
            case "milkshake":
                orderCalories = 600;
                orderCost = 2.50;
                break;
            // Your cases here!
        }

        System.out.println("Order receipt:" +
                "\nOrder item=" + fastFoodOrder +
                "\nkCal=" + orderCalories +
                "\ncost=€" + orderCost
        );
    }

    /**
     * 2: Complete a switch statement to achieve the following
     *
     *    If the user enters a prime number between 0-20 (2, 3, 5, 7, 11, 13, 17, 19)
     *
     *    Print "This is the nth largest prime number under 20", i.e.
     *    19 -> "This the largest prime number under 20"
     *    11 -> "This is the 4th largest prime number under 20"
     *
     *    If the number is above 20, or not prime number print: "Invalid entry", use a 'default'
     *    statement for this
     */
    public static void exercise2() {
        System.out.println("\nExercise 2 - Prime numbers:");

        int inputNumber = 17;

        // Your switch statement here
    }

    /**
     * 4: BONUS! This is an optional task, but it is recommended you complete it
     * -------------------------------------------------------------------------
     * Complete exercise 2 a switch statement with -> instead of :
     * i.e. case 19 -> System.out.print("Largest prime under 20");
     *
     */
    public static void exercise3Bonus() {
        System.out.println("\nExercise 3 - Prime  numbers (Bonus)");

        // Your switch statement here
    }
}
