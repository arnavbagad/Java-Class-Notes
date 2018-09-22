package jrJava.methodCall6_recursion;

public class Practice7 {

	
	public static void main(String[] args) {
		
		
	}

	
	// will calculate and return the sum of (begin)+(begin1)+(begin2)+...(end)  
	public static int sum(int begin, int end){
		int mid = (begin + end)/2;
		if(mid==end) return begin;
		return sum(begin, mid) + sum(mid+1, end);
	}
	

}
