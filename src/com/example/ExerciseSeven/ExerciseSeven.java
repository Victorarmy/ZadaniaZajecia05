package com.example.ExerciseSeven;

import java.util.Scanner;

public class ExerciseSeven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] names = new String[5];

        System.out.println("Podaj 5 imion: ");

        for (int i = 0; i < 5; i++) {
            names[i] = scanner.nextLine();
        }

        for (int i = names.length -1; i >= 0; i--) {
            System.out.println("Cześć " + names[i]);
        }
    }
}
