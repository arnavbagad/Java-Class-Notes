package jrJava.alienInvader2;

import java.awt.Color;
import java.awt.Graphics;
import java.net.SocketOption;

import resources.DrawingBoard;

public class Coordinator {

	public static boolean gameOn = true;
	public static Ship ship;
	public static Alien alien;
	public static Torpedo torpedo;
	public static Missile missile;
	
	
	public static void main(String[] args) {
		
		DrawingBoard board = new DrawingBoard(200, 0, 800, 750);
		Graphics canvas = board.getCanvas();
		
		ship = new Ship(400, 590);
		alien = new Alien(300, 0, 4, 4, Color.green, Color.darkGray);
		
		board.addKeyListener(ship); 
		board.addMouseMotionListener(ship); 
		
		while(gameOn){
			
			if(alien!=null) alien.move();
			if(torpedo!=null) torpedo.move();
			if(missile!=null) missile.move();
			
			board.clear();
			ship.draw(canvas);
			if(alien!=null) alien.draw(canvas);  
			if(torpedo!=null) torpedo.draw(canvas);
			if(missile!=null) missile.draw(canvas); 
			board.repaint(); 
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) { } 
		
		}
	
	}

}
