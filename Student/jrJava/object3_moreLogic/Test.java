package jrJava.object3_moreLogic;

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

		while(true){

			ballA.move();
			ballB.move();
			ballC.move();

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
