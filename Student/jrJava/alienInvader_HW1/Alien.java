package jrJava.alienInvader_HW1;

import java.awt.Color;
import java.awt.Graphics;

public class Alien {

	private int x, y; // center, bottom
	private int vx, vy;
	private static int width, height;
	private static int eyeRadius;
	private Color bodyColor, eyeColor;
	
	
	static {
		width = 25;
		height = 25;
		eyeRadius = 3;
	}
	
	
	public Alien(int _x, int _y, int _vx, int _vy, Color _bodyColor, Color _eyeColor){
		x = _x;
		y = _y;
		vx = _vx;
		vy = _vy;
		bodyColor = _bodyColor;
		eyeColor = _eyeColor;
	}
	
	
	
	public boolean isHit(Torpedo torpedo){
		
		if(  	torpedo.getX()>=x-width/2-Torpedo.getWidth()/2 &&
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
	}
	
	
	public void draw(Graphics canvas){
		canvas.setColor(bodyColor);
		canvas.drawRect(x-width/2, y-height, width, height);
		
		canvas.setColor(eyeColor);
		canvas.fillOval(x-width/4-eyeRadius, y-height*3/4-eyeRadius, 2*eyeRadius, 2*eyeRadius);
		canvas.fillOval(x+width/4-eyeRadius, y-height*3/4-eyeRadius, 2*eyeRadius, 2*eyeRadius);
	}
	
	
}

 











