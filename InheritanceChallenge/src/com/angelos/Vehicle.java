package com.angelos;

public class Vehicle {
    private String name;
    private String size;
    private int movingSpeed;
    private int direction;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.movingSpeed = 0;
        this.direction = 0;
    }

    public void steer(int direction) {
        this.direction = direction;
        System.out.println("Steering at " + direction + " degrees");
    }

    public void move(int movingSpeed, int direction) {
        this.movingSpeed = movingSpeed;
        this.direction = direction;
        System.out.println("Moving at " + movingSpeed + " speed and " + direction + " direction.");
    }

    public void stop() {
        this.movingSpeed = 0;
        System.out.println("Vehicle stopped");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setMovingSpeed(int movingSpeed) {
        this.movingSpeed = movingSpeed;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getMovingSpeed() {
        return movingSpeed;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getDirection() {
        return direction;
    }
}
