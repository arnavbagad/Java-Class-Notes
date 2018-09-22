package loopPractice;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;

import resources.DrawingBoard;

public class Loops {

	public static void main(String[] args) {

		DrawingBoard board = new DrawingBoard(500, 500, 600, 600);
		Graphics canvas = board.getCanvas();

		canvas.setColor(Color.black);
		canvas.drawRect(200, 200, 200, 200);

		System.out.println("What is the xC.");
		int n;
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		System.out.println("What is the yC.");
		int y;
		Scanner scanner1 = new Scanner(System.in);
		y = scanner.nextInt();
		System.out.println("What is the radius.");
		int z;
		Scanner scanner2 = new Scanner(System.in);
		z = scanner.nextInt();

		if(n+z>200 && n+z<400 && y+z>200 && y+z<400 && z<=300) {
			canvas.setColor(Color.yellow);
			canvas.fillOval(n, y, z*2, z*2);
			canvas.setColor(Color.black);
			canvas.fillOval(n+z, y+z, 10, 10);
			canvas.setColor(Color.black);
			canvas.drawRect(200, 200, 200, 200);
			board.repaint();
		}
		else if(n+z>=200 && n+z<=400 && y+z==205 || y+z==395 && z<300) {
			canvas.setColor(Color.green);
			canvas.fillOval(n, y, z*2, z*2);
			canvas.setColor(Color.black);
			canvas.fillOval(n+z, y+z, 10, 10);
			canvas.setColor(Color.black);
			canvas.drawRect(200, 200, 200, 200);
			board.repaint();
		}

		else{
			canvas.setColor(Color.gray);
			canvas.fillOval(n, y, z*2, z*2);
			canvas.setColor(Color.white);
			canvas.fillOval(n+z, y+z, 10, 10);
			canvas.setColor(Color.black);
			canvas.drawRect(200, 200, 200, 200);
			board.repaint();
		}


	}

}
