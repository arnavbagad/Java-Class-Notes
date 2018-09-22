package jrJava.useOfThis;


public class Student {

	private int id;
	private String name;
	private double GPA;
	private boolean honor;


	public Student(){
		id = 100;
		name = "John Doe";
		GPA = 2.0;
		honor = true;
	}

	public Student(int id){
		this.id = id;
		name = "John Doe";
		GPA = 2.0;
		honor = true;
	}

	public Student(int id, String name){
		this.id = id;
		this.name = name;
		GPA = 2.0;
		honor = true;
	}


	public void myMethod(){
		myMethod(100);
	}

	public void myMethod(int id){
		myMethod(id, "John Doe");
	}

	public void myMethod(int id, String name){
		this.id = id;
		this.name = name;
		GPA = 2.0;
		honor = true;
	}

}
