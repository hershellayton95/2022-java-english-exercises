package javaadvanced._6;

import java.util.Date;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }

    private enum YouCanUseClassLocalEnumsLikeThis {
        THIS_CAN_ONLY_BE_ACCESSED_IN_THIS_CLASS,
        THIS_TOO
    }

    /**
     * 1:
     *
     *
     * Create an enum called "Days" with the values "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY".
     *
     * Loop over the values with Days.values() and print them out.
     */
    private enum Days{
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here

        for (Days day : Days.values()){
            System.out.println(day);
        }
    }

    /**
     * 2:
     *
     *
     * Create an enum called "Seasons" with the values "SPRING", "SUMMER", "FALL", "WINTER".
     *
     * Write a method that takes a Seasons value as input and returns the corresponding date range of months in that season.
     *
     */
    private enum Seasons {
        SPRING,
        SUMMER,
        FALL,
        WINTER
    }
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Seasons season = Seasons.SPRING;
        System.out.println(seasonMonth(season));
    }
    private static String seasonMonth(Seasons season) {
        String monthRange = null;
        switch (season) {
            case WINTER:
                monthRange = "Dicember-March";
                break;
            case SPRING:
                monthRange = "March-June";
                break;
            case SUMMER:
                monthRange = "June-September";
                break;
            case FALL:
                monthRange = "September-Dicember";
                break;
        }
        return monthRange;
    }

    /**
     * 3:
     *
     *
     * Create an enum called "TrafficLight" with the values "RED", "YELLOW", "GREEN".
     *
     * Write code that simulates the behavior of a traffic light. It should take the current state of the traffic light as input and return the next state.
     *
     */
    private enum TrafficLight {
        RED,
        YELLOW,
        GREEN
    }
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        TrafficLight light = TrafficLight.YELLOW;
        System.out.println(getSuccessivLight(light));
    }

    private static TrafficLight getSuccessivLight(TrafficLight light){
        TrafficLight nextLight = null;
        switch (light){
            case RED -> nextLight = TrafficLight.GREEN;
            case YELLOW -> nextLight = TrafficLight.RED;
            case GREEN -> nextLight = TrafficLight.YELLOW;
        }
        return nextLight;
    }

    /**
     * 4:
     *
     * Given the Days enum from exercise 1, add a local field called isWeekend and set it to true for the weekend days and false for the weekdays.
     *
     * Write an if statement that prints weekend or weekday based on the enum
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        // Your code here
        Days day = Days.SATURDAY;
        boolean isWeekend;
        if(day == Days.SATURDAY || day == Days.SUNDAY){
            isWeekend = true;
        } else {
            isWeekend = false;
        }
        System.out.println(isWeekend);
    }

    /**
     * 5:
     *
     * Create an enum called "Operator" with the values "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE".
     *
     * Write a method that takes two integers and an Operator value as input, performs the corresponding operation on the integers, and returns the result.
     */
    private enum Operator {
        ADD, SUBTRACT, MULTIPLY, DIVIDE
    }
    private static void exercise5() {
        System.out.println("\nExercise 5: ");
        // Your code here

        double num1 = 5;
        double num2 = 2;

        Operator operator = Operator.MULTIPLY;
        double operatin = extracted(num1, num2, operator);
        System.out.println(operatin);
    }

    private static double extracted(double num1, double num2, Operator operator) {
        double operatin = 0;
        switch (operator){
            case ADD -> operatin = num1 + num2;
            case SUBTRACT -> operatin = num1 - num2;
            case MULTIPLY -> operatin = num1 * num2;
            case DIVIDE -> operatin = num1 / num2;
        }
        return operatin;
    }

}
