package jrJava.studying_string_2;

public class Practice1 {

	public static void main(String[] args) {
		
		String exp1 = "lunch";
		String exp2 = " ";
		String exp3 = "dinner";
		
		String exp4 = exp1.concat(exp2); // Creates a new String object.
		String exp5 = exp4.concat(exp3); // Creates a new String object.
		System.out.println(exp5); 
		
		String exp7 = exp1.concat(exp2).concat(exp3);
		
		// "... chapter 1 ...".concat("... chapter 2 ...").concat("... chapter 3 ..."). ... .concat("... chapter 30 ...").
		// It is a very expensive operation. Waste of memory space.
		
		int sum = 253;
		String exp10 = String.valueOf(sum);
		System.out.println(sum);
		System.out.println(exp10);
		String combined = "abc".concat(String.valueOf(123));
		 
		double pi = 3.1415;
		String piInString = String.valueOf(pi);
		
		boolean ans = true && true;
		String ansInString = String.valueOf(ans);
		
	}

}












