package javaoopadvanced._4;

import org.junit.jupiter.api.Assertions;

public class Main {
    private record Circle(int radius){
        public double calculateArea() {
            return Math.PI * Math.pow(radius, 2);
        }
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Assertions.assertEquals(78.53981633974483, circle.calculateArea());
    }
}
