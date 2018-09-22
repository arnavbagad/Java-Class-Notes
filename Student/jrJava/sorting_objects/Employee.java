package jrJava.sorting_objects;

import java.util.StringTokenizer;

public class Employee implements Comparable {

	private String firstName, lastName;
	private int id;
	private String title;
	private int hiredYear;
	private int salary;
	private int dobYY, dobMM, dobDD;
	private char gender;
	private int height, weight;
	
	
	public Employee(String firstName, String lastName, int id, String title /* ... */){
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.title = title;
		// ...
	}
	
	
	public Employee(String line){
		StringTokenizer st = new StringTokenizer(line, " ");
		
		firstName = st.nextToken();
		lastName = st.nextToken();
		id = Integer.parseInt(st.nextToken());
		title = st.nextToken();
		hiredYear = Integer.parseInt(st.nextToken());
		salary = Integer.parseInt(st.nextToken());
		dobYY = Integer.parseInt(st.nextToken());
		dobMM = Integer.parseInt(st.nextToken());
		dobDD = Integer.parseInt(st.nextToken());
		gender = st.nextToken().charAt(0);
		height = Integer.parseInt(st.nextToken());
		weight = Integer.parseInt(st.nextToken());
	}
	
	
	
	public int compareTo(Object o){
		Employee e = (Employee) o;
		/*
		if(weight > e.weight) return 1;
		else if(weight < e.weight) return -1;
		else {
			return firstName.compareTo(e.firstName);
		}
		*/
		
		if(weight%2==0 && e.weight%2==1) return 1;
		else if(weight%2==1 && e.weight%2==0) return -1;
		else {
			if(weight>e.weight) return 1;
			else if(weight<e.weight) return -1;
			else return 0;
		}
	}
	
	
	
	public String toString(){
		return id + ", " + firstName + ", " + lastName + ", " + title + ", " + salary + ", " + weight + ", " + height;
	}
	
	
	public boolean equals(Object o){
		if(!(o instanceof Employee)) return false;
		Employee e = (Employee) o;
		return id == e.id;
	}
	
	
	public int hashCode(){
		return 1; // WRONG!!!
	}
	
}









