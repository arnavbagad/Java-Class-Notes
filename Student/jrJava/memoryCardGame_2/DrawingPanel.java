package jrJava.memoryCardGame_2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;


public class DrawingPanel extends JPanel implements MouseListener {

	public static final int NUM_OF_CARDS = 42;
	public static final int NUM_OF_COLS = 7;
	public static final int MARGIN = 10;
	
	private JFrame frame;
	private Card[] cards;
	private int score = 100;
	private long lastTimeCardSelected;
	
	
	public DrawingPanel(){
		frame = new JFrame("Score: " + score);
		frame.setBounds(200, 50, 740, 660);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(this); 
		
		cards = new Card[NUM_OF_CARDS];
		for(int i=0; i<cards.length; i++){
			cards[i] = new Card(i/2, MARGIN + i%NUM_OF_COLS*Card.SIZE, MARGIN + i/NUM_OF_COLS*Card.SIZE); 
		}
		
		frame.setVisible(true); 
		
		this.addMouseListener(this);
	}
	
	
	
	public void paintComponent(Graphics g){
		
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
		
		g.setColor(Color.white);
		g.fillRect(0, 0, getWidth(), getHeight()); 
		
		for(int i=0; i<cards.length; i++){
			cards[i].show();
			cards[i].draw(g);
		}
	}
	 
	
	public void mousePressed(MouseEvent e){ 
		for(int i=0; i<cards.length; i++){
			if(cards[i].isSelected(e.getX(), e.getY())){
				//score += 10;
				//frame.setTitle("Score: " + score);;
				cards[i].show();
				this.repaint();
				lastTimeCardSelected = System.currentTimeMillis();
				break;
			}
		}
	}
	
	public void mouseReleased(MouseEvent e){ }
	public void mouseClicked(MouseEvent e){ }
	public void mouseEntered(MouseEvent e){ }
	public void mouseExited(MouseEvent e){ }
	
	
	
	public void hideAllCards(){
		if(System.currentTimeMillis()<lastTimeCardSelected+2000) return;
		for(int i=0; i<cards.length; i++) cards[i].hide();
		this.repaint();
	}
	
	
	public static void main(String[] args) {
		DrawingPanel panel = new DrawingPanel();
		
		while(true){
			panel.hideAllCards();
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) { }
		}
		
	}

}












