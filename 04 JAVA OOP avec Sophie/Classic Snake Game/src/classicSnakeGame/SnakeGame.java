package classicSnakeGame;

import java.awt.*; // For graphics and event handling.
import java.awt.event.*; // For graphics and event handling.
import java.util.ArrayList; // For using array lists.
import java.util.Random; // For generation random numbers.
import javax.swing.*; // For creating a graphical user interface(GUI)

public class SnakeGame extends JPanel implements ActionListener, KeyListener { // CLASS Snake Game extends Jpanel (a
																				// component for drawing graphics) and
																				// implements ActionListenr and
																				// KeyListener interfaces (to handle
																				// actions and keyboard events)

	// Inner Class for Tiles
	private class Tuile { // It represents a tile on the board and it has two properties x&y which are its
							// coordinates. The constructor initializes these properties.
		int x;
		int y;

		Tuile(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	// Instance Variables
	int largeurDuPlateau; // boardWidth
	int hauteurDuPlateau; // boardHeight
	int tailleDeTuile = 25; // store the size of each tile.

	// snake
	Tuile teteDuSerpent; // snake head
	ArrayList<Tuile> corpsDuSerpent; // snake body

	// food
	Tuile nourriture; // the food tile
	Random random; // aleatoire random number generator

	// game logic
	int vitesseX; // Velocity X and Y stores the snake's movement direction.
	int vitesseY;
	Timer boucleDeJeu; // It is a timer for the game loop.
	int intervalleDeTemps = 200; // Initial interval (in milliseconds) for slower speed.

	boolean jeuTerminer = false; // It indicates if the game is over.

	// CONSTRUCTOR

//    	It sets the board dimensions and background color.
//    	It adds a key listener to capture the keyboard events.
//    	It initializes the snake's head and body.
//    	It places the initial food tile and sets the initial snake movement direction.
//    	It starts the game loop timer.

	SnakeGame(int largeurDuPlateau, int hauteurDuPlateau) {
		this.largeurDuPlateau = largeurDuPlateau;
		this.hauteurDuPlateau = hauteurDuPlateau;
		setPreferredSize(new Dimension(this.largeurDuPlateau, this.hauteurDuPlateau));
		setBackground(Color.black);
		addKeyListener(this);
		setFocusable(true);

		teteDuSerpent = new Tuile(5, 5);
		corpsDuSerpent = new ArrayList<Tuile>();

		nourriture = new Tuile(10, 10);
		random = new Random();
		placerNourriture();

		vitesseX = 1;
		vitesseY = 0;

		// game timer
		boucleDeJeu = new Timer(intervalleDeTemps, this); // how long it takes to start timer, milliseconds gone between
															// frames
		boucleDeJeu.start();
	}

	// Drawing the Game.
	// This method is called whenever the game needs to be redrawn. It clears the
	// screen and then calls the dessiner method to draw the current state of the
	// game.
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		dessiner(g); // draw
	}

	// This method (dessiner) draws the game elements: grid lines, The food tile,
	// The snake's head and body, The score or "Game Over" message.
	public void dessiner(Graphics g) {
		// Grid Lines
		for (int i = 0; i < largeurDuPlateau / tailleDeTuile; i++) {
			// (x1, y1, x2, y2)
			g.drawLine(i * tailleDeTuile, 0, i * tailleDeTuile, hauteurDuPlateau);
			g.drawLine(0, i * tailleDeTuile, largeurDuPlateau, i * tailleDeTuile);
		}

		// Food
		g.setColor(Color.red);
		// g.fillRect(food.x*tileSize, food.y*tileSize, tileSize, tileSize);
		g.fill3DRect(nourriture.x * tailleDeTuile, nourriture.y * tailleDeTuile, tailleDeTuile, tailleDeTuile, true);

		// Snake Head
		g.setColor(Color.green);
		// g.fillRect(snakeHead.x, snakeHead.y, tileSize, tileSize);
		// g.fillRect(snakeHead.x*tileSize, snakeHead.y*tileSize, tileSize, tileSize);
		g.fill3DRect(teteDuSerpent.x * tailleDeTuile, teteDuSerpent.y * tailleDeTuile, tailleDeTuile, tailleDeTuile,
				true);

		// Snake Body
		for (int i = 0; i < corpsDuSerpent.size(); i++) {
			Tuile partieSerpent = corpsDuSerpent.get(i);
			// g.fillRect(snakePart.x*tileSize, snakePart.y*tileSize, tileSize, tileSize);
			g.fill3DRect(partieSerpent.x * tailleDeTuile, partieSerpent.y * tailleDeTuile, tailleDeTuile, tailleDeTuile,
					true);
		}

		// Score
		g.setFont(new Font("Arial", Font.PLAIN, 16));
		if (jeuTerminer) {
			g.setColor(Color.red);
			g.drawString("Game Over: " + String.valueOf(corpsDuSerpent.size()), tailleDeTuile - 16, tailleDeTuile);
		} else {
			g.drawString("Score: " + String.valueOf(corpsDuSerpent.size()), tailleDeTuile - 16, tailleDeTuile);
		}
	}

	// Placing Food
	// This method places the food tile at a random position on the board.
	public void placerNourriture() {
		nourriture.x = random.nextInt(largeurDuPlateau / tailleDeTuile);
		nourriture.y = random.nextInt(hauteurDuPlateau / tailleDeTuile);
	}

	// Moving the Snake
	/*
	 * This method moves the snake: Checks if the snake eats the food and grows.
	 * Moves the snake's body to follow the head. Moves the snake's head in the
	 * current direction Checks for the collisions with the snake's body or the
	 * board edges to end the game.
	 */
	public void deplacer() { // move
		// eat food
		if (collision(teteDuSerpent, nourriture)) {
			corpsDuSerpent.add(new Tuile(nourriture.x, nourriture.y));
			placerNourriture();
			augmenterVitesse(); // Increase spped when the snake eats food
		}

		// move snake body
		for (int i = corpsDuSerpent.size() - 1; i >= 0; i--) {
			Tuile partieSerpent = corpsDuSerpent.get(i);
			if (i == 0) { // right before the head
				partieSerpent.x = teteDuSerpent.x;
				partieSerpent.y = teteDuSerpent.y;
			} else {
				Tuile partieSerpentPrecedent = corpsDuSerpent.get(i - 1);
				partieSerpent.x = partieSerpentPrecedent.x;
				partieSerpent.y = partieSerpentPrecedent.y;
			}
		}
		// move snake head
		teteDuSerpent.x += vitesseX;
		teteDuSerpent.y += vitesseY;

		// game over conditions
		for (int i = 0; i < corpsDuSerpent.size(); i++) {
			Tuile partieSerpent = corpsDuSerpent.get(i);

			// collide with snake head
			if (collision(teteDuSerpent, partieSerpent)) {
				jeuTerminer = true;
			}
		}

		if (teteDuSerpent.x * tailleDeTuile < 0 || teteDuSerpent.x * tailleDeTuile > largeurDuPlateau || // passed left
																											// border or
																											// right
																											// border
				teteDuSerpent.y * tailleDeTuile < 0 || teteDuSerpent.y * tailleDeTuile > hauteurDuPlateau) { // passed
																												// top
																												// border
																												// or
																												// bottom
																												// border
			jeuTerminer = true;
		}
	}

	// Collision Detection
	// This method checks if two tiles occupy the same position.
	public boolean collision(Tuile tile1, Tuile tile2) {
		return tile1.x == tile2.x && tile1.y == tile2.y;
	}

	// Handling timer Events. This method is called by the timer to update the game
	// state and
	// redraw the screen at regular intervals. If the game is over, it stops the
	// timer.
	@Override
	public void actionPerformed(ActionEvent e) { // called every x milliseconds by gameLoop timer
		deplacer();
		repaint();
		if (jeuTerminer) {
			boucleDeJeu.stop();
		}
	}

	// Handling Key Presses

	// These methods handle keyboard events. When a key is pressed, It changes the
	// direction of the snake if the new direction is not directly opposite to the
	// current direction.

	@Override
	public void keyPressed(KeyEvent e) {
		// System.out.println("KeyEvent: " + e.getKeyCode());
		if (e.getKeyCode() == KeyEvent.VK_UP && vitesseY != 1) {
			vitesseX = 0;
			vitesseY = -1;
		} else if (e.getKeyCode() == KeyEvent.VK_DOWN && vitesseY != -1) {
			vitesseX = 0;
			vitesseY = 1;
		} else if (e.getKeyCode() == KeyEvent.VK_LEFT && vitesseX != 1) {
			vitesseX = -1;
			vitesseY = 0;
		} else if (e.getKeyCode() == KeyEvent.VK_RIGHT && vitesseX != -1) {
			vitesseX = 1;
			vitesseY = 0;
		}
	}

	// not needed
	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	private void augmenterVitesse() {
		if (intervalleDeTemps > 50) { // Set a minimum speed limit
			intervalleDeTemps -= 10; // Decrease the interval by 10 milliseconds

			boucleDeJeu.setDelay(intervalleDeTemps); // Update the timer with the new interval
		}
	}
}