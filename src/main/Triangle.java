package main;

public class Triangle implements Figure {
    private final double sideA;
    private final double sideB;
    private final double sideC;
    private final double height;

    public Triangle(double sideA, double sideB, double sideC, double height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * sideA * height;
    }

    @Override
    public double getCircuit() {
        return sideA + sideB + sideC;
    }
}
