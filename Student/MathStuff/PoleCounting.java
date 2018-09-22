package MathStuff;

public class PoleCounting {

	
	public static void main(String[] args) {
		double x = poleCounting(0,3);
		System.out.println(x);
	}

	
	public static double poleCounting(double x, double y){
		double poles = (x/y)+1;
		return poles;
	}
	
	
}
