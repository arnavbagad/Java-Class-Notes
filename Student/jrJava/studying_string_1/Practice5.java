package jrJava.studying_string_1;

import java.net.SocketOption;

public class Practice5 {

	public static void main(String[] args) {
		
		String exp = "Sir has an amazing personality.";
		
		// Be careful: substring(begin, end) will not include the character at the 'end' index.
		// It will cut just before the 'end' index.
		
		//String piece1 = exp.substring(8, 18);
		//System.out.println(piece1); 
	
		String piece2 = exp.substring(8);  //exp.substring(8, exp.length());
		System.out.println(piece2); 
		
		String twoWords = "Batman Superman";
		int pos = twoWords.indexOf(' ');
		String first = twoWords.substring(0, pos);
		String second = twoWords.substring(pos + 1);
		System.out.println(first);
		System.out.println(second);
	}

}
