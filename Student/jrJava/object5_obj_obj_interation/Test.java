package jrJava.object5_obj_obj_interation;

import java.awt.Color;
import java.awt.Graphics;
import resources.DrawingBoard;

public class Test {

	public static void main(String[] args) {
		
		Wall wall = new Wall();
		
		Ball ballA = new Ball(200, 270, 3, -3, "jrJava/object5_obj_obj_interation/yellowBall.png", "jrJava/object5_obj_obj_interation/boing.wav", wall);
		Ball ballB = new Ball(290, 430, -2, 4, "jrJava/object5_obj_obj_interation/greenBall.png", "jrJava/object5_obj_obj_interation/buzz.wav", wall);
		Ball ballC = new Ball(600, 380, -5, -2, "jrJava/object5_obj_obj_interation/redBall.png", "jrJava/object5_obj_obj_interation/scream.wav", wall);
		
		
		DrawingBoard board = new DrawingBoard(200, 50, 800, 600);
		Graphics canvas = board.getCanvas();
		
		while(true){
			
			ballA.move();
			ballB.move();
			ballC.move();
			wall.change();
			
			board.clear();
			ballA.draw(canvas);
			ballB.draw(canvas);
			ballC.draw(canvas);
			wall.draw(canvas); 
			board.repaint();
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) { }
			
		}
		
	}

}














