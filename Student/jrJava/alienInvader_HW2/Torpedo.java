package jrJava.alienInvader_HW2;

import java.awt.Color;
import java.awt.Graphics;

public class Torpedo {

	private int x, y; // center, top
	private int vy; // vy<0
	private static int width, height;
	private static Color color;
	private boolean isCollidedWithAlien, isCollidedWithMissile;
	private static Color explosionColorBig, explosionColorSmall;
	private static int explosionRadiusBig, explosionRadiusSmall;


	static {
		width = 4;
		height = 12;
		color = Color.blue;
		explosionColorBig = Color.orange;
		explosionColorSmall = Color.magenta;
		explosionRadiusBig = 60;
		explosionRadiusSmall = 40;
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
			isCollidedWithAlien = Coordinator.alien.isHit(this);
			//if(isCollided) Coordinator.torpedo = null;
		}

		if(Coordinator.missile!=null){
			isCollidedWithMissile = Coordinator.missile.isHit(this);
		}
	}


	public void draw(Graphics canvas){
		canvas.setColor(color);
		canvas.drawRect(x-width/2, y, width, height);

		if(isCollidedWithAlien){
			canvas.setColor(explosionColorBig);
			canvas.drawOval(x-explosionRadiusBig,  y-explosionRadiusBig,  2*explosionRadiusBig,  2*explosionRadiusBig); 
			Coordinator.torpedo = null;
		}

		if(isCollidedWithMissile){
			canvas.setColor(explosionColorSmall);
			canvas.drawOval(x-explosionRadiusSmall,  y-explosionRadiusSmall,  2*explosionRadiusSmall,  2*explosionRadiusSmall); 
			Coordinator.torpedo = null;
		}

	}

}











