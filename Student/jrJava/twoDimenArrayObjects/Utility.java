package jrJava.twoDimenArrayObjects;

import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Utility {


	public static void print(Object[] objs){
		if(objs==null || objs.length==0) return;

		System.out.println("[" + objs[0]);
		for(int i=1; i<objs.length-1; i++) System.out.println(" " + objs[i]);
		System.out.println(" " + objs[objs.length-1] + "]");
		System.out.println(); 
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

		} catch(Exception e){ }

		return employees;
	}


}