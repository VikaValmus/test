package test.by.epam.valmus.task03;

public class CalculatingFunctionValues {
    public static void main(String[] args) {
        double a;
        double b;
        double h;
        a = 2;
        b = 3;
        h = 0.1;

        functionValueOutput();
        calculatingFunctionValues(a,b,h);

    }

    public static void calculatingFunctionValues(double a, double b, double h ) {
        double y = 0;
        for (double x = a; x <= b; x = x + h) {
            y = Math.tan(Math.toRadians(x));
            System.out.printf("|\t%4.1f\t|\t%.4f\t|\n", x, y);
        }
        System.out.println("------------------------");

    }

    public static void functionValueOutput() {

        System.out.println("------------------------");
        System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
        System.out.println("------------------------");

    }
}
