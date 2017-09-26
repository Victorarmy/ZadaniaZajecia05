package com.example.ExerciseSix;

import java.util.Scanner;

public class ExerciseSix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Podaj liczbę:");
        int number;

        while ((number = scanner.nextInt()) % 3 != 0 || number < 100 || number > 200) {
            if (number < 100) {
                System.out.println("Podana liczba jest za mala.");
                System.out.println("Podaj liczbę:");
            } else if (number > 200) {
                System.out.println("Podana liczba jest za duża.");
                System.out.println("Podaj liczbę:");
            } else {
                System.out.println("Liczba nie jest podzielna przez 3");
                System.out.println("Podaj liczbę:");
            }
        }

        System.out.println("Podałeś prawidłową liczbę");
        scanner.close();
    }
}

