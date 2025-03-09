package battleship; 
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShipTest {

    @Test
    public void WhereShipHasBeenHittingHeLoseOnePointLife() {
      Ship ship = new Ship(2);
      assertTrue(ship.getLifePoints() == 2 );
      ship.beenHitting();
      assertTrue(ship.getLifePoints() == 1 );
    }
}