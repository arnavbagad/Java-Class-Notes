package jrJava.basic;

import java.awt.Color;
import java.awt.Graphics;

import resources.DrawingBoard;

public class Practice1 {

	
	public static void main(String[] args) {
		DrawingBoard board = new DrawingBoard(200, 50, 800, 600);
        Graphics canvas = board.getCanvas();
		
		
        canvas.setColor(Color.blue);
        canvas.fillRect(300, 100, 400, 200);
		board.repaint();
	}

}
