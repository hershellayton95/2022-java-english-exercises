package main.java.javaoopadvanced._1;

import main.java.shared.AirplaneMeal;
import main.java.shared.HospitalMeal;
import main.java.shared.Ingredient;
import main.java.shared.Meal;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Meal normalMeal = new Meal(7.5, 500, Set.of(Ingredient.DOUGH, Ingredient.OIL));
        HospitalMeal hospitalMeal = new HospitalMeal(600, Set.of(Ingredient.TOMATO), Set.of());
        AirplaneMeal airplaneMeal = new AirplaneMeal(11.50, 400, Set.of(Ingredient.PATTY, Ingredient.TOMATO), true);


        System.out.println(normalMeal.getPrice());
        System.out.println(hospitalMeal.getPrice());
        System.out.println(airplaneMeal.isFirstClassExclusive());
    }
}
