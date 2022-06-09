package day9;

import static java.lang.Math.*;

public class Circle extends Figure{
    private double radius;


    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI * pow(radius, 2);
    }

    @Override
    public double perimeter() {
        return 2 * PI * radius;
    }
}
