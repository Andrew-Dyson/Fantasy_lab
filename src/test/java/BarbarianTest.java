import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian1;
    Barbarian barbarian2;
    Wizard wizard1;
    Wizard wizard2;

    @Before
    public void setUp(){
        barbarian1 = new Barbarian("Sam", 100, false, "club");
        barbarian2 = new Barbarian("Will", 100, true, "club");
        wizard1 = new Wizard("Jess", 100, false, "disarm");
        wizard2 = new Wizard("Harry", 100, true, "disarm");
    }

    @Test
    public void canUseWeaponAndGetString(){
        assertEquals("Jess has been successfully attacked by Sam", barbarian1.useWeaponOrSpell(wizard1));
    }

    @Test
    public void canUseWeaponAndReducePoints(){
        barbarian1.useWeaponOrSpell(wizard1);
        assertEquals(90, wizard1.getHealthPoints());
    }

    @Test
    public void canUnsuccessfullyUseWeaponAndGetString(){
        assertEquals("Harry has been unsuccessfully attacked by Will", barbarian2.useWeaponOrSpell(wizard2));
    }
}
