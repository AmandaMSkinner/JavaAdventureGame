package com.company;

import java.util.Scanner;

public class battle {
    public battle(player p, enemy e){
        int choice;
        Scanner scan = new Scanner(System.in);
        while(p.getHealth()>0&&e.getHealth()>0) {
            battlePrompt(p, e);
            int n=scan.nextInt();
            battleAction(p, e, n);
        }
    }

    public void battlePrompt(player p, enemy e){
        System.out.println("****BATTLE STATUS****");
        System.out.println("\t"+p.getIdentifier()+"\t\t\tVS\t\t"+e.getIdentifier());
        System.out.println("\tHEALTH: "+p.getHealth()+"\t\t\tHEALTH: "+e.getHealth());
        System.out.println("****BATTLE CHOICES****");
        System.out.println("\t1. Strength Attack");
        System.out.println("\t2. Dexterity Attack");
        System.out.println("\t3. Wisdom Attack");
        System.out.println("\t4. Intelligence Attack");
        System.out.println("\t5. RAW RUSH Attack");
    }

    public void battleAction(player p, enemy e, int n){
        if(n==1){
            System.out.println("STRENGTH ATTACK CHOSEN");
        }
    }
}

