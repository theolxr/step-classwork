package edu.step.math;

public class Calculator {

    public static double plus(double first, double second) {
        return first + second;
    }

    public static double plus(double... numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static double minus(double first, double second) {
        return first - second;
    }

    public static double minus(double... numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum -= number;
        }
        return sum;
    }

    public static double multiply(double first, double second) {
        return first * second;
    }

    public static double multiply(double... numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum *= number;
        }
        return sum;
    }

    public static double divide(double first, double second) {
        return first * second;
    }

    public static double divide(double... numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum /= number;
        }
        return sum;
    }

    public static void multiplicationTable (double number) {
        System.out.println("Tabla înmulțirii pentru" + number + ":");
        for (int i = 0; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }

    public static int calculateToNumber(int number) {
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            sum += i;
        }
        return sum;
    }
}
