package jrJava.recursiveSorting;

public class PrePost {

	public static void main(String[] args) {
		
		//int x = 10;
		
		//System.out.println(x++); 
		//System.out.println(x); 

		//System.out.println(++x);
		//System.out.println(x);
		
		//int y = x++ + ++x;
		//System.out.println(y);
		
		//int y = ++x + x++;
		//System.out.println(y);
		
		//int x = 10;
		//x = x++;
		//System.out.println(x);
		
		//int x = 10;
		//x = ++x;
		//System.out.println(x);
		
		//int x = 10;
		//x = x++ + ++x;
		//System.out.println(x);
		
		//int x = 10;
		//x = ++x + x++;
		//System.out.println(x);
		
		//int x = 10;
		//x = x++ + x++ + x++;
		//System.out.println(x);
		
		//int x = 10;
		//x = ++x + ++x + ++x;
		//System.out.println(x);
		
		int x = 10;
		System.out.println( sum(x++, x++, x++));  
		
	}

	
	public static int sum(int v1, int v2, int v3){
		return v1+v2+v3;
	}
	
	
}

 









