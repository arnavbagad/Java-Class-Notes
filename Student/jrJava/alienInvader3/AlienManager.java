package jrJava.alienInvader3;

import java.awt.Color;
import java.awt.Graphics;

public class AlienManager {

	
	private static Alien[] aliens = new Alien[5];
	
	
	public static void create(Ship target){
		if(Math.random()>0.1) return;
		
		for(int i=0; i<aliens.length; i++){
			if(aliens[i]==null){
				int x = (int)(Math.random()*801);
				int y = 0;
				int vx = (int)(Math.random()*11-5);
				int vy = (int)(Math.random()*5+3);
				
				Color bodyColor = new Color((int)(Math.random()*200), (int)(Math.random()*200), (int)(Math.random()*200));
				int grayScale = (int)(Math.random()*150);
				Color eyeColor = new Color(grayScale, grayScale, grayScale);
				
				aliens[i] = new Alien(x, y, vx, vy, bodyColor, eyeColor, target);
				break;
			}
		}
		
	}
	
	
	public static void remove(Alien alien){
		for(int i=0; i<aliens.length; i++){
			if(aliens[i]==alien){
				aliens[i] = null;
				break;
			}
		}
	}
	
	
	public static boolean isHit(Torpedo torpedo){
		for(int i=0; i<aliens.length; i++){
			if(aliens[i]!=null && aliens[i].isHit(torpedo)) return true;
		}
		return false;
	}
	
	
	
	public static void move(){
		for(int i=0; i<aliens.length; i++){
			if(aliens[i]!=null) aliens[i].move();
		}
	}
	
	
	public static void draw(Graphics canvas){
		for(int i=0; i<aliens.length; i++){
			if(aliens[i]!=null) aliens[i].draw(canvas); 
		}
	}
	
	
}
