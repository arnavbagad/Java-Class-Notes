package jrJava.object1_basic;


public class Student {

	int grade;
	char classroom;
	int mathScore;
	int socialScienceScore;
	boolean isHonorStudent;
	boolean isSuspended;


	double calculateGPA(){
		double sum = mathScore + socialScienceScore;
		return sum/2;
	}
	
	
	void changeClassroom(char a){
	
	}
}
