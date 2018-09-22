package jrJava.graphics2_layouts;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.*;

public class LayoutTest_BorderLayout {

	private JFrame frame;
	private JPanel panel;
	private JButton[] buttons;
	
	
	public LayoutTest_BorderLayout(){
		frame = new JFrame("Layout Test");
		frame.setBounds(200, 100, 400, 300); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		panel = new JPanel();
		panel.setBackground(Color.cyan);
		frame.getContentPane().add(panel); // Sir will talk about this 20 min later.
		
		buttons = new JButton[40];
		
		for(int i=0; i<buttons.length; i++){
			buttons[i] = new JButton("Button " + i);
		}
		
		panel.setLayout(new BorderLayout());
		
		panel.add(buttons[0], BorderLayout.NORTH);
		panel.add(buttons[1], BorderLayout.SOUTH);
		panel.add(buttons[2], BorderLayout.EAST);
		panel.add(buttons[3], BorderLayout.WEST);
		panel.add(buttons[4]);  //panel.add(buttons[4], BorderLayout.CENTER);
		
		//frame.pack();
		frame.setVisible(true); 
	}
	
	
	public static void main(String[] args) {
		new LayoutTest_BorderLayout();
	}

}











