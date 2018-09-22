package jrJava.memoryCardGame_1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;


public class Card {

	private static Image backSideImage;
	public static final int SIZE = 100; 
	public static final int PADDING = 5; 
	public static final int INSET = 10; 
	
	private Image image; // front image
	private int x, y;  // top-left corner of the card
	private boolean shouldReveal;
	private boolean matched;
	
	
	static {
		backSideImage = new ImageIcon("jrJava/memoryCardGame_1/backside.png").getImage();
	}
	
	
	public Card(int x, int y){
		image = new ImageIcon("jrJava/memoryCardGame_1/apple.png").getImage();
		this.x = x;
		this.y = y;
	}
	
	
	public boolean isSelected(int mx, int my){
		return mx>x && mx<x+SIZE && my>y && my<y+SIZE;
	}
	
	
	public void show(){ shouldReveal = true; }
	public void hide(){ shouldReveal = false; }
	public void setMatched(){ matched = true; }
	public boolean hasBeenMatched(){ return matched; }
	
	
	public void draw(Graphics g){
		
		if(matched) return; //shouldn't show at all.
		
		if(shouldReveal) g.drawImage(image, x+INSET, y+INSET, SIZE-2*INSET, SIZE-2*INSET, null);
		else g.drawImage(backSideImage, x+INSET, y+INSET, SIZE-2*INSET, SIZE-2*INSET, null);
		
		g.setColor(Color.lightGray);
		g.drawRect(x, y, SIZE, SIZE);
		g.setColor(Color.black);
		g.drawRect(x+PADDING, y+PADDING, SIZE-2*PADDING, SIZE-2*PADDING);
	}
	
}
 








