package test1;
import MathStuff.GCD;

public class PrimeFactor {
	static int x;
	public static void main(String[] args) {
		primeFactors(x);
	}

	static int primeFactors(int x){
		int y = 2;
		while(true){
			if(isPrime(x)){
				System.out.println("The last pair is " + x + " and " + y);
				return x;
			}
			if(x%y!=0){
				y++;
			}
			else{
				x=x/y;
				System.out.println("It is " + x + " and " + y);
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
