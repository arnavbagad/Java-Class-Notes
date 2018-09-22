package jrJava.methodCall1;

public class Practice3 {

	public static void main(String[] args) {
		int a = 12;
		int b = 5;
		int c = a + b;
		System.out.println(c);	
		mA();
		System.out.println(c);	
	}

	public static void mA(){
		int a = 12;
		int b = 5;
		int c = a * b;
		System.out.println(c);	
		mB();
		System.out.println(c);	
	}
	
	public static void mB(){
		int a = 12;
		int b = 5;
		int c = a % b;
		System.out.println(c);	
	}

}
