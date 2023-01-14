package main.java.shared;

import java.util.Set;

public class AirplaneMeal extends Meal {
    private boolean isFirstClassExclusive;

    public AirplaneMeal(Double price, Integer weightInGrams, Set<Ingredient> ingredients, boolean isFirstClassExclusive) {
        super(price, weightInGrams, ingredients);
        this.isFirstClassExclusive = isFirstClassExclusive;
    }

    public boolean isFirstClassExclusive() {
        return isFirstClassExclusive;
    }

    public void setFirstClassExclusive(boolean firstClassExclusive) {
        isFirstClassExclusive = firstClassExclusive;
    }
}
