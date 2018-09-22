package jrJava.recursion2;

public class Fibonacci {

	
	public static void main(String[] args) {
		
		long t1 = System.currentTimeMillis();
		System.out.println(fiboWORecursion(60)); 
		long t2 = System.currentTimeMillis();
		System.out.println(fibo(60)); 
		long t3 = System.currentTimeMillis();
		
		System.out.println(t2-t1);
		System.out.println(t3-t2); 
	}

	
	public static long fibo(int n){
		if(n==1 || n==2) return 1;
		return fibo(n-2) + fibo(n-1);
	}
	
	
	
	public static long fiboWORecursion(int n){
		
		long first = 1;
		long second = 1;
		
		if(n==1) return first;
		else if(n==2) return second;
		
		long third = 0;
		for(int i=3; i<=n; i++){
			third = first + second;
			first = second;
			second = third;
		}
		
		return third;
	}
	
	
}












