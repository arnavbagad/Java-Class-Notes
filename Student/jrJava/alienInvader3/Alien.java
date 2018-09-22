package jrJava.alienInvader3;

import java.awt.Color;
import java.awt.Graphics;

public class Alien {

	private int x, y; // center, bottom
	private int vx, vy;
	private Color bodyColor, eyeColor;
	private static int width , height;
	private static int eyeRadius;
	private boolean isCollided;
	private static Color explosionColor;
	private static int explosionRadius;
	private Ship target;
	
	
	static {
		width = 25;
		height = 25;
		eyeRadius = 3;
		explosionColor = Color.pink;
		explosionRadius = 100;
	}
	
	
	public Alien(int _x, int _y, int _vx, int _vy, Color _bodyColor, Color _eyeColor, Ship _target){
		x = _x;
		y = _y;
		vx = _vx;
		vy = _vy;
		bodyColor = _bodyColor;
		eyeColor = _eyeColor;
		target = _target;
	}
	
	
	public int getX(){ return x; }
	public int getY(){ return y; }
	public static int getWidth(){ return width; }
	public static int getHeight(){ return height; }
	

	
	public boolean isHit(Torpedo torpedo){
		
		/*
		boolean b1 = torpedo.getX()>=x-width/2-torpedo.getWidth()/2;
		boolean b2 = torpedo.getX()<=x+width/2+torpedo.getWidth()/2;
		boolean b3 = torpedo.getY()>=y-height-torpedo.getHeight();
		boolean b4 = torpedo.getY()<=y;
		
		if(b1&& b2 && b3 && b4){
			return true;
		}
		*/
		
		if(torpedo.getX()>=x-width/2-torpedo.getWidth()/2 &&
		   torpedo.getX()<=x+width/2+torpedo.getWidth()/2 &&		
		   torpedo.getY()>=y-height-torpedo.getHeight()   &&
		   torpedo.getY()<=y){
			
			AlienManager.remove(this);
			return true;
		} 
		
		return false;
	}
	
	
	public void move(){
		
		x += vx;
		y += vy;
		
		if(y>720) AlienManager.remove(this);
		
		// will check the collision with wall. Bounce off.
		if(x<0+width/2 || x>800-width/2) vx *= -1;
		
		if(Math.random()<0.1 && MissileManager.seatAvailable()) MissileManager.add(new Missile(x, y+Missile.getHeight(), 2*vy, target));
		
		isCollided = target.isHit(this);
	}
	
	
	public void draw(Graphics canvas){
		
		canvas.setColor(bodyColor);
		canvas.drawRect(x-width/2, y-height, width, height);
		
		// draw the two eye balls.
		canvas.setColor(eyeColor);
		canvas.fillOval(x-width/4-eyeRadius, y-height*3/4-eyeRadius, 2*eyeRadius, 2*eyeRadius);
		canvas.fillOval(x+width/4-eyeRadius, y-height*3/4-eyeRadius, 2*eyeRadius, 2*eyeRadius);
	
		if(isCollided){
			canvas.setColor(explosionColor);
			canvas.drawOval(x-explosionRadius, y-explosionRadius, 2*explosionRadius, 2*explosionRadius);
			Coordinator.gameOn = false;
		}
	}
	
}


 













