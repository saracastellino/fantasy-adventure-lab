package Entities.Roles.Attackers;


import Entities.Roles.Role;
import ItemsAndCreatures.Armour;
import ItemsAndCreatures.Weapon;

import java.util.HashMap;

public abstract class Attacker extends Role {

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


}
