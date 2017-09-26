package com.example.ExerciseThree;

public class ExerciseThree {
    public static void main(String[] args) {
        double number = 0.1;

        System.out.print(0 + ", ");
        while (number < 3.0) {
            System.out.printf("%.1f, ", number);
            number += 0.1;
        }
        System.out.printf("%.0f\n", number);

        double numberTwo = 0.1;
        System.out.print(0 + ", ");
        do {
            System.out.printf("%.1f, ", numberTwo);
            numberTwo += 0.1;
        } while (numberTwo < 3.0);

        System.out.printf("%.0f", number);
    }
}
