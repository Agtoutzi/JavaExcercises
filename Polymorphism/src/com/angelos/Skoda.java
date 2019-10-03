package com.angelos;

public class Skoda extends Car {
    public Skoda(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Skoda: Engine started");
    }

    @Override
    public void accelerate() {
        System.out.println("Skoda: Car accelerated");
    }

    @Override
    public void brake() {
        System.out.println("Skoda: Car is stopping");
    }
}
