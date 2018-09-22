package myPractice.arnav;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import resources.DrawingBoard;

public class FightingGame {

	public static void main(String[] args) {

		//Characters
		DrawingBoard board = new DrawingBoard(0, 0, 1500, 2000);
		Graphics2D canvas = board.getCanvas();

		canvas.setFont(new Font("arial", Font.BOLD, 100));		
		
		canvas.setColor(Color.black);
		canvas.fillRect(0, 0, 1500, 2000);
		
		canvas.setColor(Color.white);
		canvas.drawString("Welcome to", 430, 120);

		canvas.setColor(Color.white);
		canvas.drawString("Star Wars Fighting Game", 150, 250);
		
		
		board.repaint();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {				
			e.printStackTrace();
		};
		board.clear();

		int radius, xC, yC;

		radius = 50;
		xC = 50;
		yC = 50;

		canvas.setColor(Color.black);
		canvas.fillOval(200, 401, radius*2, radius*2);

		canvas.setColor(Color.black);
		canvas.fillRect(212, 500, 75, 100);

		canvas.setColor(Color.gray);
		canvas.fillRect(370, 350, 10, 200);

		canvas.setColor(Color.black);
		canvas.fillRect(287, 500, 100, 30);

		canvas.setColor(Color.black);
		canvas.fillRect(212, 600, 75, 50);

		canvas.setColor(Color.red);
		canvas.fillRect(370, 300, 10, 175);

		canvas.setColor(Color.green);
		canvas.fillRect(0, 650, 1500, 150);

		canvas.setColor(Color.black);
		canvas.fillRect(1125, 480, 10, 50);

		canvas.setColor(Color.black);
		canvas.fillRect(1040, 460, 100, 25);

		canvas.setColor(Color.orange);
		canvas.fillOval(1200, 401, radius*2, radius*2);

		canvas.setColor(Color.red);
		canvas.fillRect(1212, 500, 75, 100);

		canvas.setColor(Color.orange);
		canvas.fillRect(1287, 500, 100, 30);

		canvas.setColor(Color.orange);
		canvas.fillRect(1112, 500, 100, 30);

		canvas.setColor(Color.black);
		canvas.fillRect(1212, 600, 75, 50);


		board.repaint();
	}

}
