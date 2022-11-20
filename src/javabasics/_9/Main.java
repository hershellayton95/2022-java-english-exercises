package javabasics._9;

public class Main {
    public static void main(String[] args) {
        int age = 18;

        boolean canDrink = age >= 18;
        boolean canBarelyDrink = age == 18;

        if (canBarelyDrink) {
            System.out.println("You can barely drink!");
        } else if (canDrink) {
            System.out.println("You can drink!");
        } else {
            System.out.println("You can't drink!");
        }

    }
}
