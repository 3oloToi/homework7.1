package com.company;

public class Medic extends Hero{
    public Medic(int health, int damage, String aSuper) {
        super(health, damage, aSuper);
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println("вылечил");

    }
}
