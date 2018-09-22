package jrJava.object5_obj_obj_interation;

import java.awt.Color;
import java.awt.Graphics;


public class Wall {

	int left = 100;
	int right = 700;
	int top = 100;
	int bottom = 500;
	Color color = Color.gray;
	int changeRate = 1;
	
	Wall(){ }
	
	
	void change(){
		left -= changeRate;
		right += changeRate;
		top -= changeRate;
		bottom += changeRate;
		
		if(bottom-top==550 || bottom-top<=220){
			changeRate = -changeRate;
		}
	}
	
	
	
	void draw(Graphics canvas){
	canvas.setColor(color);
	canvas.drawRect(left, top, right-left, bottom-top);
	}
	
	
}
