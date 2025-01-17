package javaoopadvanced._1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1:
     *
     *
     * Create a class called "Dog" that extends the Animal class.
     *
     * Add a new field called "breed" to the Dog class.
     *
     * Write a constructor for the Dog class that takes in a breed, height, and weight as parameters, and passes the height and weight to the superclass constructor.
     *
     * Write getters and setters for the breed field.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here

    }

    /**
     * 2:
     *
     *
     * Create new classes called "Fish" and "Bird" that extends the Animal class.
     *
     * Add a new field called "species" to the Fish class and "wingSpan" to the Bird class.
     *
     * Also create constructors, getters and setters
     *
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
    }


    /**
     * 3:
     *
     * In the dog class create a method called runSpeedMetersPerSecond() that returns the Dog's Height * 2
     * In the fish class create a method called swimSpeedMetersPerSecond() that returns the Fish's Weight * 2
     * In the bird class create a method called flySpeedMetersPerSecond() that returns the Bird's Wingspan * 4
     *
     * Create instances of each Animal: Dog, Fish and Bird. Fill the constructors with values of your choice
     * and print out which of the animals has the fastest movement speed in MetersPerSecond
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        Dog dog1 = new Dog(1.2, 50.0, "Alan");
        Fish fish1 = new Fish(20.0, 15.0, "Salmon");
        Bird bird1 = new Bird(13.0,0.2,0.3);

        Map<String, Double> speedMap =new HashMap();
        speedMap.put("dog1", dog1.runSpeedMetersPerSecond());
        speedMap.put("fish1", fish1.swimSpeedMetersPerSecond());
        speedMap.put("bird1", bird1.flySpeedMetersPerSecond());

        String fasterAnimal = null;
        for (Map.Entry<String, Double> entry : speedMap.entrySet()){
            String key = entry.getKey();
            double value = entry.getValue();
            if(fasterAnimal == null){
                fasterAnimal = key;
            }
            if(value > speedMap.get(fasterAnimal)){
                fasterAnimal = key;
            }
        }
        System.out.println(fasterAnimal.toUpperCase() + " is the faster animal here!");
    }
}
