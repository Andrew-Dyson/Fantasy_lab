import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room1;
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
        room1 = new Room("the do not enter room", 1, "magic shell", null, null);
    }

    @Test
    public void characterEntersEmptyRoomStringReturns(){
        assertEquals("Sam has entered the do not enter room", room1.addCharacterToRoom(barbarian1));
    }

    @Test
    public void characterEntersEmptyRoomTakesShield(){
        room1.addCharacterToRoom(barbarian1);
        assertEquals(true, barbarian1.getShield());
    }

    @Test
    public void characterEntersOccupiedRoom(){
        room1.addCharacterToRoom(barbarian1);
        String result = room1.addCharacterToRoom(barbarian2);
        assertEquals("Sam has been unsuccessfully attacked by Will", result);
    }
}
