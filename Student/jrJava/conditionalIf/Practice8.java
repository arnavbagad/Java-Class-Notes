package jrJava.conditionalIf;

public class Practice8 {

	public static void main(String[] args) {

		char grade = 'A';

		switch(grade){

		case 'A':
			System.out.println("Excellent! We are proud of you.");
			System.out.println("Here is specical allowance, $100.");			
			break;
		case 'B':
			System.out.println("That's still great! Important thing is that you did your best.");
			System.out.println("Here is specical allowance, $1.");
			break;
		case 'C':
			System.out.println("You could do better. Pherhaps, next time!");
			System.out.println("Here is mop.");
			break;
		case 'D':
			System.out.println("You brought shame to our family.");
			System.out.println("Here is your punishment, 10 push-ups.");
			break;
		default: 
			System.out.println("!$#!@#$ $%^%^");
			System.out.println("We disown you. Get out!");
			//break;
		}

	}

}
