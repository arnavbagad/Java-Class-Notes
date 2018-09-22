package jrJava.sport;

import java.util.Scanner;

public class SportSelector {

	public static void main(String[] args) {

		String selectedSport = null;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Your prefernce, indoor sports(1) or outdoor sports(2)");
		int preference1 = scanner.nextInt();

		System.out.println("Your prefernce, team sports(1) or individual sports(2)");
		int preference2 = scanner.nextInt();

		if(preference1==1){
			if(preference2==1){
				selectedSport = "Basketball";
			}
			else{
				selectedSport = "Ping-pong";
			}
		}

		if(preference1==2){
			if(preference2==1){
				selectedSport = "Soccer";
			}
			else{
				selectedSport = "Tennis";
			}
		}		
		
		System.out.println("We recomend " + selectedSport + " for you.");
	}

}
