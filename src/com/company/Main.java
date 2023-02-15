package com.company;

public class Main {

    public static void main(String[] args) {
        player bob = new player("bob", 10, 10, 10, 10, 10);
        System.out.println(bob);
        bob.addItem("Teddy Bear");
        System.out.println(bob);

        enemy evilbob=new enemy("EvilBob",5,5,5,5,5);
        evilbob.addItem("Spice for Life");
        evilbob.addItem("Other");
        System.out.println(evilbob);
        System.out.println(evilbob.getInventory());

        battle one = new battle(bob,evilbob);
    }
}
