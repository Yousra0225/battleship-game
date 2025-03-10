package battleship;
import battleship.util.*;

/**
  * Class for SecondBattleShipMain
  */
public class SecondBattleShipMain {

  public static void main(String[] args){
    Sea sea = new Sea(10,10);
    Ship s1 = new Ship(6);
    Ship s2 = new Ship(4);
    Position p1 = new Position(1,1);
    Position p2 = new Position(2,2);
    sea.addShip(s1,p1);
    sea.addShip(s2,p2);
    System.out.println("\nVision of defender : ");
    sea.display(true);
    Game game = new Game(sea);
    try {
      System.out.println("\nVision of Attacker : ");
      game.play();
    }
    catch(Exception e) {
      System.out.println("ERROR: Please check your answer");
    }
  }

}