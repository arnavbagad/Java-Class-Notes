package jrJava.brickBuster;

import java.awt.Color;
import java.awt.Graphics;
import resources.DrawingBoard;


public class Coordinator {

	public static void main(String[] args) {
		
		DrawingBoard board = new DrawingBoard(100, 0, 540, 700);
		Graphics canvas = board.getCanvas();

		Deflector deflector = new Deflector(200, 600);
		board.addMouseMotionListener(deflector);
		
		Ball ball =  new Ball(200, 400, 3, 3, 4, Color.red);
		ball.setDeflector(deflector);

		BrickManager brickManager = new BrickManager(80, 14, 100);
		ball.setBrickManager(brickManager);
		
		
		while(true){
			board.clear();

			ball.move();
			ball.draw(canvas);
			Wall.draw(canvas);
			deflector.draw(canvas);
			brickManager.draw(canvas);
			
			board.repaint();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) { }
		}
	}

}