package javaoopadvanced._2;

public class Car implements NoiseMaker,Movable {
    @Override
    public String soundOfNoise() {
        return "Vroom";
    }

    @Override
    public double getDecimalsOfNoise() {
        return 0;
    }

    @Override
    public void moveForward() {

    }

    @Override
    public void moveBackward() {

    }
}
