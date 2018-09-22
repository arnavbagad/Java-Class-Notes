package jrJava.alienInvader1;

import java.awt.Color;
import java.awt.Graphics;

public class Alien {

	private int x, y; // center, bottom
	private static int width, height;
	private int vx, vy;
	private static int eyeRadius;
	private Color bodyColor, eyeColor;
	private boolean isCollided;
	private static Color explosionColor;
	private static int explosionRadius;
	
	static {
		eyeRadius = 3;
		width = 25;
		height = 25;
		explosionColor = Color.pink;
		explosionRadius = 120;
	}
	
	public Alien(int _x, int _y, int _vx, int _vy, Color _bodyColor, Color _eyeColor){
		x = _x;
		y = _y;
		vx = _vx;
		vy = _vy;
		bodyColor = _bodyColor;
		eyeColor = _eyeColor;
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
			
			Coordinator.alien = null;
			return true;
		}
		
		return false;
	}
	
	
	
	public void move(){ 
		x += vx;
		y += vy;
		if(x<0+width/2 || x>800-width/2) vx *= -1;
		
		if(x==600)  Coordinator.missile = new Missile(x, y + Missile.getHeight(), 3);
	
		isCollided = Coordinator.ship.isHit(this);
	}
	
	
	
	public void draw(Graphics canvas){
		canvas.setColor(bodyColor);
		canvas.drawRect(x-width/2, y-height, width, height);
		
		canvas.setColor(eyeColor);
		canvas.fillOval(x-width/4-eyeRadius, y-height*3/4-eyeRadius, 2*eyeRadius, 2*eyeRadius);
		canvas.fillOval(x+width/4-eyeRadius, y-height*3/4-eyeRadius, 2*eyeRadius, 2*eyeRadius);
	

		if(isCollided){
			canvas.setColor(explosionColor);
			canvas.drawOval(x-explosionRadius,  y-explosionRadius, 2*explosionRadius, 2*explosionRadius);
			Coordinator.gameOn = false;
		}
	}
	
	
}















