package myPractice.arnav;

import java.util.Scanner;

public class Practice2 {

	private static Scanner scanner;

	public static void main(String[] args) {
		
		int color;
		
		System.out.println("What is your favorite color out of red, orange, yellow, green, blue, and purple? If you have the same favorite color as me you wil a prize!");
		System.out.println("1 = red, 2 = orange, 3 = yellow, 4 = blue, 5 = green, 6 = purple. Chose your color and wisly!");
		
		scanner = new Scanner(System.in);
		
		color = scanner.nextInt();
		
		if(color<=3){
			System.out.println("Man you are hot! You blaze like the Sun! You almost won the prize put you just missed it!");
			System.out.println("Surprise you owe me one dollar! You lost so deal with it!");
		}

		else if(color>4){
			System.out.println("You are cool and calm! If needed you'll stand up for others! Though you will be shedding tears because you lost.");
			System.out.println("Surprise you owe me one dollar! You lost so deal with it!");
		}	
		
		else if(color==4){
			System.out.println("You are cool and calm! If needed you'll stand up for others and put on a mans fight! You choose the best color!");
			System.out.println("Surprise you have won! Now you have earned youself a dollar!");
		}	
	}

}
