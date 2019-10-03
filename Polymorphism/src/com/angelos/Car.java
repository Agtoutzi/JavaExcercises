package com.angelos;

public class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;
    }

    public void startEngine() {
        System.out.println("Car: Engine started");
    }

    public void accelerate() {
        System.out.println("Car: Car accelerated");
    }

    public void brake() {
        System.out.println("Car: Car is stopping");
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }
}
