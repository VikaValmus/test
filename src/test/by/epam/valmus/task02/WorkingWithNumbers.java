package test.by.epam.valmus.task02;

import java.util.Random;
import java.util.Scanner;

public class WorkingWithNumbers {
    public static void main(String[] args) {
        int number = asksForTheNumberOfNumbers();
        int[] mas =enteringNumbers(number);
        int x = definitionOfNumbers(mas);

        System.out.println();
        System.out.println("x = " + x);

        int sum = sumOfNumbers(mas);
        System.out.println("sum = " + sum);
    }
    public static int asksForTheNumberOfNumbers(){
        System.out.println("Введите количество чисел");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }

    public static int[] enteringNumbers(int number) {
        int[] num = new int[number];

        for (int i = 0; i < num.length; i++) {
            Random random = new Random();
            num[i] = random.nextInt(1, 1000);
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }

        return num;
    }

    public static int definitionOfNumbers(int[] mas) {

        int count = 0;

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > 15 || mas[i] < 2) {
                count++;
            }
        }
        return count;
    }

    public static int sumOfNumbers(int[] mas){
        int sum=0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % 5 == 4) {
                sum = sum+ mas[i];
            }
        }
        return sum;
    }
}

