package jrJava.brickBuster;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;



public class Deflector implements MouseMotionListener {

	private int x, y;  // top left coordinates
	private int width = 100;
	private int height = 10;
	private Color color = Color.black;

	public Deflector(int _x, int _y){
		x = _x;
		y = _y;
	}

	public int getX(){ return x; }
	public int getY(){ return y; }
	public int getWidth(){ return width; }
	public int getHeight(){ return height; }


	public void draw(Graphics canvas){
		canvas.setColor(color);
		canvas.fillRect(x, y, width, height);
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
	
	
	public void mouseDragged(MouseEvent e) {

		x = e.getX();
		
		if(x<Wall.getLeft()){
			x = Wall.getLeft();
		}
		else if(x>Wall.getRight()-width){
			x = Wall.getRight()-width;
		}

	}

	public void mouseMoved(MouseEvent e) {}

}