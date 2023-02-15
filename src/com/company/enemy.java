package com.company;

import java.util.ArrayList;

public class enemy extends being{
    public enemy(String identifier, int health, int strength, int dexterity, int wisdom, int intelligence){
        this.identifier=identifier;
        this.health=health;
        this.strength=strength;
        this.dexterity=dexterity;
        this.wisdom=wisdom;
        this.intelligence=intelligence;
        this.gold=200;
        this.inventory=new ArrayList<>();
    }

    public void addItem(String item){
        inventory.add(item);
    }

    @Override
    public String toString(){
        return "****ENEMY STATUS****" +
                "\n\tNAME: "+getIdentifier()+
                "\tHEALTH: "+getHealth();
    }
}
