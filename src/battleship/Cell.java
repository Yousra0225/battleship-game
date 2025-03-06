package battleship;

/**
  * Class for Cell
  */
public class Cell {
  Ship ship;
  boolean shot;

  /**
    * Constructor of Cell class, create a cell and initialize if she contains a ship or have been shot.
    */
  public Cell() {
    this.ship = null;
    this.shot = false;
  }

  /** Provides the ship in this cell.
  * @return the ship in this cell or null if she doesn't have ship
  */
  public Ship getShip() {
    return this.ship;
  }

  /**
  * Check if the cell is empty, when his ship is null
  * @return true if the cell is empty else return false
  */
  public Boolean empty(){
      return this.ship==null;
  }
}