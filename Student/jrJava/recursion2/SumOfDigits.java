package jrJava.recursion2;

public class SumOfDigits {

	public static void main(String[] args) {
		
		System.out.println(sumOfDigits(12345)); 
	}
	
	
	public static int sumOfDigits(int number){
		if(number<10) return number;
		return sumOfDigits(number/10) + number%10;
	}

}
