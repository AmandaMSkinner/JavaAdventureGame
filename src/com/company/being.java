package com.company;

import java.util.ArrayList;
import java.util.List;

public class being {
    public String identifier;
    public int health;
    public int strength;
    public int dexterity;
    public int wisdom;
    public int intelligence;
    public int gold;
    public List<String> inventory = new ArrayList<>();

    public String getIdentifier(){
        return identifier;
    }
    public int getHealth(){
        return health;
    }
    public int getStrength(){
        return strength;
    }
    public int getDexterity(){
        return dexterity;
    }
    public int getWisdom(){
        return wisdom;
    }
    public int getIntelligence(){
        return intelligence;
    }
    public int getGold(){
        return gold;
    }
    public List<String> getInventory() {
        return inventory;
    }
}
