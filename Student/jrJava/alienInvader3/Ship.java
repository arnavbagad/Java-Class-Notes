package jrJava.alienInvader3;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import resources.SoundPlayer;

public class Ship implements KeyListener, MouseMotionListener {

	private int x, y; // center, top
	private Color color = Color.red;
	private int eachHeight = 20;
	private int topWidth = 4, middleWidth = 20, bottomWidth = 60;
	private SoundPlayer laser;
	
	
	public Ship(int _x, int _y){
		x = _x;
		y = _y;
		laser = new SoundPlayer("jrJava/alienInvader3/laser.wav");
	}
	
	
	public boolean isHit(Missile missile){
		
		if(     missile.getX()>=x-topWidth/2-Missile.getWidth()/2 &&
				missile.getX()<=x+topWidth/2+Missile.getWidth()/2 &&
				missile.getY()>=y &&
				missile.getY()<=y+eachHeight+Missile.getHeight()  ||
		
			    missile.getX()>=x-middleWidth/2-Missile.getWidth()/2 &&
				missile.getX()<=x+middleWidth/2+Missile.getWidth()/2 &&
				missile.getY()>=y+eachHeight &&
				missile.getY()<=y+2*eachHeight+Missile.getHeight()  ||
				
			    missile.getX()>=x-bottomWidth/2-Missile.getWidth()/2 &&
				missile.getX()<=x+bottomWidth/2+Missile.getWidth()/2 &&
				missile.getY()>=y+2*eachHeight &&
				missile.getY()<=y+3*eachHeight+Missile.getHeight()  ){
			
			//Coordinator.gameOn = false;
			return true;
		}
			
		return false;
	}
	
	
	public boolean isHit(Alien alien){
		
		if(     alien.getX()>=x-topWidth/2-Alien.getWidth()/2 &&
				alien.getX()<=x+topWidth/2+Alien.getWidth()/2 &&
				alien.getY()>=y &&
				alien.getY()<=y+eachHeight+Alien.getHeight()  ||
		
			    alien.getX()>=x-middleWidth/2-Alien.getWidth()/2 &&
				alien.getX()<=x+middleWidth/2+Alien.getWidth()/2 &&
				alien.getY()>=y+eachHeight &&
				alien.getY()<=y+2*eachHeight+Alien.getHeight()  ||
				
			    alien.getX()>=x-bottomWidth/2-Alien.getWidth()/2 &&
				alien.getX()<=x+bottomWidth/2+Alien.getWidth()/2 &&
				alien.getY()>=y+2*eachHeight &&
				alien.getY()<=y+3*eachHeight+Alien.getHeight()  ){
			
			//Coordinator.gameOn = false;
			return true;
		}
			
		return false;
	}
	
	
	
	public void draw(Graphics canvas){
		canvas.setColor(color);
		canvas.drawRect(x-topWidth/2, y, topWidth, eachHeight);
		canvas.drawRect(x-middleWidth/2, y+eachHeight, middleWidth, eachHeight);
		canvas.drawRect(x-bottomWidth/2, y+2*eachHeight, bottomWidth, eachHeight); 
	}



	public void keyPressed(KeyEvent e) {
		
		int keyCode = e.getKeyCode();
		
		if(keyCode==KeyEvent.VK_SPACE && TorpedoManager.seatAvailable()){
			laser.play();
			TorpedoManager.add( new Torpedo(x, y-Torpedo.getHeight(), -4) );
		}
		
	}
	
	
	public void keyTyped(KeyEvent e) { }
	public void keyReleased(KeyEvent e) { }


	public void mouseDragged(MouseEvent e) {
		x = e.getX();
	}


	public void mouseMoved(MouseEvent e) { }
	
}


 






