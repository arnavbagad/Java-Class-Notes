package jrJava.loop;

import java.awt.Color;
import java.awt.Graphics;

import resources.DrawingBoard;

public class Practice4 {


	public static void main(String[] args) {

		DrawingBoard board = new DrawingBoard(200, 200, 800, 800);
		Graphics canvas = board.getCanvas();

		int radius, xC, yC;

		radius = 100;
		xC = 100;
		yC = 100;
		for(int i = 0; i<=100; i++){

			canvas.setColor(Color.red);
			canvas.fillOval(xC-radius, yC-radius, radius*2, radius*2);

			board.repaint();
			xC += 6;
			try {
				Thread.sleep(35);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			};
			board.clear();
		}
		System.exit(0);
	}

}
