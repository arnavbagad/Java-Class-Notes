package jrJava.methodCall4_overloading;

public class Practice1 {

	public static void main(String[] args) {
		

	}

	
	public static int mm(){
		return 100;
	}
	
	public static int mm(int a){
		return 50*a;
	}
	
	public static int mm(boolean a){
		if(a) return 10;
		else return -10;
	}
	
	public static int mm(int a, int b){
		return 50*(a+b);
	}
	
	public static int mm(int a, boolean b){
		if(b) return 10*a;
		else return -10*a;
	}
	
	public static int mm(boolean a,int b){
		if(a) return 10*b;
		else return -10*b;
	}
}
