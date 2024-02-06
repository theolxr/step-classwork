package com.exercitiul3;

class Calculator {
    public static double aduna(double a, double b) {
        return a + b;
    }
    public static double scade(double a, double b) {
        return a - b;
    }
    public static double inmulteste(double a, double b) {
        return a * b;
    }
    public static double imparte(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Eroare: Impartirea la zero nu este permisa.");
            return 0;
        }
    }
}