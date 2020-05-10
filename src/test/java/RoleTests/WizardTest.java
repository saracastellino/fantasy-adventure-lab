package RoleTests;

import Entities.Enemies.Orc;
import Entities.Entity;
import Entities.Roles.Spellcasters.Wizard;
import ItemsAndCreatures.Creatures;
import ItemsAndCreatures.Spells;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    Entity enemy;

    @Before
    public void before() {
        wizard = new Wizard("Drynsil", 4, 7, 3, Creatures.GRIFFIN, Spells.ACID_SPLASH);
        enemy = new Orc("Wiuch", 8, 7, 5);
    }

    @Test
    public void canFight() {
        wizard.fight(enemy);
        assertEquals(0, enemy.getHealthLevel());
        assertEquals(4, wizard.getHealthLevel());
    }

}
