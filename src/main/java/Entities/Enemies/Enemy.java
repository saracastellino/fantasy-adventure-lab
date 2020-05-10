package Entities.Enemies;

import Entities.Behaviours.IFight;
import Entities.Entity;
import Entities.Roles.Role;

public abstract class Enemy extends Entity {

    public int healthLevel;

    public Enemy(String name, int healthLevel, int attackLevel, int defenceLevel) {
        super(name, healthLevel, attackLevel, defenceLevel);
    }

}

