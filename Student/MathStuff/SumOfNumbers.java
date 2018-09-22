package MathStuff;

public class SumOfNumbers {

	public static void main(String[] args) {	

		int x = sum_of_numbers(10);
		System.out.println(x);
	}


	// 1+2+3+...+n
	public static int sum_of_numbers(int n){
		int sum = 0;
		sum = (n*(1+n))/2;
		return sum;
	}



}
