package jrJava.alienInvader_HW1;

import java.awt.Color;
import java.awt.Graphics;

public class Missile {

	private int x, y; // center, bottom
	private int vy; // vy>0
	private static int width, height;
	private static Color color;
	
	static {
		width = 4;
		height = 10;
		color = Color.red;
	}
	
	
	public Missile(int _x, int _y, int _vy){
		x = _x;
		y = _y;
		vy = _vy;
	}
	
	
	public void move(){
		y += vy;
	}
	
	
	public void draw(Graphics canvas){
		canvas.setColor(color);
		canvas.drawRect(x-width/2, y-height, width, height);
	}
	
}









