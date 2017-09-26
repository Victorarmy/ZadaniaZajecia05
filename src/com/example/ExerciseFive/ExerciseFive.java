package com.example.ExerciseFive;

public class ExerciseFive {
    public static void main(String[] args) {

        int sum = 0;
        for (int evenNumber = 2; evenNumber <= 100; evenNumber += 2) {
            System.out.print(evenNumber + " ");
            sum += evenNumber;
        }
        System.out.println();
        System.out.println(sum);
    }
}
