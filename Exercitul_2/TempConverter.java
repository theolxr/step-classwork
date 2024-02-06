package com.exercitul2;

public class TempConverter {
    public void convertToFahr(double celsius) {
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + "C → " + fahrenheit + "F");
    }

    public void convertToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5/9;
        System.out.print(fahrenheit + "F → " + celsius + "C");
    }
}
