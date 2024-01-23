package edu.cmu.cs.cs214.lab02.shapes;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getSide1() {
        return radius;
    }

    public double getSide2() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
