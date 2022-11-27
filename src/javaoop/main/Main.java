package javaoop.main;

public class Main {
    public static void main(String[] args) {
        Lunch todaysLunch = new Lunch();
        Lunch tomorrowsLunch = new Lunch();

        todaysLunch.nameOfDayEaten = "Sunday";
        todaysLunch.printLunchPrice();
        tomorrowsLunch.printLunchPrice();
    }
}
