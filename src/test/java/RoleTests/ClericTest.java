package RoleTests;

import Entities.Enemies.Goblin;
import Entities.Enemies.Orc;
import Entities.Entity;
import Entities.Roles.Attackers.Knight;
import Entities.Roles.Healers.Cleric;
import ItemsAndCreatures.Armour;
import ItemsAndCreatures.Potions;
import ItemsAndCreatures.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    Entity enemy;

    @Before
    public void before(){
        cleric = new Cleric("Cunker", 7, 6, 6, Potions.CHOCKING_POTION);
        enemy = new Orc("Uruk", 8, 5, 8);
    }

    @Test
    public void canFight(){
        cleric.fight(enemy);
        assertEquals(0, enemy.getHealthLevel());
        assertEquals(7, cleric.getHealthLevel());
    }
}

