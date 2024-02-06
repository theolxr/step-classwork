package com.exercitiul3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti primul numar: ");
        double numar1 = scanner.nextDouble();

        System.out.println("Introduceti al doilea numar: ");
        double numar2 = scanner.nextDouble();

        double suma = Calculator.aduna(numar1, numar2);
        double diferenta = Calculator.scade(numar1, numar2);
        double produs = Calculator.inmulteste(numar1, numar2);
        double cat = Calculator.imparte(numar1, numar2);

        System.out.println("Suma: " + suma);
        System.out.println("Diferenta: " + diferenta);
        System.out.println("Produs: " + produs);
        System.out.println("Cat: " + cat);

        scanner.close();
    }
}
