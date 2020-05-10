package Entities.Roles.Spellcasters;

import ItemsAndCreatures.Creatures;
import ItemsAndCreatures.Spells;

public class Warlock extends SpellCaster {
    public Warlock(String name, int healthLevel, int attackLevel, int defenceLevel, Creatures creature, Spells spell) {
        super(name, healthLevel, attackLevel, defenceLevel, creature, spell);
    }
}
