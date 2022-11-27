package javaoop.main._2;

public class Main {
    public static void main(String[] args) {
        Lunch yesterdaysLunch = new Lunch();
        Lunch todaysLunch = new Lunch(3.99, "Sunday");
        Lunch tomorrowsLunch = new Lunch(7.50);


        todaysLunch.printLunch();
        tomorrowsLunch.printLunch();
    }
}
