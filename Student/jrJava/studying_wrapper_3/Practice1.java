package jrJava.studying_wrapper_3;

public class Practice1 {

	
	public static void main(String[] args) {
		
		// Auto-boxing: whenever and wherever it needs an Object (Wrapper Class Object), but it sees
		// a primitive type data, it will automatically creates a Wrapper Class Object for you.
		
		// Auto-unboxing (deboxing): whenever and wherever it needs a primitive type data, but it sees
		// Wrapper Class Object, it will automatically convert that to a primitive type data.
		
		// Integer a1 = new Integer(142); 
		Integer a1 = 142;  // auto-boxing.
		
		//int data = a1.intValue();
		int data = a1;
		
		// -----------------------------------------------
		
		Double d1 = 3.14; // Double d1 = new Double(3.14); close to this.
		double d2 = d1;  // d1.doubleValue(); 
		
		
		
		Integer c1 = a1 + 11;
		
		
	}

}











