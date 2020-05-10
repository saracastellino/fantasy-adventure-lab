package EnemyTests;

import Entities.Enemies.Goblin;
import Entities.Enemies.Orc;
import Entities.Entity;
import Entities.Roles.Attackers.Barbarian;
import Entities.Roles.Attackers.Dwarf;
import Entities.Roles.Attackers.Knight;
import Entities.Roles.Spellcasters.Wizard;
import ItemsAndCreatures.Armour;
import ItemsAndCreatures.Creatures;
import ItemsAndCreatures.Spells;
import ItemsAndCreatures.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GoblinTest {

    Goblin goblin;
    Entity role;

    @Before
    public void before() {
        goblin = new Goblin("Onhif", 9, 3, 8);
        role = new Wizard("Plunferz", 7, 5, 3, Creatures.DRAGON, Spells.MINOR_ILLUSION);
    }

    @Test
    public void canFight() {
        goblin.fight(role);
        assertEquals(0, role.getHealthLevel());
        assertEquals(9, goblin.getHealthLevel());
    }

}