package jrJava.studying_string_2;

import java.io.File;
import java.util.Scanner;

public class Practice5 {
	
	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(new File("jrJava/studying_string_2/content.txt"));
		String line;
		
		while(scanner.hasNextLine()){
			line = scanner.nextLine();
			
			// 1. count total number of words.
			// 2. count words at least 10 characters long.
			// 3. count words having "pp".
			// 4. count words having 's' followed by 'p'.
			
			System.out.println(line);
		}
		
	}

}
 