package com.angelos;

public class FloorType {
    private String manufacturer;
    private String material;

    public FloorType(String manufacturer, String material) {
        this.manufacturer = manufacturer;
        this.material = material;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getMaterial() {
        return material;
    }
}
