package myPractice.arnav;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import resources.DrawingBoard;

public class HandCricketOptimized {
	public static Boolean toss(Boolean evenOdd){
		int userInput=0;
		int cpuInput=0;
		Boolean isOdd=false;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Now type in a number from 0-6");
		userInput = scanner.nextInt();
		Random rand = new Random();
		cpuInput = rand.nextInt(7);
		System.out.println(cpuInput);
		if((cpuInput+userInput)%2==1) {
			isOdd=true;
		}
		else{
			isOdd=false;
		}

		if(isOdd == evenOdd)
			return true;
		else 
			return false;
	}

	public static int play(Boolean youBat, int targetScore){
		int youScore=0;
		int cpuScore=1;
		int score=0;
		Random rand = new Random();;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Now type in a number from 0-6");
		if (youBat)	System.out.println("Now you bat.");
		else System.out.println("Now you bowl.");
		while(true)   {
			youScore = scanner.nextInt();
			cpuScore= rand.nextInt(7);
			System.out.println(cpuScore);

			if (youBat)	{
				if (youScore==cpuScore){
					System.out.println("You are out! Your final score is "+ score );
					return score;	
				}

				score= score + youScore;
				if ((score>=targetScore) && (targetScore !=0)){
					System.out.println("You sucessfully chased the target "+ targetScore);
					return score;
				}

				System.out.println("Your current score is "+ score);
			}
			else {
				if (youScore==cpuScore){
					System.out.println("CPU is out! CPU's final score is "+ score );
					return score;

				}
				score= score + cpuScore;
				if ((score>=targetScore) && (targetScore !=0)){
					System.out.println("CPU sucessfully chased the target "+ targetScore);
					return score;
				}
				System.out.println("CPU current score is "+ score);
			}
		}

	}
	public static void setup(){
		DrawingBoard board = new DrawingBoard(0, 0, 1000, 600);
		Graphics2D canvas = board.getCanvas();
		canvas.setFont(new Font("arial", Font.BOLD, 120));
		canvas.setColor(Color.RED);
		canvas.drawString("Welcome to", 150, 180);
		canvas.setColor(Color.GREEN);
		canvas.drawString("Hand Cricket", 120, 320);
		canvas.setColor(Color.BLUE);
		canvas.drawString("Game", 300, 460);
		board.repaint();
		System.out.println("Hello we will be playing Hand Cricket! I will explain the rules to you");
		System.out.println("To start the game you will need to pick odd ot even. 1 = odd 0 = even");
		System.out.println("Once you choose 0 or 1 you will pick a nuber from 0 to 6 and the CPU will generate a random number.");
		System.out.println("The CPU will add them up if it is what you choose you can choose to bat or bowl. bat = 1 bowl = 0");
		System.out.println("Then you will keep on choosing numbers from 0 - 6 including those 2. I will explain why.");
		System.out.println("If you are batting you will try to gain as many runs as possible by adding up the numbers you put.");
		System.out.println("The way to get out or get the CPU out is by getting the same number as them. Let's play!");
	}
	public static void main(String[] args) throws IOException {
		setup();
		final Boolean   CPU =false;
		final Boolean YOU= true;
		Boolean ifOdd=null;
		Boolean youBat=null;
		int youScore=0;
		int cpuScore=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lets do the Toss! Enter 0 for even or 1 for odd");

		ifOdd = (scanner.nextInt()==1);
		if (toss(ifOdd)){
			System.out.println("You won the toss.  You can choose to bat or bowl. Bat = 1 Bowl = 0");
			youBat = (scanner.nextInt()==1);
		}
		else {
			System.out.println("You lost the toss.  You will Bowl");
			youBat=false;
		}
		if (youBat) {
			youScore=play(YOU,0);
			cpuScore=play(CPU,youScore + 1);
		}	
		else {
			cpuScore=play(CPU,0);
			youScore=play(YOU,cpuScore + 1);
		}
		if (youScore > cpuScore){
			System.out.println("You won! Your Score "+ youScore+ " CPU Score "+cpuScore);
		}
		else{
			System.out.println("You Lost! Your Score "+ youScore+ " CPU Score "+cpuScore);
		}
		scanner.close();
		System.exit(0);
	}
}