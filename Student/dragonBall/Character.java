package dragonBall;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;

public class Character  implements KeyListener{

	public int xIdle; // center
	public int yIdle;
	private Image image;
	private Image image2;


	public Character(int _xIdle, int _yIdle, String imageFilePath, String imageFilePath2){
		xIdle = _xIdle;
		yIdle = _yIdle;
		ImageIcon icon = new ImageIcon(imageFilePath);
		image = icon.getImage();
		ImageIcon icon2 = new ImageIcon(imageFilePath2);
		image2 = icon2.getImage();
	}

	public void keyPressed(KeyEvent e) {
		char key = e.getKeyChar();
		
		if(key=='d') xIdle += 10;
		else if(key=='a') xIdle -= 10;
		else if(key=='s') yIdle += 10;
		else if(key=='w') yIdle -= 10;
	}


	public void keyReleased(KeyEvent e) {

	}


	public void keyTyped(KeyEvent e) {
		
	}

	
	public void drawFightingGokuKamehameha(Graphics canvas){
		canvas.drawImage(image, xIdle, yIdle, 351, 280, null);
	}
	
	public void drawGokuIdle(Graphics canvas){
		canvas.drawImage(image2, xIdle, yIdle, 300, 280, null);
	}
}