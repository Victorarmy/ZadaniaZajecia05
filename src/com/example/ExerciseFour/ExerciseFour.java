package com.example.ExerciseFour;

import java.util.Scanner;

public class ExerciseFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj współrzędną X:");
        int X = scanner.nextInt();
        System.out.println("Podaj współrzędną Y:");
        int Y = scanner.nextInt();

        String quater = X > 0 ? (Y > 0 ? "I" : "II") : (Y < 0 ? "III" : "IV");

        System.out.println("Punkt znajduje się w " + quater + " ćwiartce układu współrządnych");
        scanner.close();
    }
}
