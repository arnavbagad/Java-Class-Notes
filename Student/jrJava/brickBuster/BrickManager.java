package jrJava.brickBuster;

import java.awt.Color;
import java.awt.Graphics;


public class BrickManager {
	
	private Brick[] bricks;
	
	public BrickManager(int brickWidth, int brickHeight, int numOfBricks){
		
		bricks = new Brick[numOfBricks];
		
		int x, y;
		Color color;
		int columnSize = 20;
		int gap = 25;
		
		for(int i=0; i<bricks.length; i++){
			x = Wall.getLeft() + i/columnSize*(brickWidth+gap);
			y = Wall.getTop() + i%columnSize*brickHeight;
			color = new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256));
			bricks[i] = new Brick(x, y, brickWidth, brickHeight, color);
		}
	}

	
	public boolean checkCollision(Ball ball){
		for(int i=0; i<bricks.length; i++){
			if(bricks[i]!=null && bricks[i].isCollided(ball)){
				bricks[i] = null;
				return true;
			}
		}
		return false;
	}


	
	public void draw(Graphics canvas){
		for(int i=0; i<bricks.length; i++){
			if(bricks[i]!=null) bricks[i].draw(canvas);
		}
	}

}