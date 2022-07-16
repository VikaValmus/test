package test.by.epam.valmus.task05;

public class IntegerTable {
    public static void main(String[] args) {
        int[] mas = {1, 2, 3, 1, 4, 5, 2, 6, 7, 3, 8, 9};

        findingTheSmallestNumberInASequence(mas);

    }

    public static void findingTheSmallestNumberInASequence(int[] mas) {
        System.out.print(mas[0]+ " ");
        for (int i = 1; i < mas.length; i++) {
            if (mas[i - 1] > mas[i]) {
                continue;
            }
            System.out.print(mas[i] + " ");
        }
    }
}
