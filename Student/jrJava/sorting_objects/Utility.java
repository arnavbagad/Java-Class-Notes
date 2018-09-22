package jrJava.sorting_objects;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Utility {

	
	public static void print(Object[] data){
		System.out.println("[" + data[0]);
		for(int i=1; i<data.length-1; i++) System.out.println(" " + data[i]); 
		System.out.println(" " + data[data.length-1] + "]");
		System.out.println();
	}
	
	
	public static Ball[] loadBallArrayFromFile(String filePath){
		
		Ball[] balls = null;
		Scanner s;
		int count = 0;
		String line;
		
		try {
			s = new Scanner(new File(filePath));
			while(s.hasNextLine()){
				line = s.nextLine();
				if(line.trim().length()==0) continue;
				count++;
			}
			s.close();
			
			balls = new Ball[count];
			count = 0;
			s = new Scanner(new File(filePath));
			while(s.hasNextLine()){
				line = s.nextLine();
				if(line.trim().length()==0) continue;
				
				balls[count] = new Ball(line);
				count++;
			}
			s.close();
			
			
		} catch (FileNotFoundException e) { }
		
		return balls;
	}
	
	
	
	public static Employee[] loadEmployeeArrayFromFile(String filePath){
		
		Employee[] employees = null;
		Scanner s;
		int count = 0;
		String line;
		
		try {
			s = new Scanner(new File(filePath));
			while(s.hasNextLine()){
				line = s.nextLine();
				if(line.trim().length()==0) continue;
				count++;
			}
			s.close();
			
			employees = new Employee[count];
			count = 0;
			s = new Scanner(new File(filePath));
			while(s.hasNextLine()){
				line = s.nextLine();
				if(line.trim().length()==0) continue;
				
				employees[count] = new Employee(line);
				count++;
			}
			s.close();
			
			
		} catch (FileNotFoundException e) { }
		
		return employees;
	}
	
}





