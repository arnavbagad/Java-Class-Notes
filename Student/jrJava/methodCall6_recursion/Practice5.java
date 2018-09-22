package jrJava.methodCall6_recursion;

public class Practice5 {


	public static void main(String[] args) {
		//System.out.println(fibonacchi_wo_recursion(5));
		System.out.println(fibonacchi(70));
	}


	
	// will calculate and return the fibonacchi number at index n
		public static long fibonacchi(long n){
			if(n==1 || n==2) return 1;
			return fibonacchi(n-2) + fibonacchi(n-1);
		}
	
	
	

	// will calculate and return the fibonacchi number at index n
	public static long fibonacchi_wo_recursion(long n){

		if(n==1 || n ==2) return 1;

		long first = 1;
		long second = 1;
		long third = 0;

		for(long i=3; i<=n; i++){
			third = first + second;
			first = second;
			second = third;
		}

		return third;
	}

}
