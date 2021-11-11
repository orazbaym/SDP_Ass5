package com.company;

public class Main {

    public static void main(String[] args) {
        ToFahrenheit CelsiusToFahrenheit = new ToFahrenheit(new MyCityCelsius());
        System.out.println(CelsiusToFahrenheit.degree());
    }
}
