package main.java.javaoopadvanced._2;

public class Bird implements NoiseMaker {
    private double wingSpan;

    public Bird(double height, double weight, double wingSpan) {
//        super(height, weight);
        this.wingSpan = wingSpan;
    }

//    @Override
//    double calculateMovementSpeedMetersPerSecond() {
//        return this.wingSpan * 4;
//    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

    @Override
    public String soundOfNoise() {
        return "Squawk";
    }
}
