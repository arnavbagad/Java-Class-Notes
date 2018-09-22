package dragonBall;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;

public class KiBlast implements KeyListener{

	private int x, y, xPerson, yPerson; // center
	private static int radius;
	private static int radius2;
	private int xv;
	private int q = 0;
	private boolean isq= false; 
	private int[] xcordinates= new int[1000];
	private boolean firstTimeQ=false;
	private static Color color;
	private Image image;
	private Image image2;
	private Image image3;
	
	static {
		radius2 = 35;
		radius = 30;
		color = new Color(0, 240, 240);
	}

	public KiBlast(int _x, int _y, int _xv, int _xPerson, int _yPerson, String imageFilePath, String imageFilePath2, String imageFilePath3){
		x = _x;
		y = _y;
		xv = _xv;
		xPerson = _xPerson;
		yPerson = _yPerson;
		ImageIcon icon = new ImageIcon(imageFilePath);
		image = icon.getImage();
		ImageIcon icon2 = new ImageIcon(imageFilePath2);
		image2 = icon2.getImage();
		ImageIcon icon3 = new ImageIcon(imageFilePath3);
		image3 = icon3.getImage();
	}

	public void keyPressed(KeyEvent e) {
		char key = e.getKeyChar();

		if(key=='q'){
		xcordinates[q]=960;
		q++;
		isq=true;
		firstTimeQ=true;
		}
	}



	public void keyReleased(KeyEvent e) {

	}


	public void keyTyped(KeyEvent e) {

	}


	public void moveKiBlast(){
		x += xv;
	}

	public void drawKiBlast(Graphics canvas){
		
			if (firstTimeQ){
				//canvas.drawImage(image, (x-radius), (y-radius), 2*radius, 2*radius, null);
				canvas.drawImage(image, xPerson-40, yPerson+75, 2*radius, 2*radius, null);
				firstTimeQ=false;
				//canvas.drawImage(image2, xPerson, yPerson, 351, 280, null);
			}
			if (isq);
			
			
			for ( int track=0;track<q;track++){
				xcordinates[track]=xcordinates[track]+xv;
				canvas.drawImage(image, (xcordinates[track]-radius), (y-radius), 2*radius, 2*radius, null);
			//xcordinates[track]=xcordinates[track]+xv;
			}
		}
	
	public void moveKamehameha(){
		x += xv;
	}

	public void drawKamehameha(Graphics canvas){
		canvas.setColor(color);
		canvas.fillOval(x-35, y-20, radius*2, radius*2);
		canvas.setColor(color);
		canvas.fillOval(915, 355, (radius+20)*2, (radius+20)*2);
	}
}
