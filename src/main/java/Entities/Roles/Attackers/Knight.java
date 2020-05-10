package Entities.Roles.Attackers;

import Entities.Behaviours.IFight;
import Entities.Entity;
import Entities.Roles.Role;
import ItemsAndCreatures.Weapon;
import ItemsAndCreatures.Armour;

import java.util.HashMap;

public class Knight extends Attacker implements IFight {

    public Knight(String name, int healthLevel, int attackLevel, int defenceLevel, Weapon currentWeapon, Armour armour) {
        super(name, healthLevel, attackLevel, defenceLevel, currentWeapon, armour);
    }

//
//    public void inspiringSpeech(Role player) {
//        int attackLevel = player.getAttackLevel();
//        player.setAttackLevel(attackLevel += 1);
//        int defenceLevel = player.getDefenceLevel();
//        player.setDefenceLevel(defenceLevel += 1);
//    }

    public void fight(Entity entity){

    }

}
