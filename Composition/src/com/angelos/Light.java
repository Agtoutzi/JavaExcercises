package com.angelos;

public class Light {
    private String model;
    private String manufacturer;
    private int wattage;
    private String color;

    public Light(String model, String manufacturer, int wattage, String color) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.wattage = wattage;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getWattage() {
        return wattage;
    }

    public String getColor() {
        return color;
    }

    public void pressLightSwitch() {
        System.out.println("Light-switch pressed");
    }
}
