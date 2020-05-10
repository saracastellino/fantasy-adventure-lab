package Rooms;

import ItemsAndCreatures.Behaviours.ITreasure;
import com.sun.tools.javac.jvm.Items;

import java.util.ArrayList;

public class Room {

    private ArrayList<ITreasure> treasures;

    public Room() {
        this.treasures = new ArrayList<ITreasure>();
    }

    public ArrayList<ITreasure> getTreasures() {
        return treasures;
    }

    public void add(ITreasure treasure) {
        this.treasures.add(treasure);
    }

}
