package javabasics.two;

public class Main {
    //Run this like before to execute all the exercises
    public static void main(String[] args) {
        exerciseOne();
        exerciseTwo();
        exerciseThree();
    }

    /**
     * 1: Change (my name) to your name
     */
    public static void exerciseOne() {
        System.out.println("Hello (my name)!"); //<--- Edit this line
    }

    /**
     * 2: Add a new println statement underneath this and put your name in it,
     * this result should look exactly the same as in exercise one if done
     * correctly!
     */
    public static void exerciseTwo() {
        System.out.println("\nTask 2:");
        System.out.print("Hello");
        //Write code underneath this

        //Write code above this
    }

    /**
     * 3: Edit this code so when it 'prints' to the console, it all appears on the same line!
     * Expected print = 'This should all appear on the same line'
     */
    public static void exerciseThree() {
        System.out.println("\nTask 3: ");
        // Change the code below here
        System.out.println("This should ");
        System.out.println("all appear ");
        System.out.println("on the same line");
        // and above here
    }
}
