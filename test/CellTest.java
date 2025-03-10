package battleship;
import org.junit.Test;

import battleship.Cell;
import battleship.Ship;

import static org.junit.Assert.*;

/**
  * Class for CellTest
  */

public class CellTest {

  @Test
  public void attackerCanShot() {
    Cell cell = new Cell();
    assertFalse(cell.hasBeenShot());
    assertEquals(cell.shot(),Answer.MISSED);
  }

  @Test
  public void occupiedCellHitShip() {
    Cell cell = new Cell();
    Ship ship = new Ship(5);
    assertEquals(cell.getShip(),null);
    cell.setShip(ship);
    assertFalse(cell.hasBeenShot());
    assertEquals(cell.shot(),Answer.HIT);
    assertTrue(cell.hasBeenShot());
  }
}