# Battleship Game
## Author : Yousra Chbib
## Description: Battleship (Naval Battle Game) 
*The game of Battleship is a two-player strategy game where players take turns to attack each other’s fleet of ships. The game board is a grid, and players can place their ships on it either vertically or horizontally. Ships are represented by a number of grid cells based on their length. Players aim to hit and sink all the ships of the opposing player.*
Here’s a simplified breakdown of the game mechanics:
- The grid (or ![Sea](src/battleship/Sea.java)) is represented by a two-dimensional array of ![Cells](src/battleship/Cell.java).
- Each ![Ship](src/battleship/Ship.java) has a length and a set of life points that decrease when it is hit.
- The attacker chooses a target cell on the grid. If the cell is not occupied by a ship, the defender announces “*missed.*” If the cell contains a ship, the defender announces whether it is “*hit*” or “*sunk*” depending on whether all the cells of the ship have been hit.

## Technologies Used
- **Java Programming Language**: The game is developed using Java, leveraging object-oriented principles to create classes for ships, cells, and the game board (sea).
- **JUnit Testing Framework**: JUnit is used for unit testing the individual components of the game, ensuring the correct behavior of the methods.
- **JAR Archives**: The game makes use of JAR files for packaging the classes and enabling easier execution. 

## Key Components of the Game
1. ![Ship](src/battleship/Ship.java) class : represents the ships in the game, where each ship has a length (and thus a set number of life points). When a ship is hit, its life points are reduced. A ship is sunk when its life points reach zero.

2. ![Cell](src/battleship/Cell.java) class : represents the ships in the game, where each ship has a length (and thus a set number of life points). When a ship is hit, its life points are reduced. A ship is sunk when its life points reach zero.

3. ![Position](src/battleship/util/Position.java): represents the coordinates of a cell on the board (X and Y coordinates).

4. ![Sea](src/battleship/Sea.java): represents the game board, where ships are placed. It manages the entire grid and allows ships to be added either vertically or horizontally. It also manages shooting by checking if a cell has been hit and if a ship has been sunk.

**Project structure :** : ![project structure](data/structure.md)