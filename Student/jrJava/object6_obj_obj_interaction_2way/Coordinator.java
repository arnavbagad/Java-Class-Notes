package jrJava.object6_obj_obj_interaction_2way;

import java.awt.Color;
import java.awt.Graphics;

import resources.DrawingBoard;
import resources.SoundPlayer;

public class Coordinator {

	public static void main(String[] args) {
		
		Wall wall = new Wall();
		
		Ball ballA = new Ball(200, 270, 3, -3, "jrJava/object6_obj_obj_interaction_2way/yellowBall.png",  wall);
		Ball ballB = new Ball(290, 430, -3, 4, "jrJava/object6_obj_obj_interaction_2way/greenBall.png", wall);
		
		ballB.setTheOtherBall(ballA);   // ballB.theOtherBall = ballA;
		ballA.setTheOtherBall(ballB);   // ballA.theOtherBall = ballB;
		
		DrawingBoard board = new DrawingBoard(200, 50, 800, 600);
		Graphics canvas = board.getCanvas();
		
		board.setBackgroundImage("jrJava/object6_obj_obj_interaction_2way/bg3.png");
		SoundPlayer bgSound = new SoundPlayer("jrJava/object6_obj_obj_interaction_2way/harryPotter_low.wav");
		bgSound.playLoop();
		
		
		while(true){
			
			ballA.move();
			ballB.move();
			//ballA.grow();
			//ballB.grow();
			Ball.grow();
			
			wall.change();
			
			board.clear();
			ballA.draw(canvas);
			ballB.draw(canvas);
			wall.draw(canvas); 
			board.repaint();
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) { }
			
		}
		
	}

}














