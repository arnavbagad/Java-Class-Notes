package jr.java.loop4_while;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {

		int avaliableSeats = 150;
		int seatsRequested;
		while(avaliableSeats>0){
			System.out.println("We currently have " + avaliableSeats + " seats avaliable.");
			System.out.println("How many tickets do you need?");
			Scanner scanner = new Scanner(System.in);
			seatsRequested = scanner.nextInt();

			if(avaliableSeats>=seatsRequested){
				System.out.println("Ok we have reserved " + seatsRequested + " for you.");
				avaliableSeats -= seatsRequested;
				System.out.println();
			}
			else{
				System.out.println("Sorry we don't have enough seats :(");
				System.out.println("We only have " + avaliableSeats + " seats avaliable.");
				System.out.println("Do you want them or not. If you want the seats then type 1 if not then type 2.");
				Scanner scanner1 = new Scanner(System.in);
				int x = scanner.nextInt();
				if(x==1){
					System.out.println("Ok here you go " + avaliableSeats + " seats were reserved for you.");
					avaliableSeats -= seatsRequested;
					System.out.println();
				}
				
				else{
					System.out.println("Ok thank you anyways!");
					System.out.println();
				}
			}

		}
	System.out.println("We are all out of tickets! Come back next year!");
	
	}

}
