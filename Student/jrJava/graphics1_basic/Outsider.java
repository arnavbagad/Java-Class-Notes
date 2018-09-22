package jrJava.graphics1_basic;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Outsider implements ActionListener {

	// fields
	// methods
	
	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand().equals("BuyBtn")){
			System.out.println("I am buying 2000 Google stock.");
		}
		else if(e.getActionCommand().equals("SellBtn")){
			System.out.println("I am selling 2000 Google stock.");
		}
	}
	
}
 