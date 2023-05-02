package javaoopadvanced._1;

class Animal {
    private double height, weight;

    public Animal(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

class Dog extends Animal {
    private String breed;
    public Dog(double height, double weight, String breed) {
        super(height, weight);
        this.breed = breed;
    }
    public String getBreed() {
        return this.breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public double runSpeedMetersPerSecond() {
        return getHeight() * 2;
    }
}
class Fish extends Animal {
    private String species;
    public Fish(double height, double weight, String species) {
        super(height, weight);
        this.species = species;
    }
    public String getSpecies() {
        return this.species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }

    public double swimSpeedMetersPerSecond() {
        return getWeight() * 2;
    }
}
class Bird extends Animal {
    private double wingSpan;
    public Bird(double height, double weight, double wingSpan) {
        super(height, weight);
        this.wingSpan = wingSpan;
    }
    public double getWingSpan() {
        return this.wingSpan;
    }
    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

    public double flySpeedMetersPerSecond(){
        return getWingSpan() * 4;
    }
}