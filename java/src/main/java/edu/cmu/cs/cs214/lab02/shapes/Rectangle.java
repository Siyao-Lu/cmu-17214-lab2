package edu.cmu.cs.cs214.lab02.shapes;

public class Rectangle implements Shape {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getSide1() {
        return this.width;
    }

    public double getSide2() {
        return this.height;
    }

    public double getArea() {
        return getSide1() * getSide2();
    }
}
