package edu.step.convertion;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Introdu rata de schimb: ");
        Scanner scanner = new Scanner(System.in);
        CurrencyConverter converter = new CurrencyConverter(scanner.nextDouble());

        double amountInMDL = 100;
        double amountInEUR = converter.convertToEUR(amountInMDL);
        System.out.println(amountInMDL + " MDL = " + amountInEUR + " EUR");

        amountInEUR = 5;
        amountInMDL = converter.convertToMDL(amountInEUR);
        System.out.println(amountInEUR + " EUR = " + amountInMDL + " MDL");

        converter.setExchangeRate(20.0);

        amountInMDL = 100;
        amountInEUR = converter.convertToEUR(amountInMDL);
        System.out.println(amountInMDL + " MDL = " + amountInEUR + " EUR");
    }
}
