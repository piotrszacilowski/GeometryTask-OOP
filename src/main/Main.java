package main;

public class Main {
    public static void main(String[] args) {
        FigureCalculator figureCalculator = new FigureCalculator();
        printOptions();
        Figure figure = figureCalculator.chooseOption();
        System.out.println("Pole to: " + figure.getArea());
        System.out.println("Obwód to: " + figure.getCircuit());
    }

    public static void printOptions() {
        System.out.println("Wybierz figure dla ktorej pole i obwod chcesz policzyc: ");
        System.out.println(Figure.RECTANGLE + " - prostokąt");
        System.out.println(Figure.CIRCLE + " - koło");
        System.out.println(Figure.TRIANGLE + " - trójkąt");
    }
}
