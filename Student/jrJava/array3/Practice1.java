package jrJava.array3;

public class Practice1 {

	public static void main(String[] args) {

		Student[] students = new Student[4];

		students[0] = new Student(101, "Tom", 2.5);
		students[1] = new Student(102, "Dick", 3.2);
		students[2] = new Student(103, "Harry", 3.5);
		students[3] = new Student(104, "Sally", 2.9);
		
		for(int i=0; i<students.length; i++)students[i].print();
		System.out.println();
		
		
		for(int i=0; i<students.length; i++) students[i].increaseGPA(0.5);
		
		
		for(int i=0; i<students.length; i++)students[i].print();
		System.out.println();
	}

}
