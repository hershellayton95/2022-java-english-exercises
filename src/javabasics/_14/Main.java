package javabasics._14;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        exerciseOne();
        exerciseTwo();
        exerciseThree();
    }

    /**
     * 1a: Use a FOR EACH loop to the total sum all the elements of the ArrayList items
     * 1b: Use a FOR EACH loop to the total sum all the elements of the int array arrItems
     * 1c: Use a FOR I loop to the total sum all the elements of the int ArrayList items
     * <p>
     * Print your results
     * <p>
     * Notice how we can use the same exact code for arrays and ArrayLists
     */
    private static void exerciseOne() {
        System.out.println("Exercise 1a:");
        List<Integer> items = Arrays.asList(1, 56, 23);

        int itemsSum = 0;

        // Write your code for 1a here
        System.out.println("\nExercise 1b:");
        int[] arrItems = new int[]{1, 56, 23};

        int arrItemsSum = 0;

        // Write your code for 1b here
        System.out.println("\nExercise 1c:");
        // Write your code for 1c here, refer back to the lesson to check the fori syntax
    }

    /**
     * 2: Find the smallest and largest items in the arraylist
     * using a for each loop and an if statement/Math.min
     */
    private static void exerciseTwo() {
        List<Integer> items = Arrays.asList(300, 23, 56);
        int minNumber = Integer.MAX_VALUE;
        int maxNumber = 0;

        // Write code here
    }

    /**
     * 3: Edit the fori loop below so it only prints the first 2 names.
     */
    private static void exerciseThree() {
        List<String> names = Arrays.asList("Alan", "Alice", "Antonio", "Aziz");

        for (
                int index = 0;
                index < names.size(); // <---- Edit this line
                index = index + 1
        ) {
            System.out.println(names.get(index));
        }
    }

    /**
     * 4: Edit the fori loop below so it prints the 8 multiplication table
     * <p>
     * Bonus, how could we use a single variable to change our times table?
     * <p>
     * Multiplication tables, in case my vocabulary is different:
     * <a href="https://i.pinimg.com/originals/e0/ca/5f/e0ca5f21a16a02edbba8b758e7aa4af5.jpg">
     *      https://i.pinimg.com/originals/e0/ca/5f/e0ca5f21a16a02edbba8b758e7aa4af5.jpg
     * </a>
     */
    private static void exerciseFour() {
        for (
                int timesTableCurrentValue = 5; // <---- Edit this line
                timesTableCurrentValue <= 50; // <---- Edit this line
                timesTableCurrentValue = timesTableCurrentValue + 5 // <---- Edit this line
        ) {
            System.out.println(timesTableCurrentValue);
        }
    }

    /**
     * 5: BONUS! This is an optional task, but it is recommended you complete it
     * -------------------------------------------------------------------------
     * Inside of the fori loop below, write another fori loop to complete all
     * the multiplication tables between 1-10.
     *
     * i.e. 5  = 5,10,15,20,25,30,35,40,45,50
     *
     * When a loop in inside a loop, we call this a nested loop
     */
    private static void exerciseFive() {
        for (int timesTableNumber = 1; timesTableNumber <= 10; timesTableNumber++) {
            // Your fori loop here
        }
    }
}
