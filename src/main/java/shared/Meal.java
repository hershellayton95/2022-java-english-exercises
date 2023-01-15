package shared;

import java.util.Set;

public class Meal {
    private Double price;
    private Integer weightInGrams;
    private Set<Ingredient> ingredients;

    public Meal(Double price, Integer weightInGrams, Set<Ingredient> ingredients) {
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

    public Set<Ingredient> getIngredients() {
        return ingredients;
    }

    @Override
    public boolean equals(Object theOtherObject) {
        if (this == theOtherObject) {
            return true;
        }

        if (!(theOtherObject instanceof Meal)) {
            return false;
        }

        Meal meal = (Meal) theOtherObject;

        if (meal.getWeightInGrams() == this.getWeightInGrams()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        if(weightInGrams != null)  {
            return weightInGrams;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Meal{" +
                "price=" + price +
                ", weightInGrams=" + weightInGrams +
                ", ingredients=" + ingredients +
                '}';
    }
}
