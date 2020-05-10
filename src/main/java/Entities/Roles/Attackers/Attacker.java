package Entities.Roles.Attackers;

import Entities.Behaviours.IFight;
import Entities.Entity;
import Entities.Roles.Role;
import ItemsAndCreatures.Armour;
import ItemsAndCreatures.Weapon;

import java.util.HashMap;

public abstract class Attacker extends Role implements IFight {

    private HashMap<String, Weapon> weapons;
    private Weapon currentWeapon;
    private Armour armour;

    public Attacker(String name, int healthLevel, int attackLevel, int defenceLevel, Weapon currentWeapon, Armour armour) {
        super(name, healthLevel, attackLevel, defenceLevel);
        this.weapons =  new HashMap<String, Weapon>();
        this.currentWeapon = currentWeapon;
        this.armour = armour;
    }

    public HashMap<String, Weapon> getWeapons() {
        return weapons;
    }

    public Weapon getCurrentWeapon() {
        return currentWeapon;
    }

    public Armour getArmour() {
        return armour;
    }

    public void changeWeapon(String newWeapon) {
        Weapon foundWeapon = weapons.get(newWeapon);
        currentWeapon = foundWeapon;
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
