package battleship;
import battleship.*;

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

  /**
  * Set a ship in this cell if she doesn't have a ship actually.
  * @param s the ship to set
  */
  public void setShip(Ship s) {
    if ( this.getShip() == null)
      this.ship = s;
  }

  /** Tell us if the ship in this cell has been shot.
  * @return true if the ship in this cell has been shot, false else
  */
  public boolean hasBeenShot() {
    return this.shot;
  }

  /** Allows you to shot a ship in this cell.
  * @return MISSED if failed, HIT if touched, SUNK if sunken ship
  */
  public Answer shot(){
      if (this.ship == null){
          this.shot=true;
          return Answer.MISSED;
      }
      if (!this.hasBeenShot()){
          this.shot=true;
          this.ship.beenHitting();
          if (this.ship.hasBeenSunk()){
              return Answer.SUNK;
          }
          else{
              return Answer.HIT;
          }
      }
      else{
          return Answer.MISSED;
      }
  }

  /** Inform about the state of cell depending if you are defending player or attacking player.
  * @param defender defender or attacker
  * @return the information about the state
  */
  public char toCharacter(boolean defender){
    if (defender){
        if (this.ship==null){
            return '~';
        }
        if (this.hasBeenShot()==false){
            return 'B';
        }

        return '*';
    }
    else {
        if (this.hasBeenShot()==false){
            return '.';
        }
        if (this.ship==null){
            return '~';
        }
        return '*';
    }
}
}