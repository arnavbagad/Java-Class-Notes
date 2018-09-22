package jrJava.methodCall1;

public class Practice2 {

	public static void main(String[] args) {
		int a = 5;
		int b = 12;
		int c = a+b;
		mA();
		int d = a*b*c;
		int e = a+b+c;
		System.out.println(c);
	}

	public static void mA(){
		int f = 7;
		int g = 14;
		int h = f*g;
		mB();
		int k = g/f;
		System.out.println(k);	
	}

	public static void mB(){
		int p = 22;
		int q = 7;
		int r = p%q;
		System.out.println(r);		
	}

}
