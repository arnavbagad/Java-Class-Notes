package jrJava.object5_obj_obj_interation;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

import resources.SoundPlayer;

public class Ball {

	int x, y; // center
	int xSpeed, ySpeed;
	int radius;
	SoundPlayer sound;
	Image image;
	Wall wall;


	Ball(int _x, int _y, int _xSpeed, int _ySpeed, String imageFilePath, String soundFilePath, Wall _wall){
		x = _x;
		y = _y;
		xSpeed = _xSpeed;
		ySpeed = _ySpeed;

		sound = new SoundPlayer(soundFilePath);

		ImageIcon icon = new ImageIcon(imageFilePath);
		image = icon.getImage();
		
		radius = image.getWidth(null)/2;
		
		wall = _wall;
	}



	void move(){
		x = x + xSpeed;
		y = y + ySpeed;

		if(x<=wall.left+radius){
			x = wall.left+radius;
			xSpeed = -xSpeed;
			sound.play();
		}
		else if(x>=wall.right-radius){
			x = wall.right-radius;
			xSpeed = -xSpeed;
			sound.play();
		}

		if(y<=wall.top+radius){
			y = wall.top+radius;
			ySpeed = -ySpeed;
			sound.play();
		}
		else if(y>=wall.bottom-radius){
			y = wall.bottom-radius;
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








