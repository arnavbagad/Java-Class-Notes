package jrJava.object5_obj_obj_interation;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import resources.DrawingBoard;

public class ImageTest {

	
	public static void main(String[] args) {
		
		ImageIcon icon1 = new ImageIcon("jrJava/object5_obj_obj_interation/yellowBall.png");
		Image image1 = icon1.getImage();

		ImageIcon icon2 = new ImageIcon("jrJava/object5_obj_obj_interation/redBall.png");
		Image image2 = icon2.getImage();

		ImageIcon icon3 = new ImageIcon("jrJava/object5_obj_obj_interation/blueBall.png");
		Image image3 = icon3.getImage();

		ImageIcon icon4 = new ImageIcon("jrJava/object5_obj_obj_interation/greenBall.png");
		Image image4 = icon4.getImage();
		
		int radius = image1.getWidth(null)/2;
		System.out.println("radius = " + radius);
		
		DrawingBoard board = new DrawingBoard(100, 100, 600, 600);
		Graphics canvas = board.getCanvas();
		
		canvas.drawImage(image1, 100, 100, null);
		canvas.drawImage(image2, 300, 100, null);
		canvas.drawImage(image3, 100, 300, null);
		canvas.drawImage(image4, 300, 300, null);
		
		board.repaint();
	}

}
