package jrJava.methodCall3_returnValues;

public class Practice3 {

	public static void main(String[] args) {

		double resultA = mA(3, 4);  // The promotion happens right here during the assignment.
		double resultB = mB(3, 4);  // The promotion happened before it came up here. It happened in the method.
		double resultC = mC(3, 4);  // The promotion happened before it came up here. It happened in the method.
	}


	public static int mA(int a, int b){
		return a + b;
	}


	public static double mB(int a, int b){
		return a + b;
	}
	
	
	public static int mC(double a, double b){
		return (int)(a + b);
	}
	
	
}
