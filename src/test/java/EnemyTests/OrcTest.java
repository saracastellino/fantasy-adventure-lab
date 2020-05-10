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

public class OrcTest {

    Orc orc;
    Entity role;

    @Before
    public void before() {
        orc = new Orc("Wiuch", 8, 7, 5);
        role = new Knight("Lancelot", 9, 8, 8, Weapon.SHORT_SWORD, Armour.CHAINMAIL_ARMOUR);
    }

    @Test
    public void canFight() {
        orc.fight(role);
        assertEquals(9, role.getHealthLevel());
        assertEquals(0, orc.getHealthLevel());
    }
}