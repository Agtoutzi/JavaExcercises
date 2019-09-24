package com.angelos;

public class LivingRoom {
    private Size size;
    private RoomColor color;
    private FloorType floorType;
    private Door door;
    private Couch couch;
    private Chair chair;
    private TV tv;
    private Light light;

    public LivingRoom(Size size, RoomColor color, FloorType floorType, Door door, Couch couch, Chair chair, TV tv, Light light) {
        this.size = size;
        this.color = color;
        this.floorType = floorType;
        this.door = door;
        this.couch = couch;
        this.chair = chair;
        this.tv = tv;
        this.light = light;
    }

    public void openTV() {
        tv.pressPowerButton();
    }

    public void openLight() {
        light.pressLightSwitch();
    }

    public void opernDoor() {
        door.turnDoorHandle();
        door.push();
        System.out.println("Door opened");
    }

    public Couch getCouch() {
        return couch;
    }
}
