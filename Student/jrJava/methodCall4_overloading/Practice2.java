package jrJava.methodCall4_overloading;

public class Practice2 {

	public static void main(String[] args) {
		boolean _a = false;
		System.out.println(_a);
		myMethod(1, 'a');
		myMethod(1, 2.0);
	}


	public static double myMethod(int a, int b){
		return a + b;
	}

	public static double myMethod(int a, double b){
		return a + b;
	}

	public static double myMethod(double a, double b){
		return a + b;
	}

}
