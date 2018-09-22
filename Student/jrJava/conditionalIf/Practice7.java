package jrJava.conditionalIf;

public class Practice7 {

	public static void main(String[] args) {
		int score = 95;
		/*
		if(score>=90){
			System.out.println("Excellent! We are proud of you.");
			System.out.println("Here is specical allowance, $100.");			
		}
		if(score>=80){
			System.out.println("That's still great! Important thing is that you did your best.");
			System.out.println("Here is specical allowance, $1.");
		}
		if(score>=70){
			System.out.println("You could do better. Pherhaps, next time!");
			System.out.println("Here is mop.");
		}
		if(score>=60){
			System.out.println("You brought shame to our family.");
			System.out.println("Here is your punishment, 10 push-ups.");
		}
		if(score>=50){
			System.out.println("!$#!@#$ $%^%^");
			System.out.println("We disown you. Get out!");
		}
		 */
		/*
		int score = 95;

		if(score>=90){
			System.out.println("Excellent! We are proud of you.");
			System.out.println("Here is specical allowance, $100.");			
		}
		if(score>=80 && score<90){
			System.out.println("That's still great! Important thing is that you did your best.");
			System.out.println("Here is specical allowance, $1.");
		}
		if(score>=70 && score<80){
			System.out.println("You could do better. Pherhaps, next time!");
			System.out.println("Here is mop.");
		}
		if(score>=60 && score<70 ){
			System.out.println("You brought shame to our family.");
			System.out.println("Here is your punishment, 10 push-ups.");
		}
		if(score>=50 && score<60){
			System.out.println("!$#!@#$ $%^%^");
			System.out.println("We disown you. Get out!");
		}
		 */
		
		
		if(score>=90){
			System.out.println("Excellent! We are proud of you.");
			System.out.println("Here is specical allowance, $100.");			
		}
		else if(score>=80){
			System.out.println("That's still great! Important thing is that you did your best.");
			System.out.println("Here is specical allowance, $1.");
		}
		else if(score>=70){
			System.out.println("You could do better. Pherhaps, next time!");
			System.out.println("Here is mop.");
		}
		else if(score>=60){
			System.out.println("You brought shame to our family.");
			System.out.println("Here is your punishment, 10 push-ups.");
		}
		else{
			System.out.println("!$#!@#$ $%^%^");
			System.out.println("We disown you. Get out!");
		}


	}

}
