package jrJava.methodCall5_design;

public class Practice1_usingMethod {

	public static void main(String[] args) {

		System.out.println(sum(100));
		System.out.println(sum(777));
		System.out.println(sum(1234));
		System.out.println(sum(5000));

	}

	public static int sum(int endNumber){
		int sum = 0;
		for(int i=1; 1<=endNumber; i++){
			sum += i;
		}
		return sum;
	}


}
