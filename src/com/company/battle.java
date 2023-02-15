package com.company;

import java.util.Scanner;
import java.util.Random;

public class battle {
    public battle(player p, enemy e) {
        int pHealth0 = p.getHealth();
        int eHealth0 = e.getHealth();
        int choice;
        Scanner scan = new Scanner(System.in);
        while (p.getHealth() > 0 && e.getHealth() > 0) {
            battlePrompt(p, e);
            int n = scan.nextInt();
            battleAction(p, e, n);
            if (e.getHealth() == 0) {
                System.out.println("YOU DEFEATED " + e.getIdentifier());
                itemTransfer(p,e);
            } else if (p.getHealth() == 0) {
                System.out.println("YOU WERE DEFEATED BY " + e.getIdentifier());
                System.out.println("PRESS ENTER TO TRY AGAIN!");
                Scanner rip = new Scanner(System.in);
                p.setHealth(pHealth0);
                e.setHealth(eHealth0);
                rip.nextLine();
            }
        }
    }

    public void battlePrompt(player p, enemy e) {
        System.out.println("****BATTLE STATUS****");
        System.out.println("\t" + p.getIdentifier() + "\t\t\tVS\t\t" + e.getIdentifier());
        System.out.println("\tHEALTH: " + p.getHealth() + "\t\t\tHEALTH: " + e.getHealth());
        System.out.println("****BATTLE CHOICES****");
        System.out.println("\t1. Strength Attack");
        System.out.println("\t2. Dexterity Attack");
        System.out.println("\t3. Wisdom Attack");
        System.out.println("\t4. Intelligence Attack");
        System.out.println("\t5. RAW RUSH Attack");
    }

    public void battleAction(player p, enemy e, int n) {
        int playerAtk = 0;
        int enemyAtk = 0;
        if (n == 1) {
            playerAtk = battleValue(p.getStrength());
            enemyAtk = battleValue(e.getStrength());
            System.out.println("You attack with a STRENGTH value of " + playerAtk);
        }
        if (playerAtk > enemyAtk) {
            System.out.println("You hit " + e.getIdentifier() + " for " + playerAtk + " damage!");
            e.setHealth(e.getHealth() - playerAtk);
            System.out.println(e.getIdentifier() + " drops to " + e.getHealth() + " health.");
        } else if (enemyAtk > playerAtk) {
            System.out.println(e.getIdentifier() + " hits " + p.getIdentifier() + " for " + enemyAtk + " damage!");
            p.setHealth(p.getHealth() - enemyAtk);
            System.out.println(p.getIdentifier() + " drops to " + p.getHealth() + " health.");
        } else {
            System.out.println("The combatants are evenly matched and take 1 damage in the struggle!");
            e.setHealth(e.getHealth() - 1);
            p.setHealth(p.getHealth() - 1);
        }

    }

    private int battleValue(int max) {
        Random ran = new Random();
        return (ran.nextInt(max) + 1);
    }

    public void itemTransfer(player p, enemy e){
        System.out.println("You gain "+e.getGold()+" gold and all things carried by "+e.getIdentifier());
        p.setGold(p.getGold()+e.getGold());
        for(String i: e.getInventory()){
            p.addItem(i);
        }
        System.out.println(p);
    }
}
