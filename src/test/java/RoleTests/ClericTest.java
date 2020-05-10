package RoleTests;


import Entities.Enemies.Orc;
import Entities.Entity;
import Entities.Roles.Healers.Cleric;
import ItemsAndCreatures.Behaviours.ITreasure;
import ItemsAndCreatures.Potions;
import Rooms.Room;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClericTest {

    Cleric cleric;
    Entity enemy;
    Room room;
    ITreasure potion;

    @Before
    public void before(){
        cleric = new Cleric("Cunker", 7, 6, 6, Potions.CHOCKING_POTION);
        enemy = new Orc("Uruk", 8, 5, 8);
        room = new Room();
        potion = Potions.GREATER_HEALING_POTION;
    }

    @Test
    public void hasPotion() {
        assertEquals("Chocking potion", Potions.CHOCKING_POTION.getType());
    }

    @Test
    public void canFight(){
        cleric.fight(enemy);
        assertEquals(0, enemy.getHealthLevel());
        assertEquals(7, cleric.getHealthLevel());
    }

    @Test
    public void hasTreasures() {
        assertTrue(cleric.roleTreasures.isEmpty());
    }

    @Test
    public void roleCanTakeTreasure() {
        room.add(potion);
        cleric.takeTreasure(room, potion);
        assertEquals(1, room.getTreasures().size());
    }
}

