package jrJava.recursion2;

public class Sum1 {

	public static void main(String[] args) {
		System.out.println(sum(5));
	}

	
	// 1 + 2 + 3 + ... + n
	public static int sum(int n){
		if(n==1) return 1;
		return sum(n-1) + n;
	}
	
}
