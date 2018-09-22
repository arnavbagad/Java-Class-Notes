package jrJava.alienInvader_HW1;

import java.awt.Color;
import java.awt.Graphics;
import resources.DrawingBoard;

public class Coordinator {

	public static Ship ship;
	public static Alien alien;
	public static Torpedo torpedo;
	public static Missile missile;
	
	
	public static void main(String[] args) {
		
		DrawingBoard board = new DrawingBoard(200, 0, 800, 750);
		Graphics canvas = board.getCanvas();
		
		ship = new Ship(400, 590);
		alien = new Alien(500, 0, 0, 4, Color.green, Color.darkGray);
		
		missile = new Missile(300, 0, 5);
		
		
		while(true){
			
			ship.move();
			if(alien!=null) alien.move();
			if(torpedo!=null) torpedo.move();
			missile.move();
			
			board.clear();
			ship.draw(canvas); 
			if(alien!=null) alien.draw(canvas); 
			if(torpedo!=null) torpedo.draw(canvas); 
			missile.draw(canvas); 
			board.repaint();
			
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) { }
			
		}
	}

}
