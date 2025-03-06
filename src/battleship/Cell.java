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