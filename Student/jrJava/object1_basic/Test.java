package jrJava.object1_basic;

public class Test {


	public static void main(String[] args) {

		//Student sheldon = new Student();
		//System.out.println(sheldon);
		
		//System.out.println(sheldon.grade);
		//sheldon.grade = 9;
		//System.out.println(sheldon.grade);
		
		Student sheldon = new Student();
		sheldon.grade = 9;
		sheldon.classroom = 'E';
		sheldon.mathScore = 99;
		sheldon.socialScienceScore = 41;
		sheldon.isHonorStudent = true;
		sheldon.isSuspended = false;

		Student leonard = new Student();
		leonard.grade = 9;
		leonard.classroom = 'E';
		leonard.mathScore = 99;
		leonard.socialScienceScore = 41;
		leonard.isHonorStudent = true;
		leonard.isSuspended = true;
	}

}
