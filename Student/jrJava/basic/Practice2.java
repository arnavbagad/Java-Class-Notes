package jrJava.basic;

import java.awt.Color;
import java.awt.Graphics;
import resources.DrawingBoard;

public class Practice2 {

	
	public static void main(String[] args) {
			
	    DrawingBoard board = new DrawingBoard(0, 0, 700, 500);	
		Graphics canvas = board.getCanvas();
		
		canvas.setColor(Color.red);
	    canvas.drawLine(0, 0, 700, 500);
		canvas.setColor(Color.green);
		canvas.fillRect(200, 200, 150, 150);
		canvas.setColor(Color.blue);
		canvas.fillOval(400, 50, 200, 200);
		
	    board.repaint();
	}

}
