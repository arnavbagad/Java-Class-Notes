package myPractive.arnav;

import java.awt.Color;
import java.awt.Graphics;

import resources.DrawingBoard;

public class Animation {


	public static void main(String[] args) {

		DrawingBoard board = new DrawingBoard(100, 100, 1000, 1000);
		Graphics canvas = board.getCanvas();

		int radius, xC, yC;

		radius = 100;
		xC = 100;
		yC = 100;
		for(int i = 0; i<25; i++){

			canvas.setColor(Color.red);
			canvas.fillOval(xC-radius, yC-radius, radius*2, radius*2);

			board.repaint();
			yC += 24;
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			};
			board.clear();
		}
		for(int i = 0; i<41; i++){

			canvas.setColor(Color.blue);
			canvas.fillOval(xC-radius, yC-radius-26, radius*2, radius*2);

			board.repaint();
			xC += 20;
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			};
			board.clear();
		}
		for(int i = 0; i<25; i++){

			canvas.setColor(Color.green);
			canvas.fillOval(xC-radius-22, yC-radius-20, radius*2, radius*2);

			board.repaint();
			yC += -24;
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			};
			board.clear();
		}
		for(int i = 0; i<41; i++){

			canvas.setColor(Color.orange);
			canvas.fillOval(xC-radius-20, yC-radius, radius*2, radius*2);

			board.repaint();
			xC += -20;
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			};
			board.clear();
		}
		canvas.setColor(Color.orange);
		canvas.fillOval(0, 0, radius*2, radius*2);

		System.exit(0);
	}


}
