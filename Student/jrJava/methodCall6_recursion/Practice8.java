package jrJava.methodCall6_recursion;

public class Practice8 {

	public static void main(String[] args) {
		
	}

	
	// will calculate and return the sum of all digits in a number.
	public static int sumOfDigits(int number){
		if(number<10) return number;
		return sumOfDigits(number/10 + number%10); 
	}
}
