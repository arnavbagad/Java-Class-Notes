package jrJava.twoDimenArray;


public class Practice2 {

	public static void main(String[] args) {
		
		// Two-dimensional array initialization.
		
		/*
		int[] a1 = { 1, 2, 3};
		int[] a2 = { 11, 12, 13, 14};
		int[] a3 = { 21, 22};
		int[] a4 = { 31, 32, 33, 34, 35};
		
		int[][] b = { a1, a2, a3, a4};
		*/
		
		int[][] b = { { 1, 2, 3}, { 11, 12, 13, 14}, { 21, 22}, { 31, 32, 33, 34, 35} };
		print(b);
	}

	

	public static void print(int[][] data){
		if(data==null) return;
		
		int i, j;
		for(i=0; i<data.length; i++){
			if(data[i]==null){
				System.out.println("null");
				continue;
			}
			for(j=0; j<data[i].length; j++){
				System.out.print(data[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
}
