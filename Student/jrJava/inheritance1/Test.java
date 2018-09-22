package jrJava.inheritance1;

public class Test {

	public static void main(String[] args) {
		
		B bbb = new B();

		System.out.println(bbb.b);
		bbb.mB();
		
		System.out.println(bbb.a); 
		bbb.mA();
		
		C ccc = new C();
		ccc.mC();
		ccc.mB(); 
		ccc.mA();
	}

}
