package com.company;

import java.util.ArrayList;

public class player extends being{
    public player(String identifier, int health, int strength, int dexterity, int wisdom, int intelligence){
        this.identifier=identifier;
        this.health=health;
        this.strength=strength;
        this.dexterity=dexterity;
        this.wisdom=wisdom;
        this.intelligence=intelligence;
        this.gold=200;
        this.inventory=new ArrayList<>();
    }

    @Override
    public String toString(){
        return "****CHARACTER STATUS****" +
                "\n\tNAME: "+getIdentifier()+
                "\tHEALTH: "+getHealth()+
                "\tGOLD: "+getGold()+
                "\n\tSTR: "+getStrength()+
                "\t| DEX: "+getDexterity()+
                "\t| WIS: "+getWisdom()+
                "\t| INT: "+getIntelligence()+
                "\n\tINVENTORY: "+getInventory();
    }
}
