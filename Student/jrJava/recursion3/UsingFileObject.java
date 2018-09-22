package jrJava.recursion3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UsingFileObject {

	public static void main(String[] args) {
		
		/*
		String path = "jrJava/sorting_bubble/random.txt";
		File file = new File(path);

		System.out.println( file.exists() );
		System.out.println( file.isFile()); 
		System.out.println( file.isDirectory()); 
		System.out.println( file.length()); 
		*/
		
		/*
		String path = "jrJava/sorting_bubble";
		File file = new File(path);
		 
		File[] children = file.listFiles();
		for(int i=0; i<children.length; i++){
			System.out.println(children[i].getName());
		}
		*/
		
		
		String path = "jrJava/sorting_bubble/random.txt";
		File file = new File(path);
		
		try {
			Scanner s = new Scanner(file);
			String line;
			while(s.hasNextLine()){
				line = s.nextLine();
				System.out.println(line);
			}
			
			
		} catch (FileNotFoundException e) { }
		
		
	}
}












