package com.angelos;

public class TV {
    private String model;
    private String manufacturer;
    private int size;
    private Dimensions dimensions;

    public TV(String model, String manufacturer, int size, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.dimensions = dimensions;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void pressPowerButton() {
        System.out.println("TV power button pressed");
    }
}
