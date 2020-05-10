package RoleTests;

import Entities.Enemies.Goblin;
import Entities.Enemies.Orc;
import Entities.Entity;
import Entities.Roles.Attackers.Barbarian;
import Entities.Roles.Attackers.Dwarf;
import Entities.Roles.Attackers.Knight;
import ItemsAndCreatures.Armour;
import ItemsAndCreatures.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DwarfTest {

    Dwarf dwarf;
    Entity enemy;

    @Before
    public void before() {
        dwarf = new Dwarf("Gloin", 10, 7, 10, Weapon.AXE, Armour.LIGHT_ARMOUR);
        enemy = new Goblin("Onhif", 9, 3, 5);
    }

    @Test
    public void canFight() {
        dwarf.fight(enemy);
        assertEquals(0, enemy.getHealthLevel());
        assertEquals(10, dwarf.getHealthLevel());
    }

}
