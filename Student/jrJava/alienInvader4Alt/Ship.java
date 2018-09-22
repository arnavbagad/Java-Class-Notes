package jrJava.alienInvader4Alt;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;

import resources.SoundPlayer;


public class Ship implements KeyListener, MouseMotionListener {

	private int x, y; // top center
	//private Color color = Color.red;
	private final int eachHeight;
	private int topWidth = 4, middleWidth = 20, bottomWidth = 60;
	private SoundPlayer laser;
	private Image image;
	private int width, height;
	
	
	public Ship(int x, int y){
		this.x = x;
		this.y = y;
		laser = new SoundPlayer("jrJava/alienInvader3/laser.wav");
		
		eachHeight = 20;
		
		image = new ImageIcon(Coordinator.R_PATH + "ship.png").getImage();
		width = image.getWidth(null);
		height = image.getHeight(null);
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
		
		if(     alien.getX()>=x-topWidth/2-alien.getWidth()/2 &&
				alien.getX()<=x+topWidth/2+alien.getWidth()/2 &&
				alien.getY()>=y &&
				alien.getY()<=y+eachHeight+alien.getHeight()  ||
				
			    alien.getX()>=x-middleWidth/2-alien.getWidth()/2 &&
				alien.getX()<=x+middleWidth/2+alien.getWidth()/2 &&
				alien.getY()>=y+eachHeight &&
				alien.getY()<=y+2*eachHeight+alien.getHeight()  ||
				
			    alien.getX()>=x-bottomWidth/2-alien.getWidth()/2 &&
				alien.getX()<=x+bottomWidth/2+alien.getWidth()/2 &&
				alien.getY()>=y+2*eachHeight &&
				alien.getY()<=y+3*eachHeight+alien.getHeight()  ){
			
			//Coordinator.gameOn = false;
			return true;
		}
		
		return false;
	}
	
	
	
	public void draw(Graphics canvas){
		/*
		canvas.setColor(color);
		canvas.drawRect(x-topWidth/2, y, topWidth, eachHeight); 
		canvas.drawRect(x-middleWidth/2, y+eachHeight, middleWidth, eachHeight);
		canvas.drawRect(x-bottomWidth/2, y+2*eachHeight, bottomWidth, eachHeight);
		*/
		canvas.drawImage(image, x-width/2, y, null);
	}



	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		
		if(keyCode==KeyEvent.VK_SPACE && TorpedoManager.seatAvailable()){

			TorpedoManager.add( new Torpedo(x,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+5,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-5,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+10,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-10,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+15,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-15,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+20,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-20,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+25,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-25,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+30,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-30,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+35,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-35,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+40,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-40,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-45,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+45,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-50,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+50,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-55,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+55,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-60,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+60,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+65,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-65,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+70,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-70,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+75,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-75,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+80,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-80,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+85,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-85,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+90,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-90,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+95,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-95,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+100,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-100,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+5,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-5,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+10,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-10,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+15,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-15,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+20,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-20,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+25,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-25,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+30,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-30,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+35,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-35,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+40,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-40,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-45,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+45,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-50,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+50,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-55,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+55,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-60,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+60,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+65,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-65,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+70,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-70,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+75,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-75,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+80,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-80,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+85,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-85,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+90,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-90,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+95,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-95,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+100,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-100,y-Torpedo.getHeight(),-4) );
			
			TorpedoManager.add( new Torpedo(x,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+5,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-5,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+10,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-10,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+15,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-15,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+20,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-20,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+25,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-25,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+30,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-30,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+35,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-35,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+40,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-40,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-45,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+45,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-50,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+50,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-55,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+55,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-60,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+60,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+65,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-65,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+70,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-70,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+75,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-75,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+80,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-80,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+85,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-85,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+90,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-90,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+95,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-95,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+100,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-100,y-Torpedo.getHeight(),-4) );
			
			TorpedoManager.add( new Torpedo(x,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+5,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-5,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+10,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-10,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+15,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-15,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+20,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-20,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+25,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-25,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+30,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-30,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+35,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-35,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+40,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-40,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-45,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+45,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-50,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+50,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-55,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+55,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-60,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+60,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+65,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-65,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+70,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-70,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+75,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-75,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+80,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-80,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+85,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-85,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+90,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-90,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+95,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-95,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+100,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-100,y-Torpedo.getHeight(),-4) );
			
			TorpedoManager.add( new Torpedo(x,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+5,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-5,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+10,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-10,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+15,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-15,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+20,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-20,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+25,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-25,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+30,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-30,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+35,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-35,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+40,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-40,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-45,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+45,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-50,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+50,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-55,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+55,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-60,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+60,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+65,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-65,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+70,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-70,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+75,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-75,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+80,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-80,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+85,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-85,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+90,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-90,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+95,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-95,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+100,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-100,y-Torpedo.getHeight(),-4) );
			
			TorpedoManager.add( new Torpedo(x,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+5,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-5,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+10,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-10,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+15,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-15,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+20,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-20,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+25,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-25,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+30,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-30,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+35,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-35,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+40,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-40,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-45,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+45,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-50,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+50,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-55,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+55,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-60,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+60,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+65,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-65,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+70,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-70,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+75,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-75,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+80,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-80,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+85,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-85,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+90,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-90,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+95,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-95,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+100,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-100,y-Torpedo.getHeight(),-4) );
			
			TorpedoManager.add( new Torpedo(x,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+5,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-5,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+10,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-10,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+15,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-15,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+20,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-20,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+25,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-25,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+30,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-30,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+35,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-35,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+40,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-40,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-45,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+45,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-50,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+50,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-55,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+55,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-60,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+60,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+65,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-65,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+70,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-70,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+75,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-75,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+80,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-80,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+85,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-85,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+90,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-90,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+95,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-95,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+100,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-100,y-Torpedo.getHeight(),-4) );
			
			TorpedoManager.add( new Torpedo(x,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+5,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-5,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+10,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-10,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+15,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-15,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+20,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-20,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+25,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-25,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+30,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-30,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+35,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-35,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+40,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-40,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-45,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+45,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-50,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+50,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-55,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+55,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-60,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+60,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+65,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-65,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+70,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-70,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+75,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-75,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+80,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-80,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+85,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-85,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+90,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-90,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+95,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-95,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+100,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-100,y-Torpedo.getHeight(),-4) );
			
			TorpedoManager.add( new Torpedo(x,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+5,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-5,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+10,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-10,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+15,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-15,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+20,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-20,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+25,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-25,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+30,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-30,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+35,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-35,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+40,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-40,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-45,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+45,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-50,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+50,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-55,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+55,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-60,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+60,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+65,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-65,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+70,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-70,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+75,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-75,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+80,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-80,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+85,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-85,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+90,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-90,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+95,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-95,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+100,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-100,y-Torpedo.getHeight(),-4) );
			
			TorpedoManager.add( new Torpedo(x,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+5,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-5,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+10,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-10,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+15,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-15,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+20,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-20,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+25,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-25,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+30,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-30,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+35,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-35,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+40,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-40,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-45,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+45,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-50,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+50,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-55,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+55,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-60,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+60,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+65,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-65,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+70,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-70,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+75,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-75,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+80,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-80,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+85,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-85,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+90,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-90,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+95,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-95,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x+100,y-Torpedo.getHeight(),-4) );
			TorpedoManager.add( new Torpedo(x-100,y-Torpedo.getHeight(),-4) );
			
		}

		
		if(keyCode==KeyEvent.VK_Q && TorpedoManager.seatAvailable()){

			TorpedoManager.add( new Torpedo(x, y-Torpedo.getHeight(), -4) );
			
		}
		
