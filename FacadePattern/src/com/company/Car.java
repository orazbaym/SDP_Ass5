package com.company;

public class Car {
    private Details wheel;
    private Details tire;

    public Car(){
        wheel =new Wheel();
        tire =new Tire();
    }

    public void embedWheel(){
        wheel.embed();
    }
    public void embedTire(){
        tire.embed();
    }
}