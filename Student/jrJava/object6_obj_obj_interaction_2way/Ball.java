package jrJava.object6_obj_obj_interaction_2way;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

import resources.SoundPlayer;

public class Ball {

	private int x, y; // center
	private int xSpeed, ySpeed;
	private static int radius;
	private static int changeRate;
	private static SoundPlayer sound;
	private Image image;
	private Wall wall;
	private Ball theOtherBall;
	private boolean collidedWithOtherBall;
	
	
	static {
		radius = 80;
		changeRate = 1;
		sound = new SoundPlayer("jrJava/jrJava.object6_obj_obj_interaction_2way/boing.wav");
	}
	

	public Ball(int _x, int _y, int _xSpeed, int _ySpeed, String imageFilePath, Wall _wall){
		x = _x;
		y = _y;
		xSpeed = _xSpeed;
		ySpeed = _ySpeed;

		ImageIcon icon = new ImageIcon(imageFilePath);
		image = icon.getImage();
		
		wall = _wall;
	}


	public void setTheOtherBall(Ball tob){
		theOtherBall = tob;
	}
	

	public void move(){
		
		// moves.
		x = x + xSpeed;
		y = y + ySpeed;

		// check collision with wall.
		if(x<=wall.getLeft()+radius){
			x = wall.getLeft()+radius;
			xSpeed = -xSpeed;
			sound.play();
		}
		else if(x>=wall.getRight()-radius){
			x = wall.getRight()-radius;
			xSpeed = -xSpeed;
			sound.play();
		}

		if(y<=wall.getTop()+radius){
			y = wall.getTop()+radius;
			ySpeed = -ySpeed;
			sound.play();
		}
		else if(y>=wall.getBottom()-radius){
			y = wall.getBottom()-radius;
			ySpeed = -ySpeed;
			sound.play();
		}

		// checks collision with the other ball.
		double distance = Math.sqrt( (x-theOtherBall.x)*(x-theOtherBall.x) + (y-theOtherBall.y)*(y-theOtherBall.y) );
		
		if(distance<=radius+theOtherBall.radius){
			collidedWithOtherBall = true;
		}
		else {
			collidedWithOtherBall = false;
		}
				
	}


	private void speedUp(){
		xSpeed = xSpeed*2;
		ySpeed = ySpeed*2;
	}


	private int getSize(){
		return radius;
	} 


	public static void grow(){
		radius += changeRate;
		if(radius>=100 || radius<=60) changeRate *= -1;
	} 


	public void draw(Graphics canvas){
		
		if(collidedWithOtherBall){
			canvas.setColor(Color.black);
			canvas.drawOval(x-radius, y-radius, 2*radius, 2*radius); 
		}
		else {
			canvas.drawImage(image, x-radius, y-radius, 2*radius, 2*radius, null);
		}
		
	} 

}













