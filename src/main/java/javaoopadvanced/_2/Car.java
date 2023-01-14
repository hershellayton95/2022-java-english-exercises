package main.java.javaoopadvanced._2;

public class Car implements NoiseMaker {
    @Override
    public String soundOfNoise() {
        return "Vroom";
    }

    @Override
    public double getDecimalsOfNoise() {
        return 0;
    }
}
