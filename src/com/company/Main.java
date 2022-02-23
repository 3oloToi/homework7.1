package com.company;

public class Main {

    public static void main(String[] args) {
        Magic magic = new Magic(190,22,"run");
        Medic medic= new Medic(200, 10, "Treat");
        Warrior warrior =new Warrior(150, 25,"Attack");
        Hero[] comands ={magic,medic,warrior};
        for (int i = 0; i <comands.length ; i++) {
            comands[i].applySuperAbility("1");

        }

    }
}
