package myPractice.arnav;

import java.io.IOException;

public class Crazzy8 {

	public static void main(String[] args) {
		// make the cards
		int[] deck = new int[52]; // how many total
		String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

		// Initialize cards
		for (int i = 0; i < deck.length; i++){
			deck[i] += i;
		}

		// shuffle cards
		for (int i = 0; i < deck.length; i++){
			int index = (int)(Math.random() * deck.length);
			int x = deck[i]; // x now has all 52 cards?
			deck[i] = deck[index]; // pick a random card 
			deck[index] = x; // pick a random card

		}

		// display 5 cards
		for (int i = 1; i <= 5; i++){
			String suit = suits[deck[i] / 13];
			String rank = ranks[deck[i] % 13];
			System.out.println("You have the " + rank + " of " + suit);
		}
		 try
		    {
		        final String os = System.getProperty("os.name");

		        if (os.contains("Mac"))
		        {
		            Runtime.getRuntime().exec("cls");
		        }
		        else
		        {
		            Runtime.getRuntime().exec("clear");
		        }
		    }
		    catch (final Exception e)
		    {
		        //  Handle any exceptions.
		    }
		//System.exit(0);

	}







}


