package Entities.Roles.Attackers;

import ItemsAndCreatures.Weapon;
import ItemsAndCreatures.Armour;

import java.util.HashMap;

public class Knight extends Attacker {

    public Knight(String name, int healthLevel, int attackLevel, int defenceLevel, Weapon currentWeapon, Armour armour) {
        super(name, healthLevel, attackLevel, defenceLevel, currentWeapon, armour);
    }

}
