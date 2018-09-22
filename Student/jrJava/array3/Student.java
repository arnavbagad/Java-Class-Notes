package jrJava.array3;


public class Student {

	private int id;
	private String name;
	private double GPA;
	
	
	public Student(int _id, String _name, double _GPA){
		id = _id;
		name = _name;
		GPA = _GPA;
	}
	
	
	public void increaseGPA(double bonus){
		GPA += bonus;
	}

	
	public void print(){
		System.out.print("{" + id + ", " + name + ", " + GPA + "} ");
	}
	
}
