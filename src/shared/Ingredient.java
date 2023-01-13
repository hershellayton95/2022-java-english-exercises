package shared;

public enum Ingredient {
    BUN(0.2),
    PATTY(1.5),
    SAUCE(0.1),
    CHEESE(0.5),
    DOUGH(.2),
    TOMATO(.07),
    POTATO(.05),
    OIL(.1);

    private double price;

    Ingredient(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
