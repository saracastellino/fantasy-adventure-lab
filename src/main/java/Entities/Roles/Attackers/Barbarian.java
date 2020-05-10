package Entities.Roles.Attackers;

import ItemsAndCreatures.Armour;
import ItemsAndCreatures.Weapon;


public class Barbarian extends Attacker {

    public Barbarian(String name, int healthLevel, int attackLevel, int defenceLevel, Weapon currentWeapon, Armour armour) {
        super(name, healthLevel, attackLevel, defenceLevel, currentWeapon, armour);

    }

}
