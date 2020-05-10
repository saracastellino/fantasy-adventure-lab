package Entities.Roles.Attackers;

import Entities.Entity;
import ItemsAndCreatures.Armour;
import ItemsAndCreatures.Weapon;


public class Barbarian extends Attacker {

    public Barbarian(String name, int healthLevel, int attackLevel, int defenceLevel, Weapon currentWeapon, Armour armour) {
        super(name, healthLevel, attackLevel, defenceLevel, currentWeapon, armour);
    }


    public void fight(Entity rival) {
        int extraAttackLevel = this.attackLevel + this.getArmour().getDefenceModifier() + this.getCurrentWeapon().getAttackModifier();
        if (extraAttackLevel > rival.getDefenceLevel()) {
            rival.setHealthLevel(0);
        } else {
            this.healthLevel = 0;
        }
    }

}
