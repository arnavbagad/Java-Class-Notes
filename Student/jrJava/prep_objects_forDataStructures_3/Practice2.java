package jrJava.prep_objects_forDataStructures_3;

import java.awt.Color;

public class Practice2 {

	public static void main(String[] args) {
		
		Student[] studs = new Student[2];
		studs[0] = new Student("Billy", 106, 'D', 4.02, Color.red);
		studs[1] = new Student("Emily", 111, 'B', 3.98, Color.magenta);
		
		for(int i=0; i<studs.length; i++) System.out.println(studs[i]); 
		
		
		if(studs[0].compareTo(studs[1])>0){
			Student temp = studs[0]; 
			studs[0] = studs[1];
			studs[1] = temp;
		}
		
		System.out.println(); 
		for(int i=0; i<studs.length; i++) System.out.println(studs[i]); 
	}

}
