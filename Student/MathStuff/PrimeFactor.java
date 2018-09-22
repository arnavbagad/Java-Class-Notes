package MathStuff;

public class PrimeFactor {

	public static void main(String[] args) {
		primeFactors(2010);
	}

	static void primeFactors(int x){
		int y = 2;
		while(true){
			if(isPrime(x)){
				System.out.println("The last pair is " + x + " and " + y);
				System.exit(0);
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
