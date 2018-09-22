package jrJava.alienInvader_HW1;

import java.awt.Color;
import java.awt.Graphics;

public class Torpedo {

	private int x, y; // center, top
	private int vy; // vy<0
	private static int width, height;
	private static Color color;
	private boolean isCollided;
	
	
	static {
		width = 4;
		height = 12;
		color = Color.blue;
	}
	
	
	public Torpedo(int _x, int _y, int _vy){
		x = _x;
		y = _y;
		vy = _vy;
	}
	
	
	public int getX(){ return x; }
	public int getY(){ return y; }
	public static int getWidth(){ return width; }
	public static int getHeight(){ return height; }
	
	
	public void move(){
		y += vy;
		
		if(Coordinator.alien!=null){
			isCollided = Coordinator.alien.isHit(this);
			//if(isCollided) Coordinator.torpedo = null;
		}
	}
	
	
	public void draw(Graphics canvas){
		canvas.setColor(color);
		canvas.drawRect(x-width/2, y, width, height);
		
		if(isCollided){
			canvas.setColor(Color.orange);
			canvas.drawOval(x-60,  y-60,  120,  120); 
			Coordinator.torpedo = null;
		}
	}
	
}











