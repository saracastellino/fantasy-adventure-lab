package Entities;

import Entities.Behaviours.IFight;

public abstract class Entity {

    protected String name;
    protected int healthLevel;
    protected int attackLevel;
    protected int defenceLevel;

    public Entity(String name, int healthLevel, int attackLevel, int defenceLevel) {
        this.name = name;
        this.healthLevel = healthLevel;
        this.attackLevel = attackLevel;
        this.defenceLevel = defenceLevel;
    }

    public String getName() {
        return name;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public int getAttackLevel() {
        return attackLevel;
    }

    public int getDefenceLevel() {
        return defenceLevel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public void setAttackLevel(int attackLevel) {
        this.attackLevel = attackLevel;
    }

    public void setDefenceLevel(int defenceLevel) {
        this.defenceLevel = defenceLevel;
    }


}
