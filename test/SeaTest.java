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

  @Test(expected=ArrayIndexOutOfBoundsException.class)
  public void ShootIsInvalid() {
    Sea sea = new Sea(5,5);
    Position p = new Position(7,5);
    sea.shoot(p);
  }

  @Test
  public void testAnswersIsSunkAfterLastShot() {
    Sea sea = new Sea(10,10);
    Position p =new Position(2, 2);
    Ship s= new Ship(1);
    sea.addShip(s, p);
    Answer a=sea.shoot(p);
    assertEquals(Answer.SUNK,a);
    assertTrue(s.hasBeenSunk());
    }

    @Test
    public void testAnswersIsMissedAfterLastShot() {
      Sea sea = new Sea(10,10);
      Position p =new Position(2, 2);
      Answer a=sea.shoot(p);
      assertEquals(Answer.MISSED,a);
    }

    @Test
    public void testAnswersIsHitAfterLastShot() {
      Sea sea = new Sea(10,10);
      Position p =new Position(2, 2);
      Ship s = new Ship(2);
      sea.addShip(s,p);
      Answer a=sea.shoot(p);
      assertEquals(Answer.HIT,a);
      assertFalse(s.hasBeenSunk());
    }

    @Test
    public void testIfTheTotalOfLifePointsIfAShiphasBeenSunk(){
      Sea sea = new Sea(10,10);
      Position p =new Position(2, 2);
      Ship s = new Ship(1);
      sea.addShip(s,p);
      Answer a=sea.shoot(p);
      assertEquals(Answer.SUNK,a);
      assertEquals(sea.getRemainingLifePoints(),0);
    }

    @Test(expected=IllegalStateException.class)
    public void addShipVerticallyOutsideTheSea() {
      Sea sea = new Sea(5,5);
      Position position = new Position(4,4);
      Ship ship = new Ship(7);
      sea.addShipVertically(ship,position);
    }

    @Test(expected=IllegalStateException.class)
    public void addShipVerticallyWhenShipIsAlreadyHere() {
      Sea sea = new Sea(5,5);
      Position position = new Position(3,3);
      Ship ship = new Ship(2);
      sea.addShipVertically(ship,position);
      sea.addShipVertically(ship,position);
    }

  @Test
    public void addShipVerticallyInsideTheSea() {
      Sea sea = new Sea(5,5);
      Position position = new Position(1,3);
      Ship ship = new Ship(2);
      sea.addShipVertically(ship,position);
      assertEquals(sea.getRemainingLifePoints(),2);
    }

    @Test(expected=IllegalStateException.class)
    public void addShipHorizontallyOutsideTheSea() {
      Sea sea = new Sea(5,5);
      Position position = new Position(4,4);
      Ship ship = new Ship(7);
      sea.addShipHorizontally(ship,position);
    }

    @Test(expected=IllegalStateException.class)
    public void addShipHorizontallyWhenShipIsAlreadyHere() {
      Sea sea = new Sea(5,5);
      Position position = new Position(3,3);
      Ship ship = new Ship(2);
      sea.addShipHorizontally(ship,position);
      sea.addShipHorizontally(ship,position);
  }


}
