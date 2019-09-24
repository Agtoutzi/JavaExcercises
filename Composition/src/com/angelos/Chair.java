package com.angelos;

public class Chair {
    private String model;
    private String manufacturer;
    private int maxWeight;
    private String color;

    public Chair(String model, String manufacturer, int maxWeight, String color) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.maxWeight = maxWeight;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public String getColor() {
        return color;
    }
}
