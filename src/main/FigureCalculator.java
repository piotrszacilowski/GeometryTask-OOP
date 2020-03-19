package main;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FigureCalculator {
    private Scanner sc = new Scanner(System.in);

    public Rectangle readRectangle() {
        System.out.println("Podaj dane prostokąta. ");
        System.out.println("Podaj bok a: ");
        double a = sc.nextDouble();
        sc.nextLine();
        System.out.println("Podaj bok b: ");
        double b = sc.nextDouble();
        sc.nextLine();

        return new Rectangle(a, b);
    }

    public Triangle readTriangle() {
        System.out.println("Podaj dane trójkąta. ");
        System.out.println("Podaj bok a: ");
        double a = sc.nextDouble();
        sc.nextLine();
        System.out.println("Podaj bok b: ");
        double b = sc.nextDouble();
        sc.nextLine();
        System.out.println("Podaj bok c: ");
        double c = sc.nextDouble();
        sc.nextLine();
        System.out.println("Podaj wysokość h: ");
        double h = sc.nextDouble();
        sc.nextLine();

        return new Triangle(a, b, c, h);
    }

    public Circle readCircle() {
        System.out.println("Podaj dane okręgu. ");
        System.out.println("Podaj promień: ");
        double r = sc.nextDouble();
        sc.nextLine();

        return new Circle(r);
    }

    public Figure chooseOption() {
        try {
            int option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case Figure.RECTANGLE:
                    return readRectangle();
                case Figure.CIRCLE:
                    return readCircle();
                case Figure.TRIANGLE:
                    return readTriangle();
                default:
                    throw new NoSuchElementException();
            }
        } catch (InputMismatchException e) {
            sc.nextLine();
            throw e;
        }
    }
}