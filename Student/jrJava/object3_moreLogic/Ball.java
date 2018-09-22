package jrJava.object3_moreLogic;

import java.awt.Color;
import java.awt.Graphics;

public class Ball {

	int x,y; // center
	int xSpeed, ySpeed;
	int radius;
	Color color;

	void move(){
		x = x+xSpeed;
		y = y+ySpeed;
		
		if(x<=radius){
			x = radius;
			xSpeed = -xSpeed;
		}
		
		else if(x>=800-radius){
			x = 800-radius;
			xSpeed = -xSpeed;
		}
				
		if(y<=radius){
			y = radius;
			ySpeed = -ySpeed;
		}
		else if(y>=600-radius){
			y = 600-radius;
			ySpeed = -ySpeed;
		}
	}

	void speedUp(){
		xSpeed = xSpeed*2;
		ySpeed = ySpeed*2;
	}

	int getSize(){
		return radius;
	}

	void grow(){
		radius++;
	}
	
	void draw(Graphics canvas){
		canvas.setColor(color);
		canvas.fillOval(x-radius, y-radius, 2*radius, 2*radius);
	}
}

