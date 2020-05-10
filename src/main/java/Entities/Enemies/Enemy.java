package Entities.Enemies;

import Entities.Behaviours.IFight;
import Entities.Entity;
import Entities.Roles.Role;

public abstract class Enemy extends Entity implements IFight{

    public Enemy(String name, int healthLevel, int attackLevel, int defenceLevel) {
        super(name, healthLevel, attackLevel, defenceLevel);
    }

    public void fight(Entity role) {
        if (this.defenceLevel > role.getAttackLevel()) {
            role.setHealthLevel(0);
        }
        else {
            this.healthLevel = 0;
        }
    }

}

