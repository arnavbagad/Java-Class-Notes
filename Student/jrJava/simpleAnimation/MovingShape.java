package jrJava.simpleAnimation;

import java.awt.Color;
import java.awt.Graphics2D;

import resources.DrawingBoard;

public class MovingShape {

	public static void main(String[] args) {

		DrawingBoard board = new DrawingBoard(0, 0, 700, 500);
		Graphics2D canvas = board.getCanvas();
		
		int cornerX = 200;
		int cornerY = 100;
		int width = 150;
		int height = 150;

		for(int i=0; i<=100; i++)
		board.clear();
		canvas.setColor(Color.red);
		cornerX = cornerX + 5;
		cornerY = cornerY + 2;
		canvas.fillOval(cornerX, cornerY, width, height);
		board.repaint();
		try {
			Thread.sleep(30);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
