package jrJava.brickBuster;

import java.awt.Color;
import java.awt.Graphics;


public class Brick {

	private int x, y; // top left corner
	private int width;
	private int height;
	private Color color;

	public Brick(int _x, int _y, int _width, int _height, Color _color){
		x = _x;
		y = _y;
		color = _color;
		width = _width;
		height = _height;
	}


	public boolean isCollided(Ball ball){

		if(ball.getX()>x-ball.getRadius() && ball.getX()<x && ball.getY()>y-ball.getRadius() && ball.getY()<=y+height+ball.getRadius()){
			ball.setX(x - ball.getRadius());
			ball.setXSpeed(-ball.getXSpeed());
			return true;
		}

		if(ball.getX()>x+width && ball.getX()<x+width+ball.getRadius() && ball.getY()>y-ball.getRadius() && ball.getY()<=y+height+ball.getRadius()){
			ball.setX(x + width + ball.getRadius());
			ball.setXSpeed(-ball.getXSpeed());
			return true;
		}

		if(ball.getX()>=x && ball.getX()<=x+width && ball.getY()>=y-ball.getRadius() && ball.getY()<=y+height/2){
			ball.setY(y-ball.getRadius());
			ball.setYSpeed(-ball.getYSpeed());
			return true;
		}

		if(ball.getX()>=x && ball.getX()<=x+width && ball.getY()>=y+height/2 && ball.getY()<=y+height+ball.getRadius()){
			ball.setY(y+height+ball.getRadius());
			ball.setYSpeed(-ball.getYSpeed());
			return true;
		}

		return false;
	}


	public void draw(Graphics canvas){
		canvas.setColor(color);
		canvas.fillRect(x, y, width, height);
		canvas.setColor(Color.black);
		canvas.drawRect(x, y, width, height);
	}

	
}