package jrJava.studying_string_1;

public class Practice4 {

	public static void main(String[] args) {
		
		//String exp = "I had a great lunch.";
		//int index1 = exp.indexOf("lunch");
		//System.out.println(index1); 
		//int index2 = exp.indexOf("dinner");
		//System.out.println(index2); 
		
		String message = "  Sir    has   an  amazing            personality.  He    must     be    very  popular     at work.   ";
		System.out.println(message);
		message = message.trim();
		System.out.println(message);
		
		while(message.indexOf("  ")>=0){
			message = message.replace("  ", " ");
			System.out.println(message);
		}
	}

}
