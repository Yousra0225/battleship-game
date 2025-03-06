package battleship;
package battleship;
import battleship.util.*;
/**
 * Class for Sea
 */

 public class Sea {
    private Cell[][] theCells;
    private int totLifePoints;

    /**
    * Builds a Sea , the number of rows and colums have given
    * @param nbRows of this sea
    * @param nbColoms of this sea
    */
    public Sea (int nbRows,int nbColoms){
        this.theCells=new Cell [nbRows][nbColoms];
        for (int i=0;i<this.theCells.length;i++){
            for (int j=0 ; j<this.theCells[i].length;j++){
                theCells[i][j]=new Cell();
            }
        }
        this.totLifePoints=0;
    }

    /**
    * add a ship s in the position p
    * @param s ship that we want to add
    * @param p the position where we want to add the ship
    */
    public void addShip(Ship s,Position p){
        Cell c=this.theCells[p.getX()][p.getY()];
        c.setShip(s);
        this.totLifePoints++;
    }
