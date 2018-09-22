package jrJava.methodCall6_recursion;

public class Practice4 {

	public static void main(String[] args) {

		int x = combinations(4,2);
		int y = permatations(4,2);
		System.out.println(x + ", " + y);
	}


	// n! --> 1*2*3*...n
	public static int permatations(int n, int r){
		if(n==1) return 1;
		return factorial(n)/factorial(n-r);
	}

	// n! --> 1*2*3*...n
		public static int combinations(int n, int r){
			if(n==1) return 1;
			return factorial(n)/(factorial(r)*factorial(n-r));
		}

	
	// n! --> 1*2*3*...n
	public static int factorial(int n){
		if(n==1) return 1;
		return factorial(n-1) * n;
	}




	// n! --> 1*2*3*...n
	public static int factorial_wo_recusion(int n){
		int product = 1;
		for(int i=1; i<=n; i++){
			product = product*i; 
		}
		return product;
	}

}
