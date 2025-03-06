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

    /**
    * Shot a cell at a position p
    * @param p the position of the cell that we want to shot
    * @return the Answer of the shot
    * @throws ArrayIndexOutOfBoundsException if the position isn't valid
    */
    public Answer shoot(Position p) throws ArrayIndexOutOfBoundsException{
        Cell c= theCells[p.getX()][p.getY()];
        Answer a=c.shot();
        if(a==Answer.HIT||a==Answer.SUNK){
            this.totLifePoints--;

        }
        return a;
    }

    /**
     * Calcul the total life points of ship also present
     * @return the total life points of this sea
     */
    public int getRemainingLifePoints(){
        return this.totLifePoints;
    }

    /**
     * get the cell at the p position
     * @param p the position of the cell that we want get
     * @return the cell
     */
    public Cell getCell(Position p){
        return this.theCells[p.getX()][p.getY()] ;
    }

    /**
    * display the game board line by line and cell by cell, on standard output,
    * the display is different for the defender or the attacker, according to parameter
    * @param defender true iff display is for defender, false if for opponent
    */
    public void display(boolean defender) {
        String res="";
        String[] alpha={"0","1","2","3","4","5","6","7","8","9"};
        for (int a=0; a<alpha.length;a++){
            res="\s"+res+ " | "+alpha[a];
        }
        for (int i=0; i<this.theCells.length;i++){
            for(int j=0; j<this.theCells[i].length;j++){
                if(j==0){
                    res=res+"\n "+i;
                }
                res=" "+res+ " | " +this.theCells[i][j].toCharacter(defender);
            }
           res=res+" | ";
        }
        System.out.println(res);
    }

 }
