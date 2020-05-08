package Entities.Roles.Attackers;

import Entities.Roles.Role;
import ItemsAndCreatures.Armour;
import ItemsAndCreatures.Weapon;

import java.util.HashMap;

public abstract class Attacker extends Role {

    protected HashMap<String, Weapon> weapons;
    protected Weapon currentWeapon;
    protected Armour armour;

    public Attacker(String name) {
        super(name);
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
