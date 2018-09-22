package jrJava.array1;

import resources.SoundPlayer;

public class Practice3 {

	public static void main(String[] args) {

		int len = 40;

		int[] data = new int[len];

		for(int i=0; i<len; i++) data[i] = (int)(Math.random()*100);

		for(int i=0; i<len; i++) System.out.println(data[i] + ' ');
		System.out.println();

		int sum = 0;
		sum = sum + data[0];
		for(int i=0; i<len; i++){
			sum = sum + data[i];
		}
		System.out.println("sum = " + sum);
		
		double average = (double)sum/len;
			
		
		int min = data[0];
		for(int i=1; i<len; i++){
			if(data[i]<min) min = data[i];
		}
		System.out.println("Min = " + min);
		
		int max = data[0];
		for(int i=1; i<len; i++){
			if(data[i]>max) max = data[i];
		}
		System.out.println("Max = " + max);
	}

}
