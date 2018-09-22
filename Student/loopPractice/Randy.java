package loopPractice;

import java.util.Scanner;

public class Randy {

	public static void main(String[] args) {
		int x;
		int sum = 100;
		Scanner scanner = new Scanner(System.in);
		for(int i=1; i<11; i++){
			System.out.println("Pick a number and type it in");
			x = scanner.nextInt();
			if(sum>x)sum = x;
			else
			System.out.println("The minimum is is " + sum + ".");
			System.out.println(i);
		}
	}

}
