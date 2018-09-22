package myPractive.arnav;

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

public class WasteOfMyTime {

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

		DrawingBoard board = new DrawingBoard(0, 0, 1500, 2000);
		Graphics2D canvas = board.getCanvas();

		canvas.setFont(new Font("arial", Font.BOLD, 30));	
		canvas.setColor(Color.black);
		canvas.fillRect(0, 0, 1500, 2000);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {				
			e.printStackTrace();
		};

		int a = 130;
		int b = 500; 
		int c = 630;
		int d = 650; 
		for(int i=0; i<10; i++){
			canvas.setColor(Color.black);
			canvas.fillRect(0, 0, 1500, 2000);

			canvas.setColor(Color.white);
			canvas.drawString("I worship Arnav like a god! Oh thank you Arnav you are my hero!", a, b);
			canvas.setColor(Color.white);
			canvas.drawString("- Soham", c, d);


			board.repaint();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			};
			board.clear();
			a +=30;   
			c +=30; 
		}
	}
}
