package jrJava.prep_objects_forDataStructures_3;

import java.awt.Color;

public class Student implements Comparable {

	private String name;
	private int id;
	private char classRoom;
	private double gpa;
	private Color favoriteColor;
	
	public Student(String name, int id, char classRoom, double gpa, Color favoriteColor){
		this.name = name;
		this.id = id;
		this.classRoom = classRoom;
		this.gpa = gpa;
		this.favoriteColor = favoriteColor;
	}
	
	
	public String toString(){
		return "Student [name:"+name +" , id:" + id + " ,classRoom:" + classRoom + " , GPA:" + gpa + ", fColor:" + favoriteColor + "]";
	}
	
	
	public boolean equals(Object o){
		if(!(o instanceof Student)) return false;
		Student s = (Student) o;
		//return id==s.id;
		return name.equals(s.name) && classRoom==s.classRoom && favoriteColor.equals(s.favoriteColor);
	}
	
	
	public int compareTo(Object o){
		Student s = (Student) o;
		
		//if the order should be by GPA:
		//if(gpa>s.gpa) return 1;
		//else if(gpa<s.gpa) return -1;
		//else return 0;
		
		//if the order should be by name.
		if(name.compareTo(s.name)>0) return 1;
		else if(name.compareTo(s.name)<0) return -1;
		else return 0;
		
		//return name.compareTo(s.name);
	}
	
}















