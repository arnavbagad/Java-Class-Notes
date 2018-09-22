package jrJava.methodCall3_returnValues;

public class Practice2 {

	public static void main(String[] args) {

		int sum1 = myMethod(3, 4);
		
		System.out.println(myMethod(3, 4));
		
		int sum2 = myMethod(1, 2) + 100*myMethod(3, 4);
		
		int sum3 = myMethod(myMethod(3, 4), myMethod(3, 4));
	}



	public static int myMethod(int a, int b){
		int c = a + b;
		return c;
	}


}
