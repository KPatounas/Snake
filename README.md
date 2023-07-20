# Snake Game

This is a simple implementation of the classic Snake Game using Java and Swing. The game consists of a grid where a snake moves around and eats apples, growing longer as it consumes them. The player controls the direction of the snake with arrow keys and tries to avoid colliding with the walls or itself. The game ends when the snake hits the boundary or overlaps itself.

How to Play
Download or clone the source code and open it in your favorite Java development environment (e.g., Eclipse, IntelliJ, or Visual Studio Code).

Compile and run the SnakeGame class to start the game.

The game will open a Start Page window, where you can either click the "New Game" button to start playing or click the "Exit" button to close the game.

Once the game starts, control the direction of the snake using the arrow keys (Up, Down, Left, Right).

Guide the snake to eat the red apples that appear on the screen to grow longer and earn points.

Avoid hitting the boundaries or running into the snake's body. Colliding with either of these will end the game.

When the game ends, a "Game Over" message will be displayed along with the score.

Game Components
StartPage.java
This class represents the start page of the game, where the user can choose to start a new game or exit the application. It extends JFrame and implements the ActionListener interface to handle button clicks.

GamePage.java
This class represents the main game page, where the game itself is played. It extends JFrame and contains an instance of the GamePagePanel class.

GamePagePanel.java
This class is a JPanel that displays the game's graphics and handles the game's logic. It extends JPanel and implements the ActionListener interface to update the game state periodically.
