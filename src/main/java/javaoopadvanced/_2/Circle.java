package javaoopadvanced._2;
public class Circle extends Shape {
    Circle(double diameter) {
        super(diameter, diameter);
    }
    double calculateArea(){
        return Math.PI * Math.pow((this.height / 2), 2);
    }
}
