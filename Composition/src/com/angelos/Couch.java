package com.angelos;

public class Couch {
    private String model;
    private String manufacturer;
    private int numOfSeats;
    private String color;
    private int weight;

    public Couch(String model, String manufacturer, int numOfSeats, String color, int weight) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.numOfSeats = numOfSeats;
        this.color = color;
        this.weight = weight;
    }

    public void sitOn() {
        System.out.println("Sitting on couch");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }
}
