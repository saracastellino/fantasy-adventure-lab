package Entities.Roles.Attackers;

import ItemsAndCreatures.Weapon;
import ItemsAndCreatures.Armour;

import java.util.HashMap;

public class Dwarf extends Attacker {

    public Dwarf(String name, int healthLevel, int attackLevel, int defenceLevel, Weapon currentWeapon, Armour armour) {
        super(name, healthLevel, attackLevel, defenceLevel, currentWeapon, armour);
    }

}
