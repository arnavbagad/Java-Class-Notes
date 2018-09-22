package jrJava.recursion2;

public class Count5 {

	public static void main(String[] args) {

		System.out.println(count5(51555525)); 

	}

	public static int count5(int number){
		if(number==0) return 0;

		if(number%10==5) return count5(number/10) + 1;
		else return count5(number/10);
	}
	
}

 