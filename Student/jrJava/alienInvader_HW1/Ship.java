package jrJava.alienInvader_HW1;

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
	
	
	public void move(){
		x += vx;
		if(x>=800-bottomWidth/2 || x<=0+bottomWidth/2) vx *= -1;
		
		if(x==500)  Coordinator.torpedo = new Torpedo(x, y-Torpedo.getHeight(), -2);
	}
	
	
	public void draw(Graphics canvas){
		canvas.setColor(color);
		canvas.drawRect(x-topWidth/2, y, topWidth, eachHeight); 
		canvas.drawRect(x-middleWidth/2, y+eachHeight, middleWidth, eachHeight); 
		canvas.drawRect(x-bottomWidth/2, y+2*eachHeight, bottomWidth, eachHeight); 
	}
	
}









