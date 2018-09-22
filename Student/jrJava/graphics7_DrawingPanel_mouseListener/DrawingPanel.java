package jrJava.graphics7_DrawingPanel_mouseListener;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class DrawingPanel extends JPanel {

	private JFrame frame;
	
	private int x = 200, y = 100, radius = 100;
	
	private Image[] images;
	private int imageIndex;
	
	
	public DrawingPanel(){
		frame = new JFrame("My Project");
		frame.setBounds(300, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(this);
		
		
		images = new Image[3];
		images[0] = new ImageIcon("jrJava/graphics6_DrawingPanel/bg1.png").getImage();
		images[1] = new ImageIcon("jrJava/graphics6_DrawingPanel/bg2.png").getImage();
		images[2] = new ImageIcon("jrJava/graphics6_DrawingPanel/bg3.png").getImage();
		
		frame.setVisible(true);
	}
	  
	
	public void changeImage(){
		imageIndex++;
		if(imageIndex==images.length) imageIndex = 0;
	}
	
	
	public void paintComponent(Graphics g){
		
		Graphics2D g2= (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		g.setColor(Color.white);
		g.fillRect(0, 0, getWidth(), getHeight()); 
	
		g.drawImage(images[imageIndex], 0, 0, null);
		
		g.setColor(Color.cyan);
		g.fillOval(x, y, 2*radius, 2*radius); 
	}
	
	
	
	public static void main(String[] args) {
		DrawingPanel panel = new DrawingPanel();
		
		while(true){
			panel.changeImage();  // change imageIndex
			panel.repaint(); // paint the tree
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) { }
			
		}
	}

}












