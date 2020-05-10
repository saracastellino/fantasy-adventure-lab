package Entities.Roles;

import Entities.Behaviours.IFight;
import Entities.Enemies.Enemy;
import Entities.Entity;

public abstract class Role extends Entity {

    public Role(String name, int healthLevel, int attackLevel, int defenceLevel) {
        super(name, healthLevel, attackLevel, defenceLevel);
    }
//
//    public void fight(Enemy enemy) {
//        if (this.attackLevel > enemy.getDefenceLevel()) {
//            enemy.healthLevel -= enemy.getHealthLevel();
//        }
//        this.healthLevel = 0;
//    }


}
