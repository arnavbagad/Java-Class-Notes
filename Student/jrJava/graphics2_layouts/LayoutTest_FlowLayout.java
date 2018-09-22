package jrJava.graphics2_layouts;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.*;

public class LayoutTest_FlowLayout {

	private JFrame frame;
	private JPanel panel;
	private JButton[] buttons;
	
	
	public LayoutTest_FlowLayout(){
		frame = new JFrame("Layout Test");
		frame.setBounds(200, 100, 400, 300); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		panel = new JPanel();
		panel.setBackground(Color.cyan);
		frame.getContentPane().add(panel); // Sir will talk about this 20 min later.
		
		buttons = new JButton[5];
		
		for(int i=0; i<buttons.length; i++){
			buttons[i] = new JButton("Button " + i);
		}
		
		//panel.setLayout(new FlowLayout());
		
		for(int i=0; i<buttons.length; i++){
			panel.add(buttons[i]);
		}
		
		//frame.pack();
		frame.setVisible(true); 
	}
	
	
	public static void main(String[] args) {
		new LayoutTest_FlowLayout();
	}

}











