package battleship;
import battleship.util.*;
import io.*;
/**
  * Class for Game
  */
public class Game {
  private Sea sea;

/** Constructor of the game class, create one game to play
  * @param sea the sea of game
  */
  public Game(Sea sea){
    this.sea = sea;
  }
/**
  * Provides the sea of this game
  * @return the sea of this game
  */
  public Sea getSea(){
    return this.sea;
  }

  /**
  * Ask the player to give the attack position
  * @return the position of attack
  * @exception ArrayIndexOutOfBoundsException if position is not initialize
  */
  private Position inputPosition() throws ArrayIndexOutOfBoundsException{
    int userIntX = -1;
    int userIntY = -1;
    try {
      System.out.print("Enter the int x coordinate: ");
      userIntX = Input.readInt();
      System.out.print("Enter the int y coordinate: ");
      userIntY = Input.readInt();
    }
    catch (java.io.IOException e) {
      System.out.println("ERROR: Please enter a integer.");
    }
    if ( userIntX == -1 || userIntY == -1) {
      throw new ArrayIndexOutOfBoundsException();
    }
    Position position = new Position(userIntX,userIntY);
    return position;
  }

  /**
  * Play the game
  */
  public void play(){
    while(this.sea.getRemainingLifePoints() > 0){
      this.sea.display(false);
      try {
        Position p = this.inputPosition();
        System.out.println(this.sea.shoot(p));
      }
      catch(Exception e){
        System.out.println("Please enter a good position.");
        play();
      }
    }
  }
}