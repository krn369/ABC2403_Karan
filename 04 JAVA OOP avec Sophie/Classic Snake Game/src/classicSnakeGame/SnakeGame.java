package classicSnakeGame;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

public class SnakeGame extends JPanel implements ActionListener, KeyListener {  // Snake Game
    private class Tuile { //Tile
        int x;
        int y;

        Tuile(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }  

    int largeurDuPlateau; //boardWidth
    int hauteurDuPlateau;	// boardHeight
    int tailleDeTuile = 25;  // tileSize
    
    //snake
    Tuile teteDuSerpent;  // snake head
    ArrayList<Tuile> corpsDuSerpent;  // snake body

    //food
    Tuile nourriture;
    Random random; //aleatoire
    

    //game logic
    int vitesseX; //Velocity X
    int vitesseY; // Velocity Y
    Timer boucleDeJeu; // game Loop

    boolean jeuTerminer = false;  // gameOver

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
        
		//game timer
		boucleDeJeu = new Timer(100, this); //how long it takes to start timer, milliseconds gone between frames 
        boucleDeJeu.start();
	}	
    
    public void paintComponent(Graphics g) {
		super.paintComponent(g);
		dessiner(g); // draw
	}

	public void dessiner(Graphics g) {
        //Grid Lines
        for(int i = 0; i < largeurDuPlateau/tailleDeTuile; i++) {
            //(x1, y1, x2, y2)
            g.drawLine(i*tailleDeTuile, 0, i*tailleDeTuile, hauteurDuPlateau);
            g.drawLine(0, i*tailleDeTuile, largeurDuPlateau, i*tailleDeTuile); 
        }

        //Food
        g.setColor(Color.red);
        // g.fillRect(food.x*tileSize, food.y*tileSize, tileSize, tileSize);
        g.fill3DRect(nourriture.x*tailleDeTuile, nourriture.y*tailleDeTuile, tailleDeTuile, tailleDeTuile, true);

        //Snake Head
        g.setColor(Color.green);
        // g.fillRect(snakeHead.x, snakeHead.y, tileSize, tileSize);
        // g.fillRect(snakeHead.x*tileSize, snakeHead.y*tileSize, tileSize, tileSize);
        g.fill3DRect(teteDuSerpent.x*tailleDeTuile, teteDuSerpent.y*tailleDeTuile, tailleDeTuile, tailleDeTuile, true);
        
        //Snake Body
        for (int i = 0; i < corpsDuSerpent.size(); i++) {
            Tuile snakePart = corpsDuSerpent.get(i);
            // g.fillRect(snakePart.x*tileSize, snakePart.y*tileSize, tileSize, tileSize);
            g.fill3DRect(snakePart.x*tailleDeTuile, snakePart.y*tailleDeTuile, tailleDeTuile, tailleDeTuile, true);
		}

        //Score
        g.setFont(new Font("Arial", Font.PLAIN, 16));
        if (jeuTerminer) {
            g.setColor(Color.red);
            g.drawString("Game Over: " + String.valueOf(corpsDuSerpent.size()), tailleDeTuile - 16, tailleDeTuile);
        }
        else {
            g.drawString("Score: " + String.valueOf(corpsDuSerpent.size()), tailleDeTuile - 16, tailleDeTuile);
        }
	}

    public void placerNourriture(){
        nourriture.x = random.nextInt(largeurDuPlateau/tailleDeTuile);
		nourriture.y = random.nextInt(hauteurDuPlateau/tailleDeTuile);
	}

    public void move() {
        //eat food
        if (collision(teteDuSerpent, nourriture)) {
            corpsDuSerpent.add(new Tuile(nourriture.x, nourriture.y));
            placerNourriture();
        }

        //move snake body
        for (int i = corpsDuSerpent.size()-1; i >= 0; i--) {
            Tuile snakePart = corpsDuSerpent.get(i);
            if (i == 0) { //right before the head
                snakePart.x = teteDuSerpent.x;
                snakePart.y = teteDuSerpent.y;
            }
            else {
                Tuile prevSnakePart = corpsDuSerpent.get(i-1);
                snakePart.x = prevSnakePart.x;
                snakePart.y = prevSnakePart.y;
            }
        }
        //move snake head
        teteDuSerpent.x += vitesseX;
        teteDuSerpent.y += vitesseY;

        //game over conditions
        for (int i = 0; i < corpsDuSerpent.size(); i++) {
            Tuile snakePart = corpsDuSerpent.get(i);

            //collide with snake head
            if (collision(teteDuSerpent, snakePart)) {
                jeuTerminer = true;
            }
        }

        if (teteDuSerpent.x*tailleDeTuile < 0 || teteDuSerpent.x*tailleDeTuile > largeurDuPlateau || //passed left border or right border
            teteDuSerpent.y*tailleDeTuile < 0 || teteDuSerpent.y*tailleDeTuile > hauteurDuPlateau ) { //passed top border or bottom border
            jeuTerminer = true;
        }
    }

    public boolean collision(Tuile tile1, Tuile tile2) {
        return tile1.x == tile2.x && tile1.y == tile2.y;
    }

    @Override
    public void actionPerformed(ActionEvent e) { //called every x milliseconds by gameLoop timer
        move();
        repaint();
        if (jeuTerminer) {
            boucleDeJeu.stop();
        }
    }  

    @Override
    public void keyPressed(KeyEvent e) {
        // System.out.println("KeyEvent: " + e.getKeyCode());
        if (e.getKeyCode() == KeyEvent.VK_UP && vitesseY != 1) {
            vitesseX = 0;
            vitesseY = -1;
        }
        else if (e.getKeyCode() == KeyEvent.VK_DOWN && vitesseY != -1) {
            vitesseX = 0;
            vitesseY = 1;
        }
        else if (e.getKeyCode() == KeyEvent.VK_LEFT && vitesseX != 1) {
            vitesseX = -1;
            vitesseY = 0;
        }
        else if (e.getKeyCode() == KeyEvent.VK_RIGHT && vitesseX != -1) {
            vitesseX = 1;
            vitesseY = 0;
        }
    }

    //not needed
    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}
}