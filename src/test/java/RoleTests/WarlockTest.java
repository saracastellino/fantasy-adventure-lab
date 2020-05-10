package RoleTests;

import Entities.Enemies.Goblin;
import Entities.Enemies.Orc;
import Entities.Entity;
import Entities.Roles.Attackers.Barbarian;
import Entities.Roles.Attackers.Dwarf;
import Entities.Roles.Attackers.Knight;
import Entities.Roles.Spellcasters.Warlock;
import ItemsAndCreatures.Armour;
import ItemsAndCreatures.Creatures;
import ItemsAndCreatures.Spells;
import ItemsAndCreatures.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class WarlockTest {

    Warlock warlock;
    Entity enemy;

    @Before
    public void before() {
        warlock = new Warlock("Astrel", 8, 7, 5, Creatures.WYVERN, Spells.MAGIC_MISSILE);
        enemy = new Goblin("Onhif", 9, 3, 5);
    }

    @Test
    public void canFight(){
        warlock.fight(enemy);
        assertEquals(0, enemy.getHealthLevel());
        assertEquals(8, warlock.getHealthLevel());
    }

}
