package Entities.Enemies;

import Entities.Entity;

public class Orc extends Enemy {

    public Orc(String name, int healthLevel, int attackLevel, int defenceLevel) {
        super(name, healthLevel, attackLevel, defenceLevel);
    }

    public void fight(Entity role) {
        if (this.defenceLevel < role.getAttackLevel()) {
            this.healthLevel = 0;
        }
        else {
            role.setHealthLevel(0);
        }
    }

}
