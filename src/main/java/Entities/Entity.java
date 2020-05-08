package Entities;

public abstract class Entity {

    private String name;
    private int healthLevel;
    private int attackLevel;
    private int defenceLevel;

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
}
