package jrJava.inheritance17_ObjectMethodsOverride;

public class Test {

	public static void main(String[] args) {
		
		Object r1 = new MyOwnClass(100, 55);
		Object r2 = new MyOwnClass(100, 55);
		
		System.out.println( r1.equals(r2) );
		
		System.out.println(r1);
		
	}

}
 