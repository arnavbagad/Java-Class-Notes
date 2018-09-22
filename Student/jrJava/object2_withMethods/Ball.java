package jrJava.object2_withMethods;

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

