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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Trójkąt, ");
        sb.append("bok A: " + sideA + ", ");
        sb.append("bok B: " + sideB + ", ");
        sb.append("bok B: " + sideC + ", ");
        sb.append("wysokość: " + height + ", ");
        sb.append("pole: " + getArea() + ", ");
        sb.append("obwód: " + getCircuit());
        return sb.toString();
    }
}
