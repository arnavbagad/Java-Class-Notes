package jrJava.studying_wrapper_4;

public class Practice1 {

	public static void main(String[] args) {
		
		Integer a1 = 123;  // auto-boxing
		int a2 = a1 + 111; // auto-unboxing
		Integer a3 = a1 + 111; // auto-unboxing, auto-boxing
		
		// exampple 1
		doSomething1(123); // auto-boxing
	
		// example 2:
		Double d1 = 3.14;  // auto-boxing
		doSomething2(d1);  // auto-unboxing
		
		// example 3
		int a6 = doSomething3(); // auto-unboxing --> int a6 = doSomething3().intValue();
		
		// example 4
		Double d2 = doSomething4(); // auto-boxing  --> Double d2 = new Double(doSomething4());
	}

	
	public static void doSomething1(Integer a){
		System.out.println(a + 111); // auto-unboxing
	}
	
	public static void doSomething2(double b){
		Double d = b; // auto-boxing
	}
	
	public static Integer doSomething3(){
		int a = 123;
		return a; // auto-boxing  --> return new Integer(a);
	}
	
	public static double doSomething4(){
		Double d = 3.14;  // auto-boxing
		return d;  // auto-unboxing  --> return d.doubleValue(); 
	}
}







