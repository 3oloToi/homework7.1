package com.company;

public class Magic extends Hero{
    public Magic(int health, int damage, String aSuper) {
        super(health, damage, aSuper);
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println("ударил");

    }
}
