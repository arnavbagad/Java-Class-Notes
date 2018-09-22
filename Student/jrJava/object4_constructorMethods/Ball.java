package jrJava.object4_constructorMethods;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

import resources.SoundPlayer;

public class Ball {

	int x,y; // center
	int xSpeed, ySpeed;
	int radius;
	Color color;
	SoundPlayer sound;
	Image image;
	

	Ball(){

	}


	Ball(int _radius, Color _color){
		radius = _radius;
		color = _color;
	}


	Ball(int _x, int _y, int _xSpeed, int _ySpeed, int _radius, Color _color){
		x = _x;
		y = _y;
		xSpeed = _xSpeed;
		ySpeed = _ySpeed;
		radius = _radius;
		color = _color;
		
		sound = new SoundPlayer("jrJava/object4_constructorMethods/boing.wav");
		
		ImageIcon icon = new ImageIcon("jrJava/object5_obj_obj_interation/yellowBall.png");
		Image image = icon.getImage();

	}


	void move(){
		x = x+xSpeed;
		y = y+ySpeed;

		if(x<=radius){
			x = radius;
			xSpeed = -xSpeed;
			sound.play();
		}

		else if(x>=800-radius){
			x = 800-radius;
			xSpeed = -xSpeed;
			sound.play();
		}

		if(y<=radius){
			y = radius;
			ySpeed = -ySpeed;
			sound.play();
		}
		else if(y>=600-radius){
			y = 600-radius;
			ySpeed = -ySpeed;
			sound.play();
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
		canvas.drawImage(image, x-radius, y-radius, null);
	}
}

