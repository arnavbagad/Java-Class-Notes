package jrJava.recursion1;

public class BasicStructure {

	
	public static void main(String[] args) {
		
		m(0);
		
	}

	
	public static void m(int a){
		a++;
		System.out.println("Welcome to m() method. " + a);
		if(a>=50000) return; 
		m(a);
		// return; // totally useless.
		System.out.println("Good bye " + a);
	}
}
  