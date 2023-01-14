package main.java.shared;

import java.util.HashSet;
import java.util.Set;

public class HospitalMeal extends Meal {
    private Set<DietaryRequirement> dietaryRequirements;

    public HospitalMeal(Integer weightInGrams, Set<Ingredient> ingredients, Set<DietaryRequirement> dietaryRequirements) {
        super(0.0, weightInGrams, ingredients);
        this.dietaryRequirements = dietaryRequirements;
    }

    public HospitalMeal(Integer weightInGrams, Set<Ingredient> ingredients) {
        super(0.0, weightInGrams, ingredients);
        this.dietaryRequirements = new HashSet<>();
    }

    public Set<DietaryRequirement> getDietaryRequirements() {
        return dietaryRequirements;
    }

    public void setDietaryRequirements(Set<DietaryRequirement> dietaryRequirements) {
        this.dietaryRequirements = dietaryRequirements;
    }
}
