package jrJava.recursion2;

public class Factorial1 {

	public static void main(String[] args) {
		

	}

	
	public static int factorial(int n){
		if(n==1) return 1;
		return factorial(n-1)*n;
	}
}
