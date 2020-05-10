package Entities.Roles;

import Entities.Behaviours.IFight;
import Entities.Enemies.Enemy;
import Entities.Entity;
import ItemsAndCreatures.Behaviours.ITreasure;
import ItemsAndCreatures.Potions;
import ItemsAndCreatures.Weapon;
import Rooms.Room;

import java.util.HashMap;

public abstract class Role extends Entity {

    public HashMap<String, ITreasure> roleTreasures;

    public Role(String name, int healthLevel, int attackLevel, int defenceLevel) {
        super(name, healthLevel, attackLevel, defenceLevel);
        this.roleTreasures = new HashMap<String, ITreasure>();
    }

    public HashMap<String, ITreasure> getRoleTreasures() {
        return roleTreasures;
    }

    public void takeTreasure(Room room, ITreasure treasure) {
        ITreasure takenTreasure = room.remove();
        roleTreasures.put(takenTreasure.getType(), takenTreasure);
    }

}
