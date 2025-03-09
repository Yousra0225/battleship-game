import battleship.util.*;
import org.junit.Test;
import static org.junit.Assert.*;

/**
  * Class for SeaTest
  */
public class SeaTest {
    @Test
    public void shootOnAShipOnSea() {
    Sea sea = new Sea(5,5);
    Position p = new Position(1,1);
    Ship ship = new Ship(2);
    sea.addShip(ship,p);
    assertEquals(sea.shoot(p),Answer.HIT);
  }
}
