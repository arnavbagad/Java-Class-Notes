package jrJava.alienInvader4Alt;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import resources.DrawingBoard;
import resources.SoundPlayer;

public class Coordinator {

	public static boolean gameOn = true;
	public static int score;
	public static final int SCREEN_WIDTH;
	public static final String R_PATH = "jrJava/alienInvader4/";
	
	static {
		SCREEN_WIDTH = 800;
	}
	
	
	public static void main(String[] args) {
		
		DrawingBoard board = new DrawingBoard(200, 0, SCREEN_WIDTH, 750);
		Graphics canvas = board.getCanvas();
		
		Ship ship = new Ship(300, 590);
		
		board.addKeyListener(ship);
		board.addMouseMotionListener(ship); 
		
		board.setBackgroundImage(R_PATH + "bg.png");  
		SoundPlayer bgSound = new SoundPlayer(R_PATH + "tsunaAwakens.wav");
		bgSound.playLoop();
		
		Font scoreFont = new Font("arial", Font.BOLD, 12);
		canvas.setFont(scoreFont);
		
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
			
			canvas.setColor(Color.white); 
			canvas.drawString("score: " + score, 10, 20); 
			canvas.setColor(Color.white); 
			canvas.drawString("high score: 20147", 10, 40); 
			
			board.repaint();
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) { }
			
		}
		
		bgSound.stop();
		
	}

}







