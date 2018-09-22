package jrJava.studying_string_1;

public class Practice3 { // trim() 

	public static void main(String[] args) {
		
		//String message = " 		 I love    you so much, Sir.  		 ";
		//System.out.println(message);
		//System.out.println(message.length());
		
		//String message2 = message.trim();
		//System.out.println(message2);
		//System.out.println(message2.length());
		
		//message = message.trim();
		
		String exp1 = "I Love You So Much, Sir!";
		System.out.println(exp1);
		//String exp2 = exp1.toUpperCase();
		//System.out.println(exp2);
		String exp3 = exp1.toLowerCase();
		System.out.println(exp3);
		
		//String exp4 = exp3.replace("so much", "not at all");
		//System.out.println(exp4); 
		
		String exp5 = exp3.replace("i lov", "I lov");
		System.out.println(exp5); 
		
		String exp6 = exp5.replaceAll("si", "Si");
		System.out.println(exp6);
		
		//"I am Batman.  ".trim().replace("bat", "Super").toUpperCase();
	}

}

 








