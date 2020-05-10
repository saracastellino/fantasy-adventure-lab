package ItemsAndCreatures;

import ItemsAndCreatures.Behaviours.ITreasure;

public enum Spells  implements ITreasure {

    ACID_SPLASH("Acid Splash", 3),
    ANIMAL_SHAPE("Animal Shape", 2),
    MAGIC_MISSILE("Magic missile", 3),
    MINOR_ILLUSION("Minor illusion", 5);

    protected final String type;
    protected final int defendModifier;

    Spells(String type, int defendModifier) {
        this.type = type;
        this.defendModifier = defendModifier;
    }

    public String getType() {
        return type;
    }

    public int getDefendModifier() {
        return defendModifier;
    }
}
