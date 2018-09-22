package jrJava.studying_string_1;

public class Practice2 { //equals(Object), equaslIgnoreCase(str), indexOf(...), indexOf(..., i)

	public static void main(String[] args) {
		
		String message1 = "I love you guys all!";
		String message2 = "I love you guys all!";
		String message3 = "I LOVE you guys all!";
		
		//boolean ans1 = message1.equals(message2);
		//System.out.println(ans1);
		//boolean ans2 = message1.equals(message3);
		//System.out.println(ans2);
		//boolean ans3 = message1.equalsIgnoreCase(message3);
		//System.out.println(ans3);
		
		int index1 = message1.indexOf('o');
		System.out.println(index1);
		 
		//int index2 = message1.indexOf("ove ");
		//System.out.println(index2);
		
		int index3 = message1.indexOf('o', index1 + 1);
		System.out.println(index3);
		
		int index4 = message1.indexOf("Guys");
		System.out.println(index4);
	}

}
