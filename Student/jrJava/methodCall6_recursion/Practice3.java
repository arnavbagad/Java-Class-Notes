package jrJava.methodCall6_recursion;

public class Practice3 {


	public static void main(String[] args) {	
		int x = sum(10);
		System.out.println(x);
		int y = sum_of_numbers(10);
		System.out.println(y);
	}


	// 1+2+3+...+n
	public static int sum_of_numbers(int n){
		int sum = 0;
		sum = (n*(1+n))/2;
		return sum;
	}
	
	// 1+2+3+...+n
		public static int sum(int n){
		
		if(n==1) return 1;
		return sum(n-1) + n;
		}


	// 1+2+3+...+n
	public static int sum_wo_recursion(int n){
		int sum = 0;
		for(int i=1; i<=n; i++){
			sum+=i;
		}
		return sum;
	}


}
