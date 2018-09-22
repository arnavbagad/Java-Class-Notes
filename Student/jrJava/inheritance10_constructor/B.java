package jrJava.inheritance10_constructor;

public class B extends A {

	public B(){
		System.out.println("B()");
	}
	
	public B(int e){
		super(2*e+45);
		System.out.println("B(int)");
	}
	
}
