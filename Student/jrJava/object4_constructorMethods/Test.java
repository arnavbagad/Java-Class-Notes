package jrJava.object4_constructorMethods;

import java.awt.Color;
import java.awt.Graphics;

import resources.DrawingBoard;

public class Test {

	public static void main(String[] args) {

		Ball ballA = new Ball(20, 270, 3, -3, 80, Color.red);
		Ball ballB = new Ball(290, 430, -2, -1, 30, Color.blue);
		Ball ballC = new Ball(600, 380, -5, -2, 120, Color.green);

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
