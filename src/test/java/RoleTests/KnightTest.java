package RoleTests;

import Entities.Enemies.Goblin;
import Entities.Enemies.Orc;
import Entities.Entity;
import Entities.Roles.Attackers.Barbarian;
import Entities.Roles.Attackers.Knight;
import ItemsAndCreatures.Armour;
import ItemsAndCreatures.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class KnightTest {

    Knight knight;
    Entity enemy;

    @Before
    public void before() {
        knight = new Knight("Lancelot", 9, 8, 8, Weapon.SHORT_SWORD, Armour.CHAINMAIL_ARMOUR);
        enemy = new Goblin("Onhif", 9, 3, 5);
    }

    @Test
    public void canFight(){
        knight.fight(enemy);
        assertEquals(0, enemy.getHealthLevel());
        assertEquals(9, knight.getHealthLevel());
    }

}
