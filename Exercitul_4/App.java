package com.exercitul4;

import java.util.Scanner;

class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti primul numar: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduceti al doilea numar: ");
        int num2 = scanner.nextInt();

        int max = NumbersComparator.getMax(num1, num2);
        int min = NumbersComparator.getMin(num1, num2);

        System.out.println("Maximul dintre " + num1 + " și " + num2 + " este: " + max);
        System.out.println("Minimul dintre " + num1 + " și " + num2 + " este: " + min);

        scanner.close();
    }
}
