package jrJava.methodCall3_returnValues;

public class Practice1 {


	public static void main(String[] args) {


	}

	
	
	public static void mA(int a, int b){

		if(a<0 && b<0){
			System.out.println("Wrong Values!!!");
			return;
		}

		int c = a + b;
		System.out.println(c);
		return;
	}

	
	
	public static int mb(int a, int b){

		if(a<0 && b<0){
			System.out.println("Wrong Values!!!");
			return-1;
		}

		int c = a + b;
		System.out.println(c);
		return c;
	}

}
