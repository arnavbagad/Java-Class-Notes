package MathStuff;

public class The3M {

	public static void main(String[] args) {
		meanMedian(3.0, 21.0, 4.0, 10.0, 90.0);
	}
	
	static void meanMedian(double a, double b, double c, double d, double e){
		double x = (a + b + c + d + e)/5;
		System.out.println("The mean is " + x);
	}
}
