package ItemsAndCreatures;

public enum Creatures {

    DRAGON("Dragon", 4),
    GRIFFIN("Griffin", 3),
    WYVERN("Wyvern", 2);

    protected final String type;
    protected final int attackModifier;

    Creatures(String type, int attackModifier){
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


