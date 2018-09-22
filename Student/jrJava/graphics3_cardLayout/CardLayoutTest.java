package jrJava.graphics3_cardLayout;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;


public class CardLayoutTest implements ItemListener {

	private JFrame frame;
	private JPanel mainPanel, comboBoxPanel, cardsPanel;
	private JComboBox comboBox;
	private JPanel card1, card2, card3;
	
	
	public CardLayoutTest(){
		frame = new JFrame();
		frame.setBounds(200, 100, 500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mainPanel = new JPanel();
		mainPanel.setBackground(Color.white); 
		mainPanel.setLayout(new BorderLayout());
		frame.getContentPane().add(mainPanel);
		
		String[] names = {"Harry's wand", "Hermione' book", "Ron's rat"};
		comboBox = new JComboBox(names);
		comboBox.addItemListener(this); 
		comboBoxPanel = new JPanel();
		comboBoxPanel.add(comboBox);
		
		mainPanel.add(comboBoxPanel, BorderLayout.NORTH);
		
		cardsPanel = new JPanel();
		cardsPanel.setLayout(new CardLayout());
		
		card1 = new JPanel();
		card1.setBackground(Color.orange);
		cardsPanel.add(card1, "Harry's wand");
		
		for(int i=0; i<10; i++) card1.add(new JButton("Button " + (i+1)));
		
		card2 = new JPanel();
		card2.setBackground(Color.cyan);
		cardsPanel.add(card2, "Hermione' book");
		
		for(int i=0; i<8; i++) card2.add(new JTextField("Type in something.", 40));
		
		card3 = new JPanel();
		card3.setBackground(Color.pink);
		cardsPanel.add(card3, "Ron's rat");
		
		card3.setLayout(new GridLayout(3, 3));
		for(int i=0; i<9; i++) card3.add(new JLabel("Big Guy " + i + i + i));
		
		mainPanel.add(cardsPanel, BorderLayout.CENTER); 
		
		frame.setVisible(true); 
	}
	
	
	public void itemStateChanged(ItemEvent e){
		String name = (String) e.getItem();
		CardLayout cl = (CardLayout) cardsPanel.getLayout();
		cl.show(cardsPanel, name);
 	}
	
	
	public static void main(String[] args) {
		new CardLayoutTest();
	}


}









