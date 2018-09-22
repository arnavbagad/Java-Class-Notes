package loopPractice;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;

import resources.DrawingBoard;

public class Loop {

	public static void main(String[] args) {

		DrawingBoard board = new DrawingBoard(500, 500, 600, 600);
		Graphics canvas = board.getCanvas();

		canvas.setColor(Color.black);
		canvas.drawRect(100, 100, 400, 400);

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

		if(n+z>=100 && n+z<=500 && y+z>=100 && y+z<=500 && z<=200) {
			canvas.setColor(Color.yellow);
			canvas.fillOval(n, y, z*2, z*2);
			canvas.setColor(Color.black);
			canvas.fillOval(n+z, y+z, 10, 10);
			board.repaint();
		}
		
		else{
			canvas.setColor(Color.gray);
			canvas.fillOval(n, y, z*2, z*2);
			canvas.setColor(Color.white);
			canvas.fillOval(n+z, y+z, 10, 10);
			board.repaint();
		}


	}

}
