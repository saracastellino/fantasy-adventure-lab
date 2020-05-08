package RoleTests;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class KnightTest {

    private Knight knight;

    @Before
    public void before() {
        knight = new Knight();
    }

    @Test
    public void hasProperties() {
        assertNotNull(knight.getWeapon());
        assertEquals(0, 0);
    }

}
