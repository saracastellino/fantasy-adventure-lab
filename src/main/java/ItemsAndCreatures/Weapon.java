package ItemsAndCreatures;

import ItemsAndCreatures.Behaviours.ITreasure;

public enum Weapon implements ITreasure {

    DAGGER("Dagger", 1),
    SHORT_SWORD("Short Sword", 2),
    BROAD_SWORD("Broad Sword", 3),
    AXE("Axe", 4);

    protected final String type;
    protected final int attackModifier;

    Weapon(String type, int attackModifier) {
        this.type = type;
        this.attackModifier = attackModifier;
    }

    public String getType() {
        return type;
    }

    public int getAttackModifier() {
        return attackModifier;
    }
}
