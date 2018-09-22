package myPractice.arnav;

import java.util.Scanner;

public class Practice1 {

	
	private static Scanner scanner;
	private static Scanner bob;

	public static void main(String[] args) {
		
		int dollarAmount;
		int whatYouWant;
		int total;
		
		System.out.println("How much money do you make? Please be honest.");
		
		scanner = new Scanner(System.in);
		
		dollarAmount = scanner.nextInt();
		
		if(dollarAmount<200000){
			System.out.println("You are very poor! Since I am so rich I will give you how much of mine you want!");
			bob = new Scanner(System.in);
			whatYouWant = scanner.nextInt();
			total = whatYouWant + dollarAmount;
			System.out.println("Okay here you go! This is your new total " + total);
		}
		
		else{
			System.out.println("You are very rich! I hope you donate to the Arnav Must be a Billionare Chairity");
		}

	}

}
