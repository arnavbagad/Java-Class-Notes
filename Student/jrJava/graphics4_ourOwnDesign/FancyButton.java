package jrJava.graphics4_ourOwnDesign;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;


public class FancyButton extends JButton {

	
	public void paintComponent(Graphics g){
		
		System.out.println("FancyButton begin: TID=" + Thread.currentThread().getId());
		
		g.setColor(Color.green);
		g.fillRect(0,  0, getWidth(), getHeight());
		
		Image img = new ImageIcon("jrJava/graphics4_ourOwnDesign/blueAlien_2.png").getImage();
		g.drawImage(img, 20, 10, 30, 30, null);
		
		g.setColor(Color.red);
		g.fillRect(60, 15, 20, 20);
	}
	
	 
	public void paintBorder(Graphics g){
		g.setColor(Color.darkGray);
		g.drawRect(0, 0, getWidth()-1, getHeight()-1); 
		g.drawRect(2, 2, getWidth()-5, getHeight()-5); 
	}
	
	
}
