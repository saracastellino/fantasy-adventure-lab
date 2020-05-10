package RoomTests;

import ItemsAndCreatures.Behaviours.ITreasure;
import ItemsAndCreatures.Potions;
import ItemsAndCreatures.Spells;
import Rooms.Room;
import com.sun.tools.javac.jvm.Items;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;
    ITreasure armour;
    ITreasure creature;
    ITreasure weapon;
    Potions potion;
    Spells spell;
    
    @Before
    public void before(){
        room = new Room();
    }

    @Test
    public void canCountTreasures() {
        assertEquals(0, room.getTreasures().size());
    }

    @Test
    public void canAddTreasures() {
        room.add(armour);
        room.add(creature);
        room.add(weapon);
        room.add(potion);
        room.add(spell);
        assertEquals(5, room.getTreasures().size());
    }


}
