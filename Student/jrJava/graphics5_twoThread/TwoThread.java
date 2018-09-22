package jrJava.graphics5_twoThread;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TwoThread implements ActionListener{

	private static JFrame frame;
	private static FancyPanel panel;
	private static JButton button;
	
	
	public TwoThread(){
		frame = new JFrame();
		frame.setBounds(300, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		panel = new FancyPanel();
		frame.getContentPane().add(panel);
		
		button = new JButton("Buy Stock");
		panel.add(button);
		button.addActionListener(this); 
		
		frame.setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent e){
		button.setText("Done");
		
		// make network connection. Initiated transaction. Buy stocks.
		//try {
		//	Thread.sleep(10000);
		//} catch (InterruptedException e1) {}
		
	}
	 
	
	public static void main(String[] args) {
		new TwoThread();
		
		for(int i=0; i<100; i++){
			panel.changeSquareXPosition();
			// trigger the tree painting.
			frame.repaint();
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) { }
		}
		
	}

}













