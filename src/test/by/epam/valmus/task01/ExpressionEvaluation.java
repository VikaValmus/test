package test.by.epam.valmus.task01;

public class ExpressionEvaluation {
    public static void main(String[] args) {
        int x = 2;
        int y = 1;

        double result;

        result = numeratorCalculation(x, y) / denominatorCalculation(x, y) + x;

        System.out.println(result);

    }

    public static double numeratorCalculation(int x, int y) {
        double resultNumerator;

        resultNumerator = 1 + Math.pow(Math.sin(x + y), 2);

        return resultNumerator;

    }

    public static double denominatorCalculation(int x, int y) {
        double resultDenominator;

        resultDenominator = 2 + Math.abs(x - (2 * x / (1 + Math.pow(x, 2) * Math.pow(y, 2))));

        return resultDenominator;
    }
}
