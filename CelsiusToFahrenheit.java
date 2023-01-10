package com.bridgelabzz.basicjavaprograms;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        float Fahrenheit, Celsius;
        System.out.println("Enter The Temperature in Celsius");
        Scanner scanner = new Scanner(System.in);
        Celsius= scanner.nextFloat();
        Fahrenheit =((Celsius*9)/5)+32;
        System.out.println("Temperature in Fahrenheit is: " + Fahrenheit);
    }
}
