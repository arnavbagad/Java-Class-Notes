package jrJava.array1;

public class Practice1 {

	public static void main(String[] args) {
		
		int[] values = new int[5];

		values[0] = 5;
		values[1] = -10;
		values[2] = values[0] + values[1];
		values[3] = values[2]*2;
		values[4] = values[0] + values[1] + values[2] + values[3];
		//values[5] = 1001;
		
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);
		System.out.println(values[3]);
		System.out.println(values[4]);
		
		for(int i=0; i<5; i++){
			System.out.println(values[i]); 
		}
		
	}

}
