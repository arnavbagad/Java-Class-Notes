package jrJava.recursion2;

public class Factorial2 {

	public static void main(String[] args) {
		System.out.println(factorial(1, 5)); 
	}

	
	public static int factorial(int begin, int end){
		if(begin==end) return begin;
		int mid = (begin + end)/2;
		return factorial(begin, mid)*factorial(mid+1, end);
	}
	
}