		if(keyCode==KeyEvent.VK_W && TorpedoManager.seatAvailable()){

			TorpedoManager.add( new Torpedo(x,y-Torpedo.getHeight()+100,-4) );
			TorpedoManager.add( new Torpedo(x+5,y-Torpedo.getHeight()+100,-4) );
			TorpedoManager.add( new Torpedo(x-5,y-Torpedo.getHeight()+100,-4) );
			TorpedoManager.add( new Torpedo(x+10,y-Torpedo.getHeight()+100,-4) );
			TorpedoManager.add( new Torpedo(x-10,y-Torpedo.getHeight()+100,-4) );
			TorpedoManager.add( new Torpedo(x+15,y-Torpedo.getHeight()+100,-4) );
			TorpedoManager.add( new Torpedo(x-15,y-Torpedo.getHeight()+100,-4) );
			TorpedoManager.add( new Torpedo(x+20,y-Torpedo.getHeight()+100,-4) );
			TorpedoManager.add( new Torpedo(x-20,y-Torpedo.getHeight()+100,-4) );
			TorpedoManager.add( new Torpedo(x+25,y-Torpedo.getHeight()+100,-4) );
			TorpedoManager.add( new Torpedo(x-25,y-Torpedo.getHeight()+100,-4) );
			TorpedoManager.add( new Torpedo(x+30,y-Torpedo.getHeight()+100,-4) );
			TorpedoManager.add( new Torpedo(x-30,y-Torpedo.getHeight()+100,-4) );
			TorpedoManager.add( new Torpedo(x+35,y-Torpedo.getHeight()+100,-4) );
			TorpedoManager.add( new Torpedo(x-35,y-Torpedo.getHeight()+100,-4) );
			
		}

