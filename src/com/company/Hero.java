package com.company;

public abstract class  Hero implements HavingSuperAbility {

    private int Health;
    private  int Damage;
    public  String Super;

    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int damage) {
        Damage = damage;
    }

    public String getSuper() {
        return Super;
    }

    public void setSuper(String aSuper) {
        Super = aSuper;
    }

    public Hero(int health, int damage, String aSuper) {
        Health = health;
        Damage = damage;
        Super = aSuper;
    }
}
