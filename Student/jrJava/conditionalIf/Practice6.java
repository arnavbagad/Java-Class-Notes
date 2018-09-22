package jrJava.conditionalIf;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;
import resources.DrawingBoard;

public class Practice6 {
	
	public static void main(String[] args) {
		
		int xC; 
		int yC;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Type in the xCenter of the circle");
		xC = scanner.nextInt();		
		System.out.println("Type in the yCenter of the circle");
		yC = scanner.nextInt();
		
		int radius;
		
		DrawingBoard board = new DrawingBoard(200, 100, 800, 600);                
		Graphics canvas = board.getCanvas();

		if(xC<=400){
			
			if(yC<=300){
				canvas.setColor(Color.red);
				radius = 100;
			}
			else{
				canvas.setColor(Color.green);
				radius = 70;
			}
			
		}
		else{			

			if(xC<=300){
				canvas.setColor(Color.blue);
				radius = 150;
			}
			else{
				canvas.setColor(Color.orange);
				radius = 200;
			}
			
		}
		
		
		
		canvas.fillOval(xC-radius, yC-radius, 2*radius, 2*radius);
		
		canvas.setColor(Color.black);
		canvas.fillRect(xC-1, yC-1, 3, 3);
		
		canvas.setColor(Color.gray);
	    canvas.drawLine(0, 300, 800, 300);
	    canvas.drawLine(400, 0, 400, 600);
	   
	    board.repaint();
	}

}
