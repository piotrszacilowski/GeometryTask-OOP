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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Koło: ");
        sb.append("promień: " + radius + ", ");
        sb.append("pole: " + getArea() + ", ");
        sb.append("obwód: " + getCircuit());
        return sb.toString();
    }
}
