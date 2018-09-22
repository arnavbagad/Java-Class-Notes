package jrJava.recursion3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TreeSearch {

	public static void main(String[] args) {
		
		//search(new File("jrJava/recursion3/topDir_simple"), "");
		search(new File("jrJava/recursion3/topDir_simple"));
	}

	
	/*
	public static void search(File file, String leadingSpaces){
		System.out.println(leadingSpaces + file.getName()); 
		
		if(file.isFile()) return;
		
		File[] children = file.listFiles();
		for(int i=0; i<children.length; i++) search(children[i], leadingSpaces + "    ");
	}
	*/
	
	
	public static void search(File file){
		
		if(file.isFile()){
			try {
				Scanner s = new Scanner(file);
				String line;
				while(s.hasNextLine()){
					line = s.nextLine();
					if(line.length()>10 && line.charAt(4)=='g' && line.charAt(10)=='s') System.out.println(line);
				}
				
			} catch (FileNotFoundException e) { }
			
			return;
		}
		
		File[] children = file.listFiles();
		for(int i=0; i<children.length; i++) search(children[i]);
	}
	
}














