package jrJava.alienInvader3;

import java.awt.Color;
import java.awt.Graphics;

public class Missile {

	private int x, y; // center, bottom
	private int vy; // vy>0
	private static Color color;
	private static int width, height;
	private boolean isCollided;
	private static Color explosionColor;
	private static int explosionRadius;
	private Ship target;
	
	static {
		color = Color.red;
		width = 4;
		height = 10;
		explosionColor = new Color(0, 170, 0);
		explosionRadius = 80;
	}
	
	
	public Missile(int _x, int _y, int _vy, Ship _target){
		x = _x;
		y = _y;
		vy = _vy;
		target = _target;
	}
	
	
	public int getX(){ return x; }
	public int getY(){ return y; }
	public static int getWidth(){ return width; }
	public static int getHeight(){ return height; }
	
	
	
	public boolean isHit(Torpedo torpedo){
		
		if(torpedo.getX()>=x-width/2-torpedo.getWidth()/2 &&
		   torpedo.getX()<=x+width/2+torpedo.getWidth()/2 &&		
		   torpedo.getY()>=y-height-torpedo.getHeight()   &&
		   torpedo.getY()<=y){
			
			MissileManager.remove(this);
			return true; 
		}
		
		return false;
	}
	
	
	
	public void move(){
		y += vy;
		
		if(y>720) MissileManager.remove(this); 
		
		isCollided = target.isHit(this);
	}
	 
	
	public void draw(Graphics canvas){
		canvas.setColor(color);
		canvas.drawRect(x-width/2, y-height, width, height);
		
		if(isCollided){
			canvas.setColor(explosionColor);
			canvas.drawOval(x-explosionRadius, y-explosionRadius, 2*explosionRadius, 2*explosionRadius);
			Coordinator.gameOn = false;
		}
	}
	
}









