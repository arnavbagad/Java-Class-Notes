package jrJava.studying_wrapper_5;

public class Practice1 {

	public static void main(String[] args) {
		
		Integer a1 = 123;  // -128 to 127
		Integer a2 = 123;
		Integer a3 = new Integer(123);
		Integer a4 = new Integer(123);
		
		System.out.println(a1==a2);
		System.out.println(a1==a3);
		System.out.println(a3==a4);
	}

}
