package jrJava.alienInvader3;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import resources.DrawingBoard;

public class Coordinator {

	public static boolean gameOn = true;
	
	
	public static void main(String[] args) {
		
		DrawingBoard board = new DrawingBoard(200, 0, 800, 750);
		Graphics canvas = board.getCanvas();
		
		Ship ship = new Ship(200, 590);
		
		board.addKeyListener(ship); 
		board.addMouseMotionListener(ship); 
		
		while(gameOn){
			
			AlienManager.create(ship);
			AlienManager.move();
			TorpedoManager.move();
			MissileManager.move();
			
			board.clear();
			ship.draw(canvas);
			AlienManager.draw(canvas); 
			TorpedoManager.draw(canvas);
			MissileManager.draw(canvas); 
			board.repaint();
			
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) { }
		}
		
	} 

}
