package com.angelos;

public class Nissan extends Car {

    public Nissan(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Nissan: Engine started");
    }

    @Override
    public void accelerate() {
        System.out.println("Nissan: Car accelerated");
    }

    @Override
    public void brake() {
        System.out.println("Nissan: Car is stopping");
    }
}
