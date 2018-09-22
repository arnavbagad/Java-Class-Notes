package jrJava.loopString;

import java.awt.Color;
import java.awt.Graphics;

import resources.DrawingBoard;

public class Practice3 {

	public static void main(String[] args) {
		DrawingBoard board = new DrawingBoard(200, 50, 800, 600);
		Graphics canvas = board.getCanvas();

		int radius, xC, yC, i;
		int j = 14; 
		radius = 100;
		xC = 100;
		yC = 100;
		for(int k=0; k<100;k++){
			for(i=0; i<100; i++){

				canvas.setColor(Color.green);
				canvas.fillOval(xC-radius, yC-radius, radius*2, radius*2);

				board.repaint();
				xC += 6;
				try {
					Thread.sleep(j);
				} catch (InterruptedException e) {				
					e.printStackTrace();
				};
				board.clear();
			}
			canvas.setColor(Color.green);
			canvas.fillOval(600, 0, radius*2, radius*2);

			board.repaint();
			try {
				Thread.sleep(j);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			};
			board.clear();
			for(i=0; i<101; i++){

				canvas.setColor(Color.green);
				canvas.fillOval(xC-radius, yC-radius, radius*2, radius*2);

				board.repaint();
				yC += 4;
				try {
					Thread.sleep(j);
				} catch (InterruptedException e) {				
					e.printStackTrace();
				};
				board.clear();
			}
			canvas.setColor(Color.green);
			canvas.fillOval(xC-radius, yC-radius-4, radius*2, radius*2);

			board.repaint();
			try {
				Thread.sleep(j);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			};
			board.clear();
			for(i=0; i<101; i++){

				canvas.setColor(Color.green);
				canvas.fillOval(xC-radius+5, yC-radius-4, radius*2, radius*2);

				board.repaint();
				xC += -6;
				try {
					Thread.sleep(j);
				} catch (InterruptedException e) {				
					e.printStackTrace();
				};
				board.clear();
			}
			canvas.setColor(Color.green);
			canvas.fillOval(xC-radius+5, yC-radius-4, radius*2, radius*2);

			board.repaint();
			try {
				Thread.sleep(j);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			};
			board.clear();
			for(i = 0; i<101; i++){

				canvas.setColor(Color.green);
				canvas.fillOval(xC-radius+5, yC-radius-4, radius*2, radius*2);

				board.repaint();
				yC += -4;
				try {
					Thread.sleep(j);
				} catch (InterruptedException e) {				
					e.printStackTrace();
				};
				board.clear();
			}
			canvas.setColor(Color.green);
			canvas.fillOval(0, 0, radius*2, radius*2);

			board.repaint();
			try {
				Thread.sleep(j);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
			board.clear();
		}
		System.exit(0);
	}

}
