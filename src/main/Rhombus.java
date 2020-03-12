package main;

public class Rhombus implements Figure {
    private final double side;
    private final double height;

    public Rhombus(double side, double height) {
        this.side = side;
        this.height = height;
    }

    @Override
    public double getArea() {
        return side * height;
    }

    @Override
    public double getCircuit() {
        return 4 * side;
    }
}
