package MathStuff;

public class LCMEasier {

	public static void main(String[] args) {
		GCD2 gcd = new GCD2();
		int a = 10;
		int b = 8;
		int lcm = a*b/gcd.gcdFinder(a, b);
		System.out.println("The LCM is " + lcm);
	}

}
