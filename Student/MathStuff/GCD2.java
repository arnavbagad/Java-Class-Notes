package MathStuff;

public class GCD2 {

	public static void main(String[] args){
		int a = 8;
		int b = 10;
		int lcm = a*b/gcdFinder(a, b);
		System.out.println(lcm);
		
		
	}
	
	public static int gcdFinder(int x, int y){
		System.out.println("Pair is " + x + " and " + y );
		if(x==0 ){
			System.out.println("GCD is " + y);
			return y;
		}
		if(y==0 ){
			System.out.println("GCD is " + x);
			return x;
		}
		if(x==y){
			System.out.println("GCD is " + x);
			return x;
		}
		if(x>y){
			x = x%y;
		}
		else{
			y = y%x;
		}
		return gcdFinder(x,  y);
	}

}
