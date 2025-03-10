package battleship;
import battleship.util.*;

/**
  * Class for ThirdBattleShipMain
  */
public class ThirdBattleShipMain {

  public static void main(String[] args) {
    Sea sea = new Sea(10,10);
    Ship s1 = new Ship(4);
    Ship s2 = new Ship(3);
    Position p1 = new Position(1,1);
    Position p2 = new Position(5,5);
    try {
      sea.addShipVertically(s1,p1);
      sea.addShipVertically(s2,p2);
    }
    catch(IllegalStateException e){
      System.out.println("Error of placement.");
    }
    System.out.println("Vision of Defender :");
    sea.display(true);
    System.out.println("\n "+" TotalsPoints: "+sea.getRemainingLifePoints());
    Game game = new Game(sea);
    try {
      System.out.println("\nVision of Attacker : ");
      game.play();
    }
    catch(Exception e){
      System.out.println("ERROR: Please check your answer");
    }
    if(sea.getRemainingLifePoints() == 0) {
      System.out.println("BRAVO VOUS AVEZ GAGNE");
    }
  }

}