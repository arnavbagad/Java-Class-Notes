package jrJava.methodCall2_parameters;

public class Practice1 {

	public static void main(String[] args) {
	
		int a = 5;
		boolean b = true;
		char c = 'c';
		
		methodA(a, b, c);
		
		methodA(10, false, 'f');
		
		System.out.println("I am done.");	
	}

	
	
	public static void methodA(int pp, boolean aaa, char xyz){	
		int f = 6;
		boolean g = false;
		
		pp = pp*f;
		aaa = aaa || g;
		System.out.println(pp + "," + aaa + "," + xyz);
	}
	
}
