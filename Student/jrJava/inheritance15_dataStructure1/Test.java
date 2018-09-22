package jrJava.inheritance15_dataStructure1;

public class Test {

	public static void main(String[] args) {
		
		A[] a = new A[4];
		
		a[0] = new B();
		a[1] = new C();
		a[2] = new A();
		a[3] = new D();

		remoteMethod(a);
	}

	
	
	
	public static void remoteMethod(A[] things){
		
		for(int i=0; i<things.length; i++){
			things[i].m();
		}
	}
	
}
