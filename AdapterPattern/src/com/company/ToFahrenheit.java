package com.company;

public class ToFahrenheit implements AdapterToFahrenheit {
    private Celsius celsius;

    public ToFahrenheit(Celsius celsius){
        this.celsius = celsius;
    }

    @Override
    public double degree() {
        return (((celsius.degree()*9)/5)+32);
    }
}


