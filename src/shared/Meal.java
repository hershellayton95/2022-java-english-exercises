package shared;

import java.util.Set;

public class Meal {
    private Double price;
    private Integer weightInGrams;
    private Set<String> ingredients;

    public Meal(Double price, Integer weightInGrams, Set<String> ingredients) {
        this.price = price;
        this.weightInGrams = weightInGrams;
        this.ingredients = ingredients;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getWeightInGrams() {
        return weightInGrams;
    }

    public void setWeightInGrams(Integer weightInGrams) {
        this.weightInGrams = weightInGrams;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "price=" + price + "EUR"+
                ", weightInGrams=" + weightInGrams +
                ", ingredients=" + ingredients +
                '}';
    }
}
