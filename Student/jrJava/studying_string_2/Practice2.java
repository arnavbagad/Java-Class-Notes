package jrJava.studying_string_2;

public class Practice2 {

	
	public static void main(String[] args) {
		
		int id = 207;
		double balance = 4023.99;
		System.out.println("The balance of account " + id + " is $" + balance + "."); 
		
		String cpmbined1 = "chap1" + "chap2" + "chap3" + "chap4";
		String combined2 = "chap1".concat("chap2").concat("chap3").concat("chap4");
		
		
		String exp1 = "abc" + 123; // --> "abc" + String.valueOf(123) --> "abc".concat(String.valueOf(123)) --> "abc123"
		String exp2 = 123 + "abc"; // --> String.valueOf(123) + "abc" --> String.valueOf(123).concat("abc") --> "123abc"
		
		String exp3 = 11 + 22 + " hello " + 33 + true + (11 + 22) + 3.14;
		System.out.println(exp3);
		
	}

}
