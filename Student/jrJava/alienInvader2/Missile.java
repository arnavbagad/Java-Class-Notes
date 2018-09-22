package jrJava.alienInvader2;

import java.awt.Color;
import java.awt.Graphics;

public class Missile {

	private int x, y; // center, bottom
	private int vy; // vy>0
	private static int width, height;
	private static Color color;
	private boolean isCollided;
	private static Color explosionColor;
	private static int explosionRadius;
	
	static {
		width = 4;
		height = 10;
		color = Color.red;
		explosionColor = new Color(0, 180, 0);
		explosionRadius = 100;
	}
	
	
	public Missile(int _x, int _y, int _vy){
		x = _x;
		y = _y;
		vy = _vy;
	}
	
	
	public int getX(){ return x; }
	public int getY(){ return y; }
	public static int getWidth(){ return width; }
	public static int getHeight(){ return height; }
	

	public boolean isHit(Torpedo torpedo){
		if(   	torpedo.getX()>=x-width/2-Torpedo.getWidth()/2 &&
				torpedo.getX()<=x+width/2+Torpedo.getWidth()/2 &&
				torpedo.getY()>=y-height-Torpedo.getHeight()   &&
				torpedo.getY()<=y ){
			
			Coordinator.missile = null;
			return true;
		}
		
		return false;
	}
	
	
	public void move(){
		y += vy;
		
		isCollided = Coordinator.ship.isHit(this);
	}
	
	
	public void draw(Graphics canvas){
		canvas.setColor(color);
		canvas.drawRect(x-width/2, y-height, width, height); 
		
		if(isCollided){
			canvas.setColor(explosionColor);
			canvas.drawOval(x-explosionRadius,  y-explosionRadius, 2*explosionRadius, 2*explosionRadius);
			Coordinator.gameOn = false;
		}
	}
	
}







