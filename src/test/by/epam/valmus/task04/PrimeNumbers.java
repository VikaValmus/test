package test.by.epam.valmus.task04;

public class PrimeNumbers {
    public static void main(String[] args) {
        boolean[] numbersOnSimpleStatusMap = initialize();
        actualizeSimpleStatus(numbersOnSimpleStatusMap);
        printSimpleNumbers(numbersOnSimpleStatusMap);
    }

    public static boolean[] initialize() {
        System.out.println("Enter range numbers");
        int size = 20;
        boolean[] simpleNumbers = new boolean[size];
        for (int i = 2; i < size; i++) {
            simpleNumbers[i] = true;
        }

        return simpleNumbers;
    }

    public static void actualizeSimpleStatus(boolean[] numbersOnSimpleStatusMap) {
        for (int i = 2; i * i < numbersOnSimpleStatusMap.length; i++) {
            if (numbersOnSimpleStatusMap[i]) {
                for (int j = i * i; j < numbersOnSimpleStatusMap.length; j += i) {
                    numbersOnSimpleStatusMap[j] = false;
                }
            }
        }
    }

    public static void printSimpleNumbers(boolean[] simpleNumbers) {
        for (int i = 0; i < simpleNumbers.length; i++) {
            if (simpleNumbers[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
