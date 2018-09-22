package jrJava.alienInvader3;

import java.awt.Color;
import java.awt.Graphics;

public class Torpedo {

	private int x, y; // center, top
	private int vy; // vy<0
	private static Color color;
	private static int width, height;
	private boolean collidedWithAlien, collidedWithMissile;
	private static int explosionRadiusBig, explosionRadiusSmall;
	private static Color explosionColorBig, explosionColorSmall;
	
	static {
		color = Color.blue;
		width = 4;
		height = 12;
		explosionRadiusBig = 60;
		explosionRadiusSmall = 40;
		explosionColorBig = Color.orange;
		explosionColorSmall = Color.magenta;
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
		
		if(y<50) TorpedoManager.remove(this);
		
		collidedWithAlien = AlienManager.isHit(this);
		collidedWithMissile = MissileManager.isHit(this);
	}
	
	
	public void draw(Graphics canvas){
		canvas.setColor(color);
		canvas.drawRect(x-width/2, y, width, height);
		
			canvas.setColor(explosionColorBig);
			canvas.drawOval(x-explosionRadiusBig, y-explosionRadiusBig, 2*explosionRadiusBig, 2*explosionRadiusBig);
			TorpedoManager.remove(this);
		
		
		if(collidedWithMissile){
			canvas.setColor(explosionColorSmall);
			canvas.drawOval(x-explosionRadiusSmall, y-explosionRadiusSmall, 2*explosionRadiusSmall, 2*explosionRadiusSmall);
			TorpedoManager.remove(this);
		}
	}
	
}

 

 






