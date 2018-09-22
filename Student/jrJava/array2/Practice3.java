package jrJava.array2;

public class Practice3 {

	public static void main(String[] args) {
		
		int[] aaa = {5, 20, 56, 101, 54};
		print(aaa);
		System.out.println( sum(aaa) );
		
		
	}

	
	public static void print(int[] data){
		for(int i=0; i<data.length; i++){
			System.out.print(data[i] + " ");
		}
		System.out.println(); 
	}
	
	
	public static int sum(int[] data){
		int sum = 0;
		for(int i=0; i<data.length; i++){
			sum += data[i];
		}
		return sum;
	}
	
}
