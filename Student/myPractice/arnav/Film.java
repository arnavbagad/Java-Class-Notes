package myPractice.arnav;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import resources.DrawingBoard;

public class Film {

	static void playSound(String soundFile, float volumeLevel) throws MalformedURLException, UnsupportedAudioFileException, IOException {

		File f = new File(soundFile);
		AudioInputStream   audioIn = AudioSystem.getAudioInputStream(f.toURI().toURL());  
		Clip clip = null;
		try {
			clip = AudioSystem.getClip();
		} catch (LineUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			clip.open(audioIn);
		} catch (LineUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FloatControl gainControl = 
				(FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
		gainControl.setValue(volumeLevel); // Reduce volume by 10 decibels.
		clip.start();

	}


	public static void main(String[] args) {
		for(int k=0; k<3; k++){
			try {
				playSound("/Users/Arnav/Desktop/fairy.wav",-10.0f);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (UnsupportedAudioFileException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//Characters
			DrawingBoard board = new DrawingBoard(0, 0, 1500, 2000);
			Graphics2D canvas = board.getCanvas();

			canvas.setFont(new Font("arial", Font.BOLD, 100));		

			canvas.setColor(Color.black);
			canvas.fillRect(0, 0, 1500, 2000);

			canvas.setColor(Color.white);
			canvas.drawString("Welcome to", 430, 120);

			canvas.setColor(Color.white);
			canvas.drawString("The World of Star Wars", 150, 250);


			board.repaint();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			};
			board.clear();

			int radius, xC, yC;

			radius = 50;
			xC = 50;
			yC = 50;

			canvas.setColor(Color.black);
			canvas.fillOval(200, 401, radius*2, radius*2);

			canvas.setColor(Color.black);
			canvas.fillRect(212, 500, 75, 100);

			canvas.setColor(Color.gray);
			canvas.fillRect(370, 350, 10, 200);

			canvas.setColor(Color.black);
			canvas.fillRect(287, 500, 100, 30);

			canvas.setColor(Color.black);
			canvas.fillRect(212, 600, 75, 50);

			canvas.setColor(Color.red);
			canvas.fillRect(370, 300, 10, 180);

			canvas.setColor(Color.green);
			canvas.fillRect(0, 650, 1500, 150);

			canvas.setColor(Color.black);
			canvas.fillRect(1125, 480, 10, 50);

			canvas.setColor(Color.black);
			canvas.fillRect(1040, 460, 100, 25);

			canvas.setColor(Color.orange);
			canvas.fillOval(1200, 401, radius*2, radius*2);

			canvas.setColor(Color.red);
			canvas.fillRect(1212, 500, 75, 100);

			canvas.setColor(Color.orange);
			canvas.fillRect(1287, 500, 100, 30);

			canvas.setColor(Color.orange);
			canvas.fillRect(1112, 500, 100, 30);

			canvas.setColor(Color.black);
			canvas.fillRect(1212, 600, 75, 50);
			board.repaint();
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			};

			canvas.setFont(new Font("arial", Font.PLAIN, 30));		

			canvas.setColor(Color.black);
			canvas.drawString("Stand down Darth Vader!", 1040, 350);
			board.repaint();
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			};

			canvas.setColor(Color.black);
			canvas.drawString("Never! I'd like to see you try and stop me!", 50, 290);	
			board.repaint();
			try {
				Thread.sleep(2500);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			};
			board.clear();

			canvas.setColor(Color.black);
			canvas.fillOval(200, 401, radius*2, radius*2);

			canvas.setColor(Color.black);
			canvas.fillRect(212, 500, 75, 100);

			canvas.setColor(Color.gray);
			canvas.fillRect(370, 350, 10, 200);

			canvas.setColor(Color.black);
			canvas.fillRect(287, 500, 100, 30);

			canvas.setColor(Color.black);
			canvas.fillRect(212, 600, 75, 50);

			canvas.setColor(Color.red);
			canvas.fillRect(370, 300, 10, 180);

			canvas.setColor(Color.green);
			canvas.fillRect(0, 650, 1500, 150);

			canvas.setColor(Color.black);
			canvas.fillRect(1125, 480, 10, 50);

			canvas.setColor(Color.black);
			canvas.fillRect(1040, 460, 100, 25);

			canvas.setColor(Color.orange);
			canvas.fillOval(1200, 401, radius*2, radius*2);

			canvas.setColor(Color.red);
			canvas.fillRect(1212, 500, 75, 100);

			canvas.setColor(Color.orange);
			canvas.fillRect(1287, 500, 100, 30);

			canvas.setColor(Color.orange);
			canvas.fillRect(1112, 500, 100, 30);

			canvas.setColor(Color.black);
			canvas.fillRect(1212, 600, 75, 50);
			board.repaint();
			try {
				Thread.sleep(2500);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			};

			canvas.setColor(Color.black);
			canvas.drawString("Ok! You asked for it.", 1040, 350);
			board.repaint();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			};

			canvas.setColor(Color.red);
			canvas.fillRect(1500, 465, 75, 10);

			canvas.setColor(Color.black);
			canvas.fillRect(1125, 480, 10, 50);

			canvas.setColor(Color.black);
			canvas.fillRect(1040, 460, 100, 25);

			canvas.setColor(Color.orange);
			canvas.fillRect(1112, 500, 100, 30);
			int b = 1050;
			board.repaint();		
			for(int i=0; i<10;i++){
				canvas.setColor(Color.red);
				canvas.fillRect(1500, 465, 75, 10);

				canvas.setColor(Color.red);
				canvas.fillRect(b, 465, 75, 10);
				b-=71;		

				canvas.setColor(Color.black);
				canvas.fillRect(1125, 480, 10, 50);

				canvas.setColor(Color.black);
				canvas.fillRect(1040, 460, 100, 25);

				canvas.setColor(Color.orange);
				canvas.fillRect(1112, 500, 100, 30);	
				board.repaint();
				try {
					Thread.sleep(30);
				} catch (InterruptedException e) {				
					e.printStackTrace();
				};
				board.clear();
				canvas.setColor(Color.black);
				canvas.fillOval(200, 401, radius*2, radius*2);

				canvas.setColor(Color.black);
				canvas.fillRect(212, 500, 75, 100);

				canvas.setColor(Color.gray);
				canvas.fillRect(370, 350, 10, 200);

				canvas.setColor(Color.black);
				canvas.fillRect(287, 500, 100, 30);

				canvas.setColor(Color.black);
				canvas.fillRect(212, 600, 75, 50);

				canvas.setColor(Color.red);
				canvas.fillRect(370, 300, 10, 180);

				canvas.setColor(Color.green);
				canvas.fillRect(0, 650, 1500, 150);

				canvas.setColor(Color.black);
				canvas.fillRect(1125, 480, 10, 50);

				canvas.setColor(Color.black);
				canvas.fillRect(1040, 460, 100, 25);

				canvas.setColor(Color.orange);
				canvas.fillOval(1200, 401, radius*2, radius*2);

				canvas.setColor(Color.red);
				canvas.fillRect(1212, 500, 75, 100);

				canvas.setColor(Color.orange);
				canvas.fillRect(1287, 500, 100, 30);

				canvas.setColor(Color.orange);
				canvas.fillRect(1112, 500, 100, 30);

				canvas.setColor(Color.black);
				canvas.fillRect(1212, 600, 75, 50);
				board.repaint();
			}
			int c = 450;
			for(int i=0; i<10; i++){
				canvas.setColor(Color.red);
				canvas.fillRect(c, 465, 75, 10);
				c+=60;
				canvas.setColor(Color.black);
				canvas.fillRect(1125, 480, 10, 50);

				canvas.setColor(Color.black);
				canvas.fillRect(1040, 460, 100, 25);

				canvas.setColor(Color.orange);
				canvas.fillRect(1112, 500, 100, 30);	
				board.repaint();
				try {
					Thread.sleep(30);
				} catch (InterruptedException e) {				
					e.printStackTrace();
				};
				board.clear();
				canvas.setColor(Color.black);
				canvas.fillOval(200, 401, radius*2, radius*2);

				canvas.setColor(Color.black);
				canvas.fillRect(212, 500, 75, 100);

				canvas.setColor(Color.gray);
				canvas.fillRect(370, 350, 10, 200);

				canvas.setColor(Color.black);
				canvas.fillRect(287, 500, 100, 30);

				canvas.setColor(Color.black);
				canvas.fillRect(212, 600, 75, 50);

				canvas.setColor(Color.red);
				canvas.fillRect(370, 300, 10, 180);

				canvas.setColor(Color.green);
				canvas.fillRect(0, 650, 1500, 150);

				canvas.setColor(Color.black);
				canvas.fillRect(1125, 480, 10, 50);

				canvas.setColor(Color.black);
				canvas.fillRect(1040, 460, 100, 25);

				canvas.setColor(Color.orange);
				canvas.fillOval(1200, 401, radius*2, radius*2);

				canvas.setColor(Color.red);
				canvas.fillRect(1212, 500, 75, 100);

				canvas.setColor(Color.orange);
				canvas.fillRect(1287, 500, 100, 30);

				canvas.setColor(Color.orange);
				canvas.fillRect(1112, 500, 100, 30);

				canvas.setColor(Color.black);
				canvas.fillRect(1212, 600, 75, 50);
				board.repaint();
			}		

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			};
			try {
				playSound("/Users/Arnav/Desktop/explo.wav",5.0f);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (UnsupportedAudioFileException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			canvas.setColor(Color.yellow);
			canvas.fillOval(1069, 440, 50, 50);
			board.repaint();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			};
			board.repaint();
			canvas.setColor(Color.orange);
			canvas.fillOval(1053, 425, 80, 80);
			canvas.setColor(Color.yellow);
			canvas.fillOval(1069, 440, 50, 50);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			};
			board.repaint();
			canvas.setColor(Color.red);
			canvas.fillOval(1037, 410, 110, 110);
			canvas.setColor(Color.orange);
			canvas.fillOval(1053, 425, 80, 80);
			canvas.setColor(Color.yellow);
			canvas.fillOval(1069, 440, 50, 50);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			};
			board.repaint();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			};
			board.clear();
			canvas.setColor(Color.black);
			canvas.fillOval(200, 401, radius*2, radius*2);

			canvas.setColor(Color.black);
			canvas.fillRect(212, 500, 75, 100);

			canvas.setColor(Color.gray);
			canvas.fillRect(370, 350, 10, 200);

			canvas.setColor(Color.black);
			canvas.fillRect(287, 500, 100, 30);

			canvas.setColor(Color.black);
			canvas.fillRect(212, 600, 75, 50);

			canvas.setColor(Color.red);
			canvas.fillRect(370, 300, 10, 180);

			canvas.setColor(Color.green);
			canvas.fillRect(0, 650, 1500, 150);

			canvas.setColor(Color.orange);
			canvas.fillOval(1200, 401, radius*2, radius*2);

			canvas.setColor(Color.red);
			canvas.fillRect(1212, 500, 75, 100);

			canvas.setColor(Color.orange);
			canvas.fillRect(1287, 500, 100, 30);

			canvas.setColor(Color.orange);
			canvas.fillRect(1112, 500, 100, 30);

			canvas.setColor(Color.black);
			canvas.fillRect(1212, 600, 75, 50);
			board.repaint();

			canvas.setColor(Color.black);
			canvas.drawString("Now it's time for me to kill you!", 50, 290);
			board.repaint();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			};
			int q = 180;
			int p = 300;
			for(int i=0; i<10;i++){
				canvas.setColor(Color.red);
				canvas.fillRect(370, p, 10, q);

				canvas.setColor(Color.black);
				canvas.fillOval(200, 401, radius*2, radius*2);

				canvas.setColor(Color.black);
				canvas.fillRect(212, 500, 75, 100);

				canvas.setColor(Color.gray);
				canvas.fillRect(370, 475, 10, 74);

				canvas.setColor(Color.black);
				canvas.fillRect(287, 500, 100, 30);

				canvas.setColor(Color.black);
				canvas.fillRect(212, 600, 75, 50);

				canvas.setColor(Color.green);
				canvas.fillRect(0, 650, 1500, 150);

				canvas.setColor(Color.orange);
				canvas.fillOval(1200, 401, radius*2, radius*2);

				canvas.setColor(Color.red);
				canvas.fillRect(1212, 500, 75, 100);

				canvas.setColor(Color.orange);
				canvas.fillRect(1287, 500, 100, 30);

				canvas.setColor(Color.orange);
				canvas.fillRect(1112, 500, 100, 30);

				canvas.setColor(Color.black);
				canvas.fillRect(1212, 600, 75, 50);
				board.repaint();

				q-=20;
				p+=20;
				try {
					Thread.sleep(20);
				} catch (InterruptedException e) {				
					e.printStackTrace();
				};
				board.clear();
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			};
			board.clear();
			canvas.setColor(Color.black);
			canvas.fillOval(200, 401, radius*2, radius*2);

			canvas.setColor(Color.black);
			canvas.fillRect(212, 500, 75, 100);

			canvas.setColor(Color.black);
			canvas.fillRect(287, 500, 100, 30);

			canvas.setColor(Color.black);
			canvas.fillRect(212, 600, 75, 50);

			canvas.setColor(Color.green);
			canvas.fillRect(0, 650, 1500, 150);

			canvas.setColor(Color.orange);
			canvas.fillOval(1200, 401, radius*2, radius*2);

			canvas.setColor(Color.red);
			canvas.fillRect(1212, 500, 75, 100);

			canvas.setColor(Color.orange);
			canvas.fillRect(1287, 500, 100, 30);

			canvas.setColor(Color.orange);
			canvas.fillRect(1112, 500, 100, 30);

			canvas.setColor(Color.black);
			canvas.fillRect(1212, 600, 75, 50);
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			};
			
			canvas.setColor(Color.black);		
			canvas.fill3DRect(200, 350, 200, 300, true);
			board.repaint();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			};
			
			
			canvas.setColor(Color.black);
			canvas.drawString("Force Choke", 50, 250);
			board.repaint();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			};
			int f = 401;
			int g = 500;
			int h = 600;
			
			
			
			for(int i=0; i<10; i++){
				canvas.setColor(Color.black);
				canvas.fillOval(200, 401, radius*2, radius*2);

				canvas.setColor(Color.black);
				canvas.fillRect(212, 500, 75, 100);

				canvas.setColor(Color.black);
				canvas.fillRect(287, 500, 100, 30);

				canvas.setColor(Color.black);
				canvas.fillRect(212, 600, 75, 50);

				canvas.setColor(Color.green);
				canvas.fillRect(0, 650, 1500, 150);


				canvas.setColor(Color.orange);
				canvas.fillOval(1200, f, radius*2, radius*2);

				canvas.setColor(Color.red);
				canvas.fillRect(1212, g, 75, 100);

				canvas.setColor(Color.orange);
				canvas.fillRect(1287, g, 100, 30);

				canvas.setColor(Color.orange);
				canvas.fillRect(1112, g, 100, 30);

				canvas.setColor(Color.black);
				canvas.fillRect(1212, h, 75, 50);
				board.repaint();
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {				
					e.printStackTrace();
				};
				board.clear();		
				f-=30;
				g-=30;
				h-=30;
			}
			canvas.setColor(Color.black);
			canvas.fillOval(200, 401, radius*2, radius*2);

			canvas.setColor(Color.black);
			canvas.fillRect(212, 500, 75, 100);

			canvas.setColor(Color.black);
			canvas.fillRect(287, 500, 100, 30);

			canvas.setColor(Color.black);
			canvas.fillRect(212, 600, 75, 50);

			canvas.setColor(Color.green);
			canvas.fillRect(0, 650, 1500, 150);


			canvas.setColor(Color.orange);
			canvas.rotate(Math.toRadians(10));
			canvas.fillOval(1200, f-250, radius*2, radius*2);

			canvas.setColor(Color.red);
			canvas.fillRect(1212, g-250, 75, 100);

			canvas.setColor(Color.orange);
			canvas.fillRect(1287, g-250, 100, 30);

			canvas.setColor(Color.orange);
			canvas.fillRect(1112, g-250, 100, 30);

			canvas.setColor(Color.black);		
			canvas.fillRect(1212, h-250, 75, 50);
			board.repaint();

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			};
			
			
			for(int i=0; i<10;i++ ){
				canvas.setColor(Color.orange);
				canvas.fillOval(200, 401, radius*2, radius*2);

				canvas.setColor(Color.black);
				canvas.fillRect(212, 500, 75, 100);

				canvas.setColor(Color.white);
				canvas.fillRect(287, 500, 100, 30);

				canvas.setColor(Color.black);
				canvas.fillRect(212, 600, 75, 50);

				canvas.setColor(Color.ORANGE);
				canvas.fillRect(0, 650, 1500, 150);
				board.repaint();
				if(i>0)canvas.rotate(Math.toRadians(-10));
				canvas.setColor(Color.orange);
				canvas.rotate(Math.toRadians(5));
				canvas.fillOval(1200, f-250, radius*2, radius*2);

				canvas.setColor(Color.red);
				canvas.fillRect(1212, g-250, 75, 100);

				canvas.setColor(Color.orange);
				canvas.fillRect(1287, g-250, 100, 30);

				canvas.setColor(Color.orange);
				canvas.fillRect(1112, g-250, 100, 30);

				canvas.setColor(Color.black);		
				canvas.fillRect(1212, h-250, 75, 50);
				board.repaint();
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {				
					e.printStackTrace();
				};
				board.clear();
				f+=10;
				g+=10;
				h+=10;
			}




			try {
				Thread.sleep(20000);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			};
		}
	}


}
