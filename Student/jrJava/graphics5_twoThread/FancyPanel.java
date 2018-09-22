package jrJava.graphics5_twoThread;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


public class FancyPanel extends JPanel {


	private int x = 10;

	
	public void changeSquareXPosition(){
		x += 3;
	}
	

	
	public void paintComponent(Graphics g){

		g.setColor(Color.white);
		g.fillRect(0, 0, getWidth(), getHeight());

		g.setColor(Color.red);
		g.drawRect(x, 100, 150, 150);
	}

}
