package edu.step.convertion;

public class CurrencyConverter {
    private double exchangeRate;

    public CurrencyConverter(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        if (exchangeRate > 0) {
            this.exchangeRate = exchangeRate;
            System.out.println("Rata de schimb sa actualizat cu succes");
        } else {
            System.out.println("Introdu o suma pozitiva!!!");
        }
    }

    public double convertToEUR(double amountInMDL) {
        if (amountInMDL >= 0) {
            return amountInMDL / exchangeRate;
        } else {
            System.out.println("Introdu o suma pozitiva!!!");
            return -1;
        }
    }

    public double convertToMDL(double amountInEUR) {
        if (amountInEUR >= 0) {
            return amountInEUR * exchangeRate;
        } else {
            System.out.println("Introdu o suma pozitiva!!!");
            return -1;
        }
    }
}
