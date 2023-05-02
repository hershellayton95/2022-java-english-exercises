package javaoopadvanced._2;

public class Rectangle extends Shape {
    Rectangle(double width, double height) {
        super(width, height);
    }
    double calculateArea(){
        return this.width*this.height;
    }
}
