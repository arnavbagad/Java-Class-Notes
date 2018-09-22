package jrJava.loopString;

import java.awt.Color;
import java.awt.Graphics2D;
import resources.DrawingBoard;

public class ColorPalette {

	public static void main(String[] args) {

		int screenSize = 700;
		int numOfTiles = 50;
		int margin = 50;
		int tileSize = (screenSize-margin*2)/numOfTiles;
		int colorIncrement = 255/numOfTiles;
		int sleepTime = 5;
		int j, i;
		Color color;
		
		DrawingBoard board = new DrawingBoard(0, 200, screenSize, screenSize);
		Graphics2D canvas = board.getCanvas();


		for(i=0; i<numOfTiles; i++){

			for(j=0; j<numOfTiles; j++){
			
				color = new Color(colorIncrement*i, colorIncrement*i, colorIncrement*i);
				canvas.setColor(color);
				canvas.fillRect(margin + i*tileSize, margin + tileSize*j, tileSize, tileSize);
				canvas.setColor(Color.black);
				board.repaint();
				canvas.drawRect(margin + i*tileSize, margin + tileSize*j, tileSize, tileSize);
				try {
					Thread.sleep(sleepTime);
				} catch (InterruptedException e) {
					e.printStackTrace();
			}
		}
	}


	board.repaint();
}

}
