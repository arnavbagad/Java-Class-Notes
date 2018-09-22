package jrJava.studying_string_1;

public class Practice1 { // charAt(i), length(), startsWitht(str), endsWith(str)

	public static void main(String[] args) {
		
		//String a1 = new String("abc def"); // waste of memory space. Shouldn't do this!
		//String a2 = "abc def";  // correct way.
		
		String phrase = "I love you, Sir!";
		
		//char ch = phrase.charAt(30); // Be careful.
		//System.out.println(ch);
		
		//int len = phrase.length();
		//System.out.println(len);
		
		//char ch = phrase.charAt(phrase.length()-1);
		//System.out.println(ch);
		
		boolean ans1 = phrase.startsWith("I lov");
		System.out.println(ans1);
		
		boolean ans2 = phrase.startsWith(" I lov");
		System.out.println(ans2);
		
		boolean ans3 = phrase.startsWith("i lov");
		System.out.println(ans3);
		
		boolean ans4 = phrase.endsWith(" Sir!");
		System.out.println(ans4);
	}

}
