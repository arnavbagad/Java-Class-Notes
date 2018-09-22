package myPractice.arnav;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.util.Random;
import java.util.Scanner;

import resources.DrawingBoard;

public class HandCricket {

	public static void main(String[] args) {
/*
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
*/
		System.out.println("Hello we will be playing Hand Cricket! I will explain the rules to you");
		System.out.println("To start the game you will need to pick odd ot even. 1 = odd 0 = even");
		System.out.println("Once you choose 0 or 1 you will pick a nuber from 0 to 6 and the CPU will generate a random number.");
		System.out.println("The CPU will add them up if it is what you choose you can choose to bat or bowl. bat = 1 bowl = 0");
		System.out.println("Then you will keep on choosing numbers from 0 - 6 including those 2. I will explain why.");
		System.out.println("If you are batting you will try to gain as many runs as possible by adding up the numbers you put.");
		System.out.println("The way to get out or get the CPU out is by getting the same number as them. Let's play!");
		System.out.println("Choose 0 or 1");
		int n;

		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		System.out.println("Now type in a number from 0-6");
		if(n==0){
			int x;
			int y;
			Scanner scanner1 = new Scanner(System.in);	

			y = scanner.nextInt();

			Random rand = new Random();
			x = rand.nextInt(7);
			System.out.println(x);

			if((x+y)%2==0){
				int z;
				System.out.println("It is even you can choose to bat or bowl. Bat = 1 Bowl = 0");

				Scanner scanner2 = new Scanner(System.in);
				z = scanner.nextInt();
				if(z==1){
					int total=0;
					x=y+1;
					while(x!=y){
						y = scanner.nextInt();


						x = rand.nextInt(7);
						System.out.println(x);
						total= total + y;
						System.out.println("Your current score is "+ total);
					}
					System.out.println("Your out! The final score is "+ total + " your turn to bowl.");

					System.out.println("Ok bowl");
					int bob=0;
					x=y+1;
					while(x!=y){
						y = scanner.nextInt();


						x = rand.nextInt(7);
						System.out.println(x);
						bob = bob + x;
						System.out.println("CPU current score is "+ bob);
						if(bob>total){
							System.out.println("Game over.");
							System.out.println("CPU win!");
							System.exit(0);
						}
					}
					System.out.println("CPU is out! The final score is "+ bob + " game over.");

					if(bob>=total){
						System.out.println("You lose!");
					}
					else{
						System.out.println("You win!");
					}
					System.exit(0);

				}
				else{
					System.out.println("You will bowl!");
					int total=0;
					x=y+1;
					while(x!=y){
						y = scanner.nextInt();


						x = rand.nextInt(7);
						System.out.println(x);
						total= total + x;
						System.out.println("Cpu current score is "+ total);
					}
					System.out.println("Cpu out! The final score is "+ total + " your turn to bat.");

					System.out.println("Ok bat");
					int bob=0;
					x=y+1;
					while(x!=y){
						y = scanner.nextInt();


						x = rand.nextInt(7);
						System.out.println(x);
						bob = bob + y;
						System.out.println("Your current score is "+ bob);
						if(bob>total){
							System.out.println("Game over.");
							System.out.println("You win!");
							System.exit(0);
						}
					}
					System.out.println("You is out! The final score is "+ bob + " game over.");

					if(bob>=total){
						System.out.println("You win!");
					}
					else{
						System.out.println("You lose!");
					}
					System.exit(0);

				}
			}
			else{
				System.out.println("It is odd so you will bowl first");
				System.out.println("You will bowl!");
				int total=0;
				x=y+1;
				while(x!=y){
					y = scanner.nextInt();


					x = rand.nextInt(7);
					System.out.println(x);
					total= total + x;
					System.out.println("CPU current score is "+ total);
				}
				System.out.println("CPU is out! The final score is "+ total + " your turn to bat.");

				System.out.println("Ok bat");
				int bob=0;
				x=y+1;
				while(x!=y){
					y = scanner.nextInt();


					x = rand.nextInt(7);
					System.out.println(x);
					bob = bob + y;
					System.out.println("Your current score is "+ bob);
					if(bob>total){
						System.out.println("Game over.");
						System.out.println("You win!");
						System.exit(0);
					}
				}
				System.out.println("Your are out! The final score is "+ bob + " game over.");

				if(bob>=total){
					System.out.println("You win!");
				}
				else{
					System.out.println("You lose!");
				}

				System.exit(0);

			}
		}
		else{
			int x;
			int y;
			Scanner scanner1 = new Scanner(System.in);	

			y = scanner.nextInt();

			Random rand = new Random();
			x = rand.nextInt(7);
			System.out.println(x);

			if(x+y%2==1){
				int z;
				System.out.println("It is odd you can choose to bat or bowl. Bat = 1 Bowl = 0");

				Scanner scanner2 = new Scanner(System.in);
				z = scanner.nextInt();
				if(z==1){
					int total=0;
					x=y+1;
					while(x!=y){
						y = scanner.nextInt();


						x = rand.nextInt(7);
						System.out.println(x);
						total= total + y;
						System.out.println("Your current score is "+ total);
					}
					System.out.println("Your out! The final score is "+ total + " your turn to bowl.");

					System.out.println("Ok bowl");
					int bob=0;
					x=y+1;
					while(x!=y){
						y = scanner.nextInt();


						x = rand.nextInt(7);
						System.out.println(x);
						bob = bob + x;
						System.out.println("CPU current score is "+ bob);
						if(bob>total){
							System.out.println("Game over.");
							System.out.println("CPU win!");
							System.exit(0);
						}
					}
					System.out.println("CPU is out! The final score is "+ bob + " game over.");
					

					if(bob>=total){
						System.out.println("You lose!");
					}
					else{
						System.out.println("You win!");
					}
					System.exit(0);

				}
				else{
					System.out.println("You will bowl!");
					int total= 0;
					x=y+1;
					while(x!=y){
						y = scanner.nextInt();


						x = rand.nextInt(7);
						System.out.println(x);
						total= total + x;
						System.out.println("CPU current score is "+ total);
					}
					System.out.println("CPU out! The final score is "+ total + " your turn to bat.");

					System.out.println("Ok bat");
					int bob=0;
					x=y+1;
					while(x!=y){
						y = scanner.nextInt();


						x = rand.nextInt(7);
						System.out.println(x);
						bob = bob + y;
						System.out.println("Your current score is "+ bob);
						if(bob>total){
							System.out.println("Game over.");
							System.out.println("You win!");
							System.exit(0);
						}
					}
					System.out.println("Your is out! The final score is "+ bob + " game over.");

					if(bob>=total){
						System.out.println("You win!");
					}
					else{
						System.out.println("You lose!");
					}
					System.exit(0);

				}
			}
			else{
				System.out.println("It is even so you will bowl first");
				System.out.println("You will bowl!");
				int total=0;
				x=y+1;
				while(x!=y){
					y = scanner.nextInt();


					x = rand.nextInt(7);
					System.out.println(x);
					total= total + x;
					System.out.println("CPU current score is "+ total);
				}
				System.out.println("CPU is out! The final score is "+ total + " your turn to bat.");

				System.out.println("Ok bat");
				int bob=0;
				x=y+1;
				while(x!=y){
					y = scanner.nextInt();


					x = rand.nextInt(7);
					System.out.println(x);
					bob = bob + y;
					System.out.println("Your current score is "+ bob);
					if(bob>total){
						System.out.println("Game over.");
						System.out.println("You win!");
						System.exit(0);
					}
				}
				System.out.println("You is out! The final score is "+ bob + " game over.");

				if(bob>=total){
					System.out.println("You win!");
				}
				else{
					System.out.println("You lose!");
				}

				System.exit(0);

			}
		}

	}

}




















