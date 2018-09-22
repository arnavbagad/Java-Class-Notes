package dragonBall;

import java.awt.Graphics;

import resources.DrawingBoard;

public class Coordinator {

	public static KiBlast kiBlast;
	public static Character character;

	public static void main(String[] args) {
		
		DrawingBoard board = new DrawingBoard(0, 0, 1440, 900);
		Graphics canvas = board.getCanvas();
		
		kiBlast = new KiBlast(1000, 400, -10, 1000, 300,"dragonBall/KiBlast.png", "dragonBall/Kamehameha.png", "dragonBall/GokuChan.png");
		character = new Character(1000, 300, "dragonBall/Kamehameha.png", "dragonBall/GokuChan.png");
		
		board.addKeyListener(kiBlast);
		board.addKeyListener(character);
		
		while(true){
			
			board.clear();
			kiBlast.drawKiBlast(canvas);
			character.drawGokuIdle(canvas);
			board.repaint();
			
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
