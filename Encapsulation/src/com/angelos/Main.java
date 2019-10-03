package com.angelos;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Angelos";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Angelos", 150, "Sword");
        System.out.println("Initial health is " + player.getHealth());

        Printer printerSingle = new Printer(false);
        Printer printerDuplex = new Printer(true);

        printerSingle.checkTonner();
        printerDuplex.checkTonner();

        printerSingle.printPages(990);
        printerDuplex.printPages(103);

        printerSingle.fillToner(10);
        printerSingle.fillToner(10);
        printerDuplex.fillToner(10);
        printerDuplex.fillToner(10);

        printerSingle.checkTonner();
        printerDuplex.checkTonner();
    }
}
