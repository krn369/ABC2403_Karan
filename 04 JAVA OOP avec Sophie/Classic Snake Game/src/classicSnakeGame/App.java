package classicSnakeGame;

import javax.swing.*;

// Main Class that sets up the game window and starts the game.
public class App {

	public static void main(String[] args) throws Exception {

		/*
		 * 1. WINDOW SETUP largeurDuPlateau and hauteurDuPlateau are set to 600. A new
		 * JFrame (window) is created with the title "Snake" The window is made visible
		 * sized, and centered on the screen. Resizing is disabled, and the application
		 * will close when the window is closed.
		 * 
		 * 2. GAME SETUP A new jeuDeSerpent object is created with the board dimension.
		 * This game panel is added to the window. The window size is adjusted to fit
		 * the game panel. The game panel is set to receive keyboard events.
		 */

		int largeurDuPlateau = 600;
		int hauteurDuPlateau = largeurDuPlateau;

		JFrame cadre = new JFrame("Snake"); // Frame
		cadre.setVisible(true);
		cadre.setSize(largeurDuPlateau, hauteurDuPlateau);
		cadre.setLocationRelativeTo(null);
		cadre.setResizable(false);
		cadre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		SnakeGame jeuDeSerpent = new SnakeGame(largeurDuPlateau, hauteurDuPlateau);
		cadre.add(jeuDeSerpent);
		cadre.pack();
		jeuDeSerpent.requestFocus();
	}

}

/*
 * // COMPLETE CODE OVERVIEW
 * 
 * The code creates a simple snake game where the player controls a snake that
 * moves around a grid. The snake growwq when it eats food, and the game ends if
 * the snake collides with itself or the edges of the board.
 * 
 * The SnakeGame class manages the game logic, including moving the snake,
 * detecting collisions, and drawing the game elements. The Tuile class
 * represents a single tile on the board, used for the snake's body parts and
 * the food. The App class sets up the game window and start the game.
 * 
 * By handling keyboard events, the snake's direction is controlled by the
 * players.The game loop, managed by a timer, continuously updates the game
 * state and redraws the screen to provide a smooth gameplay experience.
 */
