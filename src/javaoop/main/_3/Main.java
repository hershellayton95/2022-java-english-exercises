package javaoop.main._3;

public class Main {
    public static void main(String[] args) {
        Lunch todaysLunch = new Lunch(3.99, "Sunday");

        System.out.println(todaysLunch.getPrice());
        double newPrice = 5.50;

        todaysLunch.setPrice(newPrice);

        System.out.println(todaysLunch.getPrice());
        System.out.println(todaysLunch.getNumberOfTimesWeHaveGotPrice());
    }
}
