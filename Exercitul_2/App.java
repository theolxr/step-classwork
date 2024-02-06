package com.exercitul2;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        TempConverter tempConverter = new TempConverter();

        System.out.print("Introduceți temperatura în grade Celsius: ");
        Scanner scanner = new Scanner(System.in);
        tempConverter.convertToFahr(scanner.nextDouble());

        System.out.print("Introduceți temperatura în grade Fahrenheit: ");
        Scanner scanner1 = new Scanner(System.in);
        tempConverter.convertToCelsius(scanner1.nextDouble());

        scanner.close();
    }
}
