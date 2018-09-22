package jrJava.conditionalIf;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;

import resources.DrawingBoard;

public class Practice5 {


	public static void main(String[] args) {

		int xC; 
		int yC;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Type in the xCenter of the circle");
		xC = scanner.nextInt();
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Type in the yCenter of the circle");
		yC = scanner.nextInt();
		
		int radius;
		
		
		

		DrawingBoard board = new DrawingBoard(200, 100, 500, 500);                
		Graphics canvas = board.getCanvas();

		if(xC>=yC){
			canvas.setColor(Color.red);
			radius = 120;
			canvas.drawOval(xC-radius, yC-radius, 2*radius, 2*radius);
		}
		else{
			canvas.setColor(Color.green);
			radius = 80;
			canvas.fillOval(xC-radius, yC-radius, 2*radius, 2*radius);
		}
		
		
		
		canvas.setColor(Color.black);
		canvas.fillRect(xC-1, yC-1, 3, 3);
		
		canvas.setColor(Color.gray);
	    canvas.drawLine(0, 0, 500, 500);
		
	    board.repaint();
	}

}














