package RoomTests;

import Entities.Roles.Attackers.Knight;
import Entities.Roles.Role;
import ItemsAndCreatures.*;
import ItemsAndCreatures.Behaviours.ITreasure;
import Rooms.Room;
import com.sun.org.apache.xml.internal.security.keys.content.KeyName;
import com.sun.tools.javac.jvm.Items;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;
    Armour armour;
    Creatures creature;
    Weapon weapon;
    Potions potion;
    Spells spell;
    Role knight;

    @Before
    public void before(){
        room = new Room();
        knight = new Knight("Lancelot", 9, 8, 8, Weapon.DAGGER, Armour.THICK_STEEL_ARMOUR);
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

    @Test
    public void canRemoveTrasure() {
        room.add(spell);
        room.remove();
        assertEquals(0, room.getTreasures().size());
    }
}
