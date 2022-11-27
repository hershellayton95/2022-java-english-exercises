package javaoop.main._2;

public class Lunch {
    Double price = null;
    String nameOfDayEaten = null;
    int lunchWeightInGrams;

    Lunch(Double price, String nameOfDayEaten) {
        System.out.println("We ran our constructor 1!");
        this.price = price;
        this.nameOfDayEaten = nameOfDayEaten;
    }

    Lunch(Double price) {
        System.out.println("We ran our constructor 2!");
        this.price = price;
    }

    public Lunch() {
        System.out.println("We ran our constructor 3!");
    }

    public void printLunch() {
        System.out.println("Lunch{" +
                "price=" + price +
                ", nameOfDayEaten='" + nameOfDayEaten + '\'' +
                ", lunchWeightInGrams='" + lunchWeightInGrams + '\'' +
                '}');
    }
}
