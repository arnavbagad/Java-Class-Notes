package myPractive.arnav;

public class GCD {

	public static void main(String[] args){
		
	}
	
	public static void gcdFinder(int x, int y){
		System.out.println("Pair is " + x + " and " + y );
		if(x==0 ){
			System.out.println("GCD is" + y);
			System.exit(0);
		}
		if(y==0 ){
			System.out.println("GCD is" + x);
			System.exit(0);
		}
		if(x==y){
			System.out.println("GCD is " + x);
			System.exit(0);
		}
		if(x>y){
			int z = 0;
			while(x>z){
				z = z + y;
			}
			z = z-y;
			x = x-z;
		}
		else{
			int z = 0;
			while(y>z){
				z = z + x;
			}
			z = z-x;
			y = y-z;
		}
	}

}
