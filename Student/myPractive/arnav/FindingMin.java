package myPractive.arnav;

public class FindingMin {
	public static void main(String[]args) {
		System.out.println(min(7, 10));
		System.out.println(min(8, 5, 15));
		System.out.println(min(18.2, 10.12));
		System.out.println(min(3.5, 2.1, 6.8));
		// what will the next two statements print out?
		System.out.println(min(15.21, 10));
		System.out.println(min(7, 10, 2.14));
	}
	public static int min(int a, int b) {
		if(a>b){
			System.out.println(b + "is the minimum value");
			return b;
		}
		else{
			System.out.println(a + "is the minimum value");
			return a;
		}
	}
	public static int min(int a, int b, int c) {
		if(a>b){
			System.out.println(b + "is the minimum value");
			if(b>c){
				System.out.println(c + "is the minimum value");
				return c;
			}
			else{
				System.out.println(b + "is the minimum value");
				return b;
			}
		}
		else{
			System.out.println(a + "is the minimum value");
			if(a>c){
				System.out.println(c + "is the minimum value");
				return c;
			}
			else{
				System.out.println(a + "is the minimum value");
				return a;
			}
		}
	}
	public static double min(double a, double b) {
		if(a>b){
			System.out.println(b + "is the minimum value");
			return b;
		}
		else{
			System.out.println(a + "is the minimum value");
			return a;
		}
	}
	public static double min(double a, double b, double c) {
		if(a>b){
			System.out.println(b + "is the minimum value");
			if(b>c){
				System.out.println(c + "is the minimum value");
				return c;
			}
			else{
				System.out.println(b + "is the minimum value");
				return b;
			}
		}
		else{
			System.out.println(a + "is the minimum value");
			if(a>c){
				System.out.println(c + "is the minimum value");
				return c;
			}
			else{
				System.out.println(a + "is the minimum value");
				return a;
			}
		}
	}
}