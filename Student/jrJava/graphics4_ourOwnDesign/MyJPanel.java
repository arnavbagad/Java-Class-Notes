package jrJava.graphics4_ourOwnDesign;


import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


public class MyJPanel extends JPanel {

	
	public void paintComponent(Graphics g){
		
		System.out.println("MyJPanel begin: TID=" + Thread.currentThread().getId());
		
		g.setColor(Color.white);
		g.fillRect(0,  0, getWidth(), getHeight());
		
		g.setColor(Color.cyan);
		g.drawRect(20,  20, 300, 300);
		
		g.setColor(Color.orange);
		g.drawRect(30,  100, 150, 150);
	}
	
}
