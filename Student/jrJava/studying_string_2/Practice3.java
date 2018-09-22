package jrJava.studying_string_2;

import java.util.StringTokenizer;

public class Practice3 { // StringTokenizer 

	public static void main(String[] args) {
		
		String message = ":; , Sir has,an;amazing      personality....    He(must)be :::very popular  everywhere.    ";
		
		StringTokenizer st = new StringTokenizer(message, ":; ,.()");
		String each;
		
		while(st.hasMoreTokens()){
			each = st.nextToken();
			System.out.println(each); 
		}

	}

}
