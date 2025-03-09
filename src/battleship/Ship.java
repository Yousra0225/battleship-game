package battleship;

/**
  * Class for Ship
  */
  public class Ship {
    private int lifePoints;

    /** Constructor of Ship class, create a ship and initialize this lifePoints.
      * @param length number of length/lifePoints
      */
    public Ship(int length){
      this.lifePoints = length;
    }

    /** Provides the information if this ship has been sunk
      * @return true if has been sunk, false else
      */
    public boolean hasBeenSunk(){
      return this.getLifePoints() == 0;
    }

    /**
      * Remove one point in this lifePoints each time the ship has been hit
      */
    public void beenHitting() {
      this.lifePoints = this.lifePoints - 1;
    }

    /** Provides the lifePoints of this ship
      * @return the lifePoints of this ship
      */
    public int getLifePoints(){
      return this.lifePoints;
    }

    /** Provides a text about this ship
      * @return a text about this ship
      */
    public String toString() {
      return "This Ship has "+ this.getLifePoints() +"life points.";
    }

  }
