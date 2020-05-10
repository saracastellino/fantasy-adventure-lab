package ItemsAndCreatures;

public enum Potions {

    CHOCKING_POTION("Chocking potion", 8);

    private final String type;
    private final int defenceModifier;

    Potions(String type, int defenceModifier) {
        this.type = type;
        this.defenceModifier = defenceModifier;
    }

    public String getType() {
        return type;
    }

    public int getDefenceModifier() {
        return defenceModifier;
    }
}
