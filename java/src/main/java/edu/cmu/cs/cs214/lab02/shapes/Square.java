package edu.cmu.cs.cs214.lab02.shapes;

public class Square implements Shape {
    private double sideLen;

    public Square(double sideLen) {
        this.sideLen = sideLen;
    }

    public double getSide1() {
        return sideLen;
    }

    public double getSide2() {
        return sideLen;
    }

    public double getArea() {
        return getSide1() * getSide2();
    }
}
