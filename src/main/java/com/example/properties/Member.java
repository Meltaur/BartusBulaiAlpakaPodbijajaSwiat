package org.epam.BDD_HT.properties;

public class Member {
    private String name;
    private int[] armyArray;

    public Member(String name, int[] armyArray){
        this.name = name;
        this.armyArray = armyArray;
    }

    public String getName(){
        return this.name;
    }

    public int[] getArmyArray(){
        return this.armyArray;
    }

}
