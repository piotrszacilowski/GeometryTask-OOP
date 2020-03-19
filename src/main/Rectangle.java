package main;

public class Rectangle implements Figure {
    private final double sideA;
    private final double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public double getCircuit() {
        return 2 * (sideA + sideB);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Prostokąt: ");
        sb.append("bok A: " + sideA + ", ");
        sb.append("bok B: " + sideB + ", ");
        sb.append("Pole: " + getArea() + ", ");
        sb.append("Obwód: " + getCircuit());

        return sb.toString();
    }
}
