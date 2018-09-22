package jrJava.twoDimenArrayObjects;

public class Practice3 {

	public static void main(String[] args) {
		
		// very special case:
		int[][] a = new int[4][3];
		
		print(a);
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
	
}
