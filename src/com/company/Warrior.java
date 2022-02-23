package com.company;

public class Warrior extends Hero{
    public Warrior(int health, int damage, String aSuper) {
        super(health, damage, aSuper);
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println("атаковал");

    }
}
