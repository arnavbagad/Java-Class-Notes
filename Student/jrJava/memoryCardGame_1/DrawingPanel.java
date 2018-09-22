package jrJava.memoryCardGame_1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;


public class DrawingPanel extends JPanel implements MouseListener {

	private JFrame frame;
	private Card card;
	private int score = 100;
	private long lastTimeCardSelected;
	
	
	public DrawingPanel(){
		frame = new JFrame("Score: " + score);
		frame.setBounds(200, 50, 740, 660);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(this); 
		
		card = new Card(100, 100);
		
		frame.setVisible(true); 
		
		this.addMouseListener(this);
	}
	
	
	
	public void paintComponent(Graphics g){
		
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
		
		g.setColor(Color.white);
		g.fillRect(0, 0, getWidth(), getHeight()); 
		
		card.draw(g);
	}
	 
	
	public void mousePressed(MouseEvent e){ 
		if(card.isSelected(e.getX(), e.getY())){
			//score += 10;
			//frame.setTitle("Score: " + score);;
			card.show();
			this.repaint();
			lastTimeCardSelected = System.currentTimeMillis();
		}
	}
	
	public void mouseReleased(MouseEvent e){ }
	public void mouseClicked(MouseEvent e){ }
	public void mouseEntered(MouseEvent e){ }
	public void mouseExited(MouseEvent e){ }
	
	
	
	public void hideAllCards(){
		if(System.currentTimeMillis()<lastTimeCardSelected+2000) return;
		card.hide();
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












