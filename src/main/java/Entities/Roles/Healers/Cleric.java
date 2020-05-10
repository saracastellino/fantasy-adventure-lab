package Entities.Roles.Healers;

import Entities.Behaviours.IFight;
import Entities.Entity;
import Entities.Roles.Role;
import ItemsAndCreatures.Potions;

import java.util.HashMap;

public class Cleric extends Role implements IFight {

    private Potions potion;

    public Cleric(String name, int healthLevel, int attackLevel, int defenceLevel, Potions potion) {
        super(name, healthLevel, attackLevel, defenceLevel);
        this.potion = potion;
    }
    public Potions getPotion() {
        return potion;
    }

    public void fight(Entity rival) {
        int extraAttackLevel = this.attackLevel + this.getPotion().getDefenceModifier();
        if (extraAttackLevel > rival.getDefenceLevel()) {
            rival.setHealthLevel(0);
        } else {
            this.healthLevel = 0;
        }
    }
}