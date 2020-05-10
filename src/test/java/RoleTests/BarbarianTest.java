package RoleTests;

import Entities.Enemies.Orc;
import Entities.Entity;
import Entities.Roles.Attackers.Barbarian;
import ItemsAndCreatures.Armour;
import ItemsAndCreatures.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    Entity rival;

    @Before
    public void before(){
        barbarian = new Barbarian("Conan", 10, 10, 8,  Weapon.BROAD_SWORD, Armour.STEEL_ARMOUR);
        rival = new Orc("Wiuch", 8, 7, 5);
    }

    @Test
    public void canFight(){
        barbarian.fight(rival);
        assertEquals(0, rival.getHealthLevel());
    }

}