		if(keyCode==KeyEvent.VK_E && TorpedoManager.seatAvailable()){

			TorpedoManager.add( new Torpedo(x,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+5,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-5,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+10,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-10,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+15,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-15,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+20,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-20,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+25,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-25,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+30,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-30,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+35,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-35,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+40,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-40,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-45,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+45,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-50,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+50,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-55,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+55,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-60,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+60,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+65,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-65,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+70,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-70,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+75,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-75,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+80,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-80,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+85,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-85,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+90,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-90,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+95,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-95,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+100,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-100,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+5,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-5,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+10,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-10,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+15,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-15,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+20,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-20,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+25,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-25,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+30,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-30,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+35,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-35,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+40,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-40,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-45,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+45,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-50,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+50,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-55,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+55,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-60,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+60,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+65,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-65,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+70,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-70,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+75,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-75,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+80,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-80,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+85,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-85,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+90,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-90,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+95,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-95,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+100,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-100,y-Torpedo.getHeight(),0) );
			
			TorpedoManager.add( new Torpedo(x,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+5,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-5,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+10,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-10,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+15,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-15,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+20,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-20,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+25,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-25,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+30,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-30,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+35,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-35,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+40,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-40,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-45,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+45,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-50,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+50,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-55,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+55,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-60,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+60,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+65,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-65,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+70,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-70,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+75,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-75,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+80,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-80,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+85,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-85,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+90,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-90,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+95,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-95,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+100,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-100,y-Torpedo.getHeight(),0) );
			
			TorpedoManager.add( new Torpedo(x,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+5,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-5,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+10,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-10,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+15,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-15,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+20,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-20,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+25,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-25,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+30,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-30,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+35,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-35,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+40,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-40,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-45,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+45,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-50,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+50,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-55,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+55,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-60,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+60,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+65,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-65,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+70,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-70,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+75,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-75,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+80,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-80,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+85,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-85,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+90,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-90,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+95,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-95,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+100,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-100,y-Torpedo.getHeight(),0) );
			
			TorpedoManager.add( new Torpedo(x,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+5,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-5,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+10,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-10,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+15,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-15,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+20,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-20,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+25,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-25,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+30,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-30,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+35,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-35,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+40,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-40,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-45,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+45,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-50,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+50,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-55,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+55,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-60,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+60,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+65,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-65,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+70,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-70,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+75,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-75,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+80,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-80,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+85,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-85,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+90,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-90,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+95,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-95,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+100,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-100,y-Torpedo.getHeight(),0) );
			
			TorpedoManager.add( new Torpedo(x,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+5,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-5,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+10,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-10,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+15,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-15,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+20,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-20,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+25,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-25,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+30,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-30,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+35,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-35,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+40,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-40,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-45,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+45,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-50,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+50,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-55,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+55,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-60,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+60,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+65,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-65,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+70,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-70,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+75,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-75,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+80,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-80,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+85,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-85,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+90,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-90,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+95,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-95,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+100,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-100,y-Torpedo.getHeight(),0) );
			
			TorpedoManager.add( new Torpedo(x,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+5,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-5,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+10,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-10,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+15,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-15,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+20,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-20,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+25,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-25,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+30,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-30,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+35,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-35,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+40,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-40,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-45,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+45,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-50,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+50,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-55,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+55,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-60,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+60,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+65,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-65,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+70,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-70,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+75,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-75,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+80,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-80,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+85,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-85,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+90,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-90,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+95,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-95,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+100,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-100,y-Torpedo.getHeight(),0) );
			
			TorpedoManager.add( new Torpedo(x,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+5,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-5,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+10,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-10,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+15,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-15,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+20,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-20,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+25,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-25,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+30,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-30,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+35,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-35,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+40,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-40,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-45,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+45,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-50,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+50,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-55,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+55,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-60,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+60,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+65,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-65,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+70,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-70,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+75,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-75,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+80,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-80,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+85,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-85,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+90,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-90,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+95,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-95,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+100,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-100,y-Torpedo.getHeight(),0) );
			
			TorpedoManager.add( new Torpedo(x,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+5,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-5,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+10,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-10,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+15,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-15,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+20,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-20,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+25,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-25,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+30,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-30,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+35,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-35,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+40,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-40,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-45,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+45,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-50,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+50,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-55,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+55,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-60,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+60,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+65,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-65,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+70,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-70,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+75,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-75,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+80,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-80,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+85,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-85,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+90,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-90,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+95,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-95,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+100,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-100,y-Torpedo.getHeight(),0) );
			
			TorpedoManager.add( new Torpedo(x,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+5,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-5,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+10,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-10,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+15,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-15,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+20,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-20,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+25,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-25,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+30,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-30,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+35,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-35,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+40,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-40,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-45,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+45,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-50,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+50,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-55,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+55,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-60,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+60,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+65,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-65,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+70,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-70,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+75,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-75,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+80,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-80,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+85,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-85,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+90,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-90,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+95,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-95,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x+100,y-Torpedo.getHeight(),0) );
			TorpedoManager.add( new Torpedo(x-100,y-Torpedo.getHeight(),0) );
		}
	}

	
	public void keyTyped(KeyEvent e) { }
	public void keyReleased(KeyEvent e) { }


	public void mouseDragged(MouseEvent e) {
		x = e.getX();
	}


	public void mouseMoved(MouseEvent e) { }
	
	
}




















