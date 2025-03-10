package battleship;
import org.junit.Test;
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
}