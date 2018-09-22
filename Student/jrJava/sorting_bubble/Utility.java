package jrJava.sorting_bubble;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Utility {

	
	public static void print(int[] data){
		for(int i=0; i<data.length; i++){
			System.out.print(data[i] + " ");
			if(i!=0 && i%40==0) System.out.println();
		}
		System.out.println("\n");  
	}
	
	
	public static int[] createIntArray(int size){
		int[] data = new int[size];
		for(int i=0; i<data.length; i++){
			data[i] = (int)(Math.random()*1000);
		}
		return data;
	}
	
	
	
	public static int[] loadIntArrayFromFile(String filePath){
		
		int[] data = null;
		Scanner s;
		int count = 0;
		
		try {
			s = new Scanner(new File(filePath));
			while(s.hasNextInt()){
				s.nextInt();
				count++;
			}
			s.close();
			
			data = new int[count];
			count = 0;
			s = new Scanner(new File(filePath));
			while(s.hasNextInt()){
				data[count] = s.nextInt();
				count++;
			}
			s.close();
			
		} catch (FileNotFoundException e) {  }
		
		return data;
	}
	
}















