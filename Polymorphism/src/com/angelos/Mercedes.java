package com.angelos;

public class Mercedes extends Car {
    public Mercedes(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Mercedes: Engine started");
    }

    @Override
    public void accelerate() {
        System.out.println("Mercedes: Car accelerated");
    }

    @Override
    public void brake() {
        System.out.println("Mercedes: Car is stopping");
    }
}
