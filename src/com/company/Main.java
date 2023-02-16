package com.company;

public class Main {

    public static void main(String[] args) {
        player bob = new player("bob", 10, 10, 10, 10, 10);
        bob.addItem("Teddy Bear");

        enemy evilbob=new enemy("EvilBob",5,5,5,5,5);
        evilbob.addItem("Spice for Life");
        evilbob.addItem("Other");

        battle one = new battle(bob,evilbob);
    }
}
