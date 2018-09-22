package jrJava.twoDimenArrayObjects;

import jrJava.inheritance1.A;

import jrJava.inheritance1.A;

public class Practice1 {

	public static void main(String[] args) {
		
		int[][] a = new int[4][];
		
		//int[] b1 = {1, 2, 3};
		//a[0] = b1;
		
		a[0] = new int[]{1, 2, 3};
		//a[1] = new int[]{11, 12};
		a[2] = new int[]{21, 22, 23, 24};
		a[3] = new int[]{31, 32, 33, 34 ,35};
		
		//System.out.println(a[0][0]);
		//System.out.println(a[2][1]);
		
		// the lat of the last one:
		// ref[ref.length-1]  <-- ref = a[a.length-1] 
		//System.out.println(a[a.length-1][a[a.length-1].length-1]); 
		//print(a);
		printMaxMin(a);
	}

	
	public static void print(int[][] data){
		
		for(int i=0; i<data.length; i++){
			
			if(data[i]==null){
				System.out.println("null");
				continue;
			}
			
			for(int j=0; j<data[i].length; j++){
				System.out.print(data[i][j] + "  ");
			}
			System.out.println();
		}
		
	}
	
	
	public static void printMaxMin(int[][] data){
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<data.length; i++){
			
			if(data[i]==null) continue;
			
			for(int j=0; j<data[i].length; j++){
				if(data[i][j]>max) max = data[i][j];
				if(data[i][j]<min) min = data[i][j];
			}
		}
		
		System.out.println("Max=" + max + ", Min="+min);
	}
	
}
 








