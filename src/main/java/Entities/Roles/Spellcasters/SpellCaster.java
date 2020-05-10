package Entities.Roles.Spellcasters;

import Entities.Behaviours.IFight;
import Entities.Entity;
import Entities.Roles.Role;
import ItemsAndCreatures.Creatures;
import ItemsAndCreatures.Spells;

public abstract class SpellCaster extends Role implements IFight {

    private Creatures creature;
    private Spells spell;

    public SpellCaster(String name, int healthLevel, int attackLevel, int defenceLevel, Creatures creature, Spells spell) {
        super(name, healthLevel, attackLevel, defenceLevel);
        this.creature = creature;
        this.spell = spell;
    }

    public Creatures getCreature() {
        return creature;
    }

    public Spells getSpell() {
        return spell;
    }

    public void fight(Entity rival) {
        int extraAttackLevel = this.attackLevel + this.getCreature().getAttackModifier() + this.getSpell().getDefendModifier();
        if (extraAttackLevel > rival.getDefenceLevel()) {
            rival.setHealthLevel(0);
        } else {
            this.healthLevel = 0;
        }
    }

}
