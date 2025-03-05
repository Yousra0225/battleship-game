package battleship.util;

/**
 * a position in a discrete 2D environment, a position is determined by integer
 * coordinates x and y
 * 
 * @author JC
 *
 */
public class Position {
   private int x;
   private int y;

   /**
    * creates a position corresponding to given coordinates
    * 
    * @param x the x coordinate
    * @param y the y coordinate
    */
   public Position(int x, int y) {
      this.x = x;
      this.y = y;
   }

   /**
    * @return the x coordinate
    */
   public int getX() {
      return this.x;
   }

   /**
    * @return the y coordinate
    */
   public int getY() {
      return this.y;
   }
