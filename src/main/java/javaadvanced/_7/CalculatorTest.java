package main.java.javaadvanced._7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    /**
     * Exercise 1:
     *
     *
     * Create JUnit test for the add() and subtract() methods in the Calculator class.
     *
     * Test the methods with multiple test cases, including positive and negative numbers, and zero.
     *
     * Verify that the methods return the correct result for each test case.
     */
    @Test
    void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
    }

    /**
     * Exercise 2:
     *
     *
     * Create JUnit test for the multiply() and divide() methods in the Calculator class.
     *
     * Test the same kind of inputs as before as exercise 1
     *
     * Test that dividing by zero throws an ArithmeticException
     *
     *
     */
    @Test
    void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here

        Calculator calculator = new Calculator();
//        Assertions.assertThrows(?.class, () -> calculator.divide(10, ?));
    }

    /**
     * Exercise 3:
     *
     * Create a JUnit test for the power() method in the Calculator class that raises a number to a power.
     * Test the method with test cases where the base is zero, positive, and negative - the exponent is zero, one and negative
     * Test with decimals too!
     * Verify that the method returns the correct result for each test case.
     */
    @Test
    void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
    }
}