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

  @Test
  public void testIfWeCantSetASecondShipOnTheCell(){
    Sea sea = new Sea(10,10);
    Ship s= new Ship(1);
    Ship s2= new Ship(1);
    Position p= new Position(2, 2);
    sea.addShip(s, p);
    assertFalse(sea.getCell(p).getShip()==s2);
  }
}
