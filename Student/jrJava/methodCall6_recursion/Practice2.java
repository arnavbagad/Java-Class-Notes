package jrJava.methodCall6_recursion;

public class Practice2 {


	public static void main(String[] args) {

		doSomething(0);
	}


	public static void doSomething(int a){
		a++;
		int b = 10;
		int c = a + b;
		System.out.println(a + ", " + b + ", " + c);
		if(a>=4) return;
		doSomething(a);
		System.out.println(a + ", " + b + ", " + c);
	}

}
