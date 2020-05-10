package ItemsAndCreatures;

public enum Potions {

    CHOCKING_POTION("Chocking potion", 8, 0),
    HEALING_POTION("Healing potion", 0, 4),
    GREATER_HEALING_POTION("Greater Healing potion", 0, 4);

    private final String type;
    private final int defenceModifier;
    private final int healingPower;

    Potions(String type, int defenceModifier, int healingPower) {
        this.type = type;
        this.defenceModifier = defenceModifier;
        this.healingPower = healingPower;
    }

    public String getType() {
        return type;
    }

    public int getDefenceModifier() {
        return defenceModifier;
    }

    public int getHealingPower() {
        return healingPower;
    }
}
