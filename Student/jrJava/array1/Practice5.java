package jrJava.array1;

public class Practice5 {

	public static void main(String[] args) {
		
		int len = 10;
		int[] data = new int[len];
		
		for(int i=0; i<len; i++) data[i] = (int)(Math.random()*100);
		
		for(int i=0; i<len; i++) System.out.print(data[i] + ' ');
		System.out.println();
		
		data[1] = data[0];
		data[2] = data[1];
		data[3] = data[2];
		data[4] = data[3];
		data[0] = data[4];
		
		
		for(int i=0; i<len; i++) System.out.print(data[i] + " ");
		System.out.println();
	}

}
