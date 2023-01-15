package javaoop.main._3;

public class Lunch {
    private Double price = null;
    private String nameOfDayEaten = null;
    private int lunchWeightInGrams;
    private static double maxPrice = 5;
    private int numberOfTimesWeHaveGotPrice = 0;

    Lunch(Double price, String nameOfDayEaten) {
        this.price = price;
        this.nameOfDayEaten = nameOfDayEaten;
    }

    public void printLunch() {
        System.out.println("Lunch{" +
                "price=" + price +
                ", nameOfDayEaten='" + nameOfDayEaten + '\'' +
                ", lunchWeightInGrams='" + lunchWeightInGrams + '\'' +
                '}');
    }

    void setPrice(double price) {
        if (price > maxPrice) {
            System.out.println("Cannot set greater than max price");
        } else {
            this.price = price;
        }
    }

    Double getPrice() {
        numberOfTimesWeHaveGotPrice = numberOfTimesWeHaveGotPrice + 1;
        return this.price;
    }

    int getNumberOfTimesWeHaveGotPrice() {
        return this.numberOfTimesWeHaveGotPrice;
    }

    public String getNameOfDayEaten() {
        return nameOfDayEaten;
    }

    public int getLunchWeightInGrams() {
        return lunchWeightInGrams;
    }

    public static double getMaxPrice() {
        return maxPrice;
    }
}
