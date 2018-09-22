package jrJava.graphics4_ourOwnDesign;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Test implements ActionListener {

	private JFrame frame;
	private JPanel panel;
	private JButton button;
	
	public Test(){
		
		System.out.println("Test() begin: TID=" + Thread.currentThread().getId());
		frame = new JFrame();
		frame.setBounds(200, 100, 500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new MyJPanel();
		panel.setLayout(null);
		frame.getContentPane().add(panel);
		
		button = new FancyButton();
		button.setBounds(200, 200, 100, 50);
		panel.add(button);
		
		button.addActionListener(this); 
		
		frame.setVisible(true); 
		System.out.println("Test() end: TID=" + Thread.currentThread().getId());
	}
	
	
	public void actionPerformed(ActionEvent e){
		System.out.println("actionPerformed(): TID=" + Thread.currentThread().getId());
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("main() begin: TID=" + Thread.currentThread().getId());
		
		new Test();
		
		System.out.println("main() end: TID=" + Thread.currentThread().getId());
	}

}



 











