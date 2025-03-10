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
}