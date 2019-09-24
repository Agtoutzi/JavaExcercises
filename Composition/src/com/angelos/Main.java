package com.angelos;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("2208", "Dell", "240", dimensions);
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();


        Size size = new Size(5000, 3000, 2800);
        RoomColor roomColor = new RoomColor(12345);
        FloorType floorType = new FloorType("Mastoras", "Wood");
        Door door = new Door("Sec-S25", "Ballomenos doors", 100, 230, "white");
        Couch couch = new Couch("Berlina", "Botos", 3, "grey", 35);
        Chair chair = new Chair("S10", "Home Love", 120, "light-grey");
        TV tv = new TV("SQ55H", "Samsung", 55, new Dimensions(90,65,13));
        Light light = new Light("A45", "Philips", 45, "warm white");
        LivingRoom livingRoom = new LivingRoom(size, roomColor, floorType, door, couch, chair, tv, light);

        livingRoom.opernDoor();
        livingRoom.openLight();
        livingRoom.getCouch().sitOn();
        livingRoom.openTV();
    }
}
