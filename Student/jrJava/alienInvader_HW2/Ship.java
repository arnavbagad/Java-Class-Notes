package jrJava.alienInvader_HW2;

import java.awt.Color;
import java.awt.Graphics;

public class Ship {

	private int x, y; // center top
	private int vx = 2;
	private Color color = Color.red;;
	private int eachHeight = 20;
	private int topWidth = 4, middleWidth = 20, bottomWidth = 60;


	public Ship(int _x, int _y){
		x = _x;
		y = _y;
	}



	public boolean isHit(Missile missile){

		if(  	(missile.getX()>=x-topWidth/2-Missile.getWidth()/2 &&
				missile.getX()<=x+topWidth/2+Missile.getWidth()/2 &&
				missile.getY()>=y &&
				missile.getY()<=y+eachHeight+Missile.getHeight() ) ||

				(missile.getX()>=x-middleWidth/2-Missile.getWidth()/2 &&
				missile.getX()<=x+middleWidth/2+Missile.getWidth()/2 &&
				missile.getY()>=y+eachHeight &&
				missile.getY()<=y+2*eachHeight+Missile.getHeight() ) ||

				(missile.getX()>=x-bottomWidth/2-Missile.getWidth()/2 &&
				missile.getX()<=x+bottomWidth/2+Missile.getWidth()/2 &&
				missile.getY()>=y+2*eachHeight &&
				missile.getY()<=y+3*eachHeight+Missile.getHeight() ) ){

			Coordinator.gameOn = false;
			return true;
		}



		return false;
	}



	public boolean isHit(Alien alien){

		return false;
	}


	public void move(){
		x += vx;
		if(x>=800-bottomWidth/2 || x<=0+bottomWidth/2) vx *= -1;

		if(x==500)  Coordinator.torpedo = new Torpedo(x, y-Torpedo.getHeight(), -2);
		
		if(x==616) vx = 0;
	}


	public void draw(Graphics canvas){
		canvas.setColor(color);
		canvas.drawRect(x-topWidth/2, y, topWidth, eachHeight); 
		canvas.drawRect(x-middleWidth/2, y+eachHeight, middleWidth, eachHeight); 
		canvas.drawRect(x-bottomWidth/2, y+2*eachHeight, bottomWidth, eachHeight); 
	}

}









