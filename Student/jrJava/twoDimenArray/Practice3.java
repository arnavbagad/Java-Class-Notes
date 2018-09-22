package jrJava.twoDimenArray;

public class Practice3 {

	
	public static void main(String[] args) {
		
		int[][] a = new int[4][3]; // Special.
		print(a);
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
