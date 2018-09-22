package jrJava.inheritance10_constructor;

public class C extends B {

	public C(){
		System.out.println("C()");
	}
	
	public C(int e){
		super(e-200);
		System.out.println("C(int)");
	}
}
