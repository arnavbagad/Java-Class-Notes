package myPractive.arnav;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import javax.sound.sampled.*;
import javax.swing.*;


public class Variables {


	static void playSound(String soundFile) throws MalformedURLException, UnsupportedAudioFileException, IOException {

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
		System.out.println("Now trying to play the sound");
		clip.start();
		try {
			Thread.sleep(25000);
		} catch (InterruptedException e) {				
			e.printStackTrace();
		};
		
	}

	public static void main(String[] args) {
		try {
			playSound("/Users/Arnav/Desktop/b.wav");
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
	}
}
