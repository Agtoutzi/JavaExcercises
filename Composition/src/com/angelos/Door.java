package com.angelos;

public class Door {
    private String model;
    private String manufacturer;
    private int width;
    private int height;
    private String color;

    public Door(String model, String manufacturer, int width, int height, String color) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public void turnDoorHandle() {
        System.out.println("Door-handle turned");
    }

    public void push() {
        System.out.println("Door pushed");
    }
}
