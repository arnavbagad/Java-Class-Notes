package jrJava.graphics1_basic;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class MyGUI implements ActionListener {

	private JFrame frame;
	
	private JPanel panel, smallPanel;
	private JLabel lab1, imgLab1, imgLab2, imgLab3;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JTextField textField;
	private JButton btn1, btn2;
	
	private JMenuBar menuBar;
	private JMenu menu1, menu2;
	private JMenuItem item1, item2, item3, item4, item5, item6;
	
	private int scrollPaneX = 20, scrollPaneY = 40;
	
	
	public MyGUI(){
		
		frame  = new JFrame();
		frame.setTitle("Sir's GUI");
		frame.setBounds(400, 200, 500, 400); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		formNorthernMenu();
		formCenterPanel();
		
		frame.setVisible(true);
		
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {}
		
		
		//textField.requestFocus();
		//textArea.requestFocus();
		//btn1.requestFocus();
		btn2.requestFocus();
	}
	
	
	private void formNorthernMenu(){
		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 500, 20);
		frame.getContentPane().add(menuBar);
		
		menu1 = new JMenu("Move");
		menu2 = new JMenu("Help");
		menuBar.add(menu1);
		menuBar.add(menu2);		
		
		item1 = new JMenuItem("Up");
		item2 = new JMenuItem("Down");
		item3 = new JMenuItem("Left");
		item4 = new JMenuItem("Right");
		
		item1.addActionListener(this);
		item2.addActionListener(this);
		item3.addActionListener(this);
		item4.addActionListener(this);
		
		menu1.add(item1);
		menu1.add(item2);
		menu1.add(item3);
		menu1.add(item4);
		
		item5 = new JMenuItem("Search");
		item6 = new JMenuItem("About");
		
		menu2.add(item5);
		menu2.add(item6);
	}
	
	
	private void formCenterPanel(){
		panel = new JPanel();
		panel.setBounds(0, 20, 500, 400); 
		panel.setBackground(Color.white); 
		panel.setLayout(null); 
		frame.getContentPane().add(panel);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(scrollPaneX, scrollPaneY, 300, 200);
		panel.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		lab1 = new JLabel("Type in:");
		lab1.setBounds(20, 250, 100, 20);
		panel.add(lab1);
		
		textField = new JTextField();
		textField.setBounds(20, 270, 300, 20);
		textField.addActionListener(this); 
		panel.add(textField);
		
		smallPanel = new JPanel();
		smallPanel.setBounds(340, 40, 100, 200);
		smallPanel.setBackground(Color.white);
		smallPanel.setLayout(null);
		panel.add(smallPanel);
		
		imgLab1 = new JLabel("GUI Demo", new ImageIcon("jrJava/graphics1_basic/orangeAlien_1.png"), JLabel.CENTER);
		imgLab1.setBounds(10, 0, 80, 80);
		imgLab1.setVerticalTextPosition(JLabel.TOP); 
		imgLab1.setHorizontalTextPosition(JLabel.CENTER); 
		smallPanel.add(imgLab1);
		
		imgLab2 = new JLabel("", new ImageIcon("jrJava/graphics1_basic/torpedo.png"), JLabel.CENTER);
		imgLab2.setBounds(10, 90, 80, 80);
		imgLab2.setVerticalTextPosition(JLabel.TOP); 
		imgLab2.setHorizontalTextPosition(JLabel.CENTER); 
		smallPanel.add(imgLab2);
		
		imgLab3 = new JLabel("", new ImageIcon("jrJava/graphics1_basic/ship.png"), JLabel.CENTER);
		imgLab3.setBounds(10, 130, 80, 80);
		imgLab3.setVerticalTextPosition(JLabel.TOP); 
		imgLab3.setHorizontalTextPosition(JLabel.CENTER); 
		smallPanel.add(imgLab3);
		
		//btn1 = new JButton("Buy");
		btn1 = new JButton("Shoot");
		btn1.setBounds(350, 255, 80, 20);
		btn1.setActionCommand("BuyBtn");
		panel.add(btn1);
		
		//Outsider outsider = new Outsider();
		//btn1.addActionListener(outsider); 
		btn1.addActionListener(this);
		
		//btn2 = new JButton("Sell"); 
		btn2 = new JButton("Abort"); 
		btn2.setBounds(350, 285, 80, 20);
		btn2.setActionCommand("SellBtn"); 
		panel.add(btn2);
		
		btn2.addActionListener(this);
		//btn2.addActionListener(outsider);
	} 
	
	
	public void actionPerformed(ActionEvent e){
		
		if(e.getSource()==btn1){
			//System.out.println("I am buying 1000 Google stock.");
			textArea.setText("A torpedo got shot!");
			imgLab2.setBounds(10, 50, 80, 80);
		}
		else if(e.getSource()==btn2){
			//System.out.println("I am selling 1000 Google stock.");
			textArea.setText("A torpedo got aborted!");
			imgLab2.setBounds(10, 90, 80, 80);
		}
		
		else if(e.getSource()==item1){
			scrollPaneY -= 5;
			scrollPane.setBounds(scrollPaneX, scrollPaneY, 300, 200);
		}
		else if(e.getSource()==item2){
			scrollPaneY += 5;
			scrollPane.setBounds(scrollPaneX, scrollPaneY, 300, 200);
		}
		else if(e.getSource()==item3){
			scrollPaneX -= 5;
			scrollPane.setBounds(scrollPaneX, scrollPaneY, 300, 200);
		}
		else if(e.getSource()==item4){
			scrollPaneX += 5;
			scrollPane.setBounds(scrollPaneX, scrollPaneY, 300, 200);
		}
		
		else if(e.getSource()==textField){
			String content = textField.getText();
			textArea.setText(content);
		}
	}
	
	
	public static void main(String[] args) {
		
		new MyGUI();
	}

} 

 










