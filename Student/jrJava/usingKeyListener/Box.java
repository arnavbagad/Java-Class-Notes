package jrJava.usingKeyListener;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Box implements KeyListener{

	private int x, y; // center
	private int w, h;
	private Color color;

	public Box(int _x, int _y, int _w, int _h, Color _color){
		x = _x;
		y = _y;
		w = _w;
		h = _h;
		color = _color;
	} 


	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		
		if(key==39) x += 5;
		else if(key==37) x -= 5;
		else if(key==40) y += 5;
		else if(key==38) y -= 5;
		else if(key==32){
			w += 10;
			h += 10;
		}
		else if(key==27){
			w -= 10;
			h -= 10;
		}
	}


	public void keyReleased(KeyEvent e) {

	}


	public void keyTyped(KeyEvent e) {
		
	}


	public void draw(Graphics canvas){
		canvas.setColor(color);
		canvas.fillRect(x-w/2, y-h/2, w, h);
	}

}
