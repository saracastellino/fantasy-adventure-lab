package ItemsAndCreatures;

public enum Weapon {

    DAGGER("Dagger", 1),
    SHORT_SWORD("Short Sword", 2),
    BROAD_SWORD("Broad Sword", 3),
    AXE("Axe", 4);

    private final String type;
    private final int attackModifier;

    Weapon(String type, int attackModifier) {
        this.type = type;
        this.attackModifier = attackModifier;
    }

}
