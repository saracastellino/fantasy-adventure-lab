package RoomTests;
import Entities.Roles.Role;
import ItemsAndCreatures.*;
import Rooms.Room;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;
    Armour armour;
    Creatures creature;
    Weapon weapon;
    Potions potion;
    Spells spell;

    @Before
    public void before(){
        room = new Room();
    }

    @Test
    public void canCountTreasures() {
        assertEquals(0, room.roomTreasures.size());
    }

    @Test
    public void canAddTreasures() {
        room.add(armour);
        room.add(creature);
        room.add(weapon);
        room.add(potion);
        room.add(spell);
        assertEquals(5, room.roomTreasures.size());
    }

    @Test
    public void canRemoveTrasure() {
        room.add(spell);
        room.remove(spell);
        assertEquals(0, room.roomTreasures.size());
    }
}
