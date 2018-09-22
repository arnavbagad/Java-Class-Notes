package MathStuff;

import java.util.ArrayList;

public class LCM {


	
	
	public static void main(String[] args) {
		int a = 2010;
		int b = 5;
		PrimeFactor pf = new PrimeFactor();
		ArrayList<Integer> objA = new ArrayList<Integer>();
		primeFactors(a,objA);
		ArrayList<Integer> objB = new ArrayList<Integer>();
		int asize = objA.size();
		int i=0;
		System.out.println("The Prime Factors of " + a + " are " );
		while(i<asize)
		{ 
			System.out.println(objA.get(i));
			i++;
		}
		primeFactors(b,objB);
		int bsize = objB.size();
		int q=0;
		System.out.println("The Prime Factors of " + b + " are " );
		while(q<bsize)
		{ 
			System.out.println(objB.get(q));
			q++;
		}

	}

	void lcmFinder(int x, int y){


		/*This is how elements should be added to the array list*/


	}


	static void primeFactors(int x, ArrayList obj){
		int y = 2;
		while(true){
			if(isPrime(x)){
				
				obj.add(x);
				return;
			}
			if(x%y!=0){
				y++;
			}
			else{
				x=x/y;
				if(isPrime(y))obj.add(y);
			}
		}
	}

	static //checks whether an int is prime or not.
	boolean isPrime(int n) {
		for(int i=2;2*i<n;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
}
