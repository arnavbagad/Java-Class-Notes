package jrJava.object2_withMethods;

import java.awt.Color;
import java.awt.Graphics;
import resources.DrawingBoard;

public class Test {

	public static void main(String[] args) {

		Ball ballA = new Ball();
		ballA.x = 200;
		ballA.y = 270;
		ballA.xSpeed = 3;
		ballA.ySpeed = -3;
		ballA.radius = 80;
		ballA.color = Color.red;

		Ball ballB = new Ball();
		ballB.x = 290;
		ballB.y = 430;
		ballB.xSpeed = -2;
		ballB.ySpeed = 1;
		ballB.radius = 30;
		ballB.color = Color.blue;

		Ball ballC = new Ball();
		ballC.x = 600;
		ballC.y = 300;
		ballC.xSpeed = -5;
		ballC.ySpeed = -2;
		ballC.radius = 120;
		ballC.color = Color.green;

		DrawingBoard board = new DrawingBoard(200, 50, 800, 600);
		Graphics canvas = board.getCanvas();

		for(int i=0; i<100;i++){

			ballA.move();
			ballB.move();
			ballC.move();

			ballA.grow();
			ballB.grow();
			ballC.grow();

			if(i%20==0 && i!=0){
				ballA.speedUp();
				ballB.speedUp();
				ballC.speedUp();
			}

			board.clear();
			ballA.draw(canvas);
			ballB.draw(canvas);
			ballC.draw(canvas);
			board.repaint();

			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
