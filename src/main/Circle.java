package main;

public class Circle implements Figure {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Figure.PI * radius * radius;
    }

    @Override
    public double getCircuit() {
        return 2 * Figure.PI * radius;
    }
}
