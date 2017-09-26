package com.example.AdditionalExercise;

import java.util.Scanner;

public class AdditionalExercise {
    public static void main(String[] args) {
        int[][] array = new int[3][3];

        Scanner scanner = new Scanner(System.in);

        int rowNumber = 0;

        int highestSum = Integer.MIN_VALUE;
        int highestSumRowNumber = 0;

        while (rowNumber < 3) {
            int columnNumber = 0;
            int actualSum = 0;
            while (columnNumber < 3) {
                System.out.printf("Wprowadz liczbę dla wiersza: %d i kolumny: %d\n", rowNumber + 1, columnNumber + 1);
                array[rowNumber][columnNumber] = scanner.nextInt();
                actualSum += array[rowNumber][columnNumber];
                columnNumber++;
            }
            if (actualSum > highestSum) {
                highestSum = actualSum;
                highestSumRowNumber = rowNumber;
            }
            rowNumber++;
        }

        System.out.printf("Najwieksza suma liczb jest w wierszu %d i wynosi %d", highestSumRowNumber + 1, highestSum);
        scanner.close();
    }
}
