package battleship; 
import org.junit.Test;
import static org.junit.Assert.*;

public class ShipTest {

    @Test
    public void WhereShipHasBeenHittingHeLoseOnePointLife() {
      Ship ship = new Ship(2);
      assertTrue(ship.getLifePoints() == 2 );
      ship.beenHitting();
      assertTrue(ship.getLifePoints() == 1 );
    }

    @Test
  public void ShipHasBeenSunkIfHeDoesntPoints() {
    Ship ship = new Ship(1);
    assertTrue(ship.getLifePoints() == 1 );
    ship.beenHitting();
    assertTrue(ship.hasBeenSunk());
  }

  // ----------for running all ship-related tests--------------
  public static junit.framework.Test suite() {
     return new junit.framework.JUnit4TestAdapter(battleship.ShipTest.class);
  }
}