# Battleship Game
## Author Yousra Chbib
## Description: Battleship (Naval Battle Game) :
*The game of Battleship is a two-player strategy game where players take turns to attack each other’s fleet of ships. The game board is a grid, and players can place their ships on it either vertically or horizontally. Ships are represented by a number of grid cells based on their length. Players aim to hit and sink all the ships of the opposing player.*
Here’s a simplified breakdown of the game mechanics:
- The grid (or ![Sea](src/battleship/Sea.java)) is represented by a two-dimensional array of ![Cells](src/battleship/Cell.java).
- Each ![Ship](src/battleship/Ship.java) has a length and a set of life points that decrease when it is hit.
- The attacker chooses a target cell on the grid. If the cell is not occupied by a ship, the defender announces “*missed.*” If the cell contains a ship, the defender announces whether it is “*hit*” or “*sunk*” depending on whether all the cells of the ship have been hit.