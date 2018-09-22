package jrJava.methodCall2_parameters;

public class Practice2 {

	public static void main(String[] args) {
		
		double f = 4.1234; //char f = 'z'; //byte f = 45; //int f = 5;
		float g = 3.1415F; //int g = 12345; //char g = 'e'; //short g = 123; //double g = 5.55;
		boolean h = true;
		
		doSomething((int) f, g, h);	
		doSomething('z', 'a', false);
		doSomething((int) 5.55F, 'a', false);
		
		int a = 4;
		double b = 4.44;
		boolean c = true;
		
		doSomething(a, b, c);
		
		System.out.println(a + "," + b + "," + c);
	}

	public static void doSomething(int a, double b, boolean c){
		System.out.println(a + "," + b + "," + c);
	}
	
}
