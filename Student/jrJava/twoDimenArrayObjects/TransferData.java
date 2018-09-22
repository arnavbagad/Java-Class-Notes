package jrJava.twoDimenArrayObjects;

public class TransferData {

	public static void main(String[] args) {

		Employee[] e = Utility.loadEmployeeArrayFromFile("jrJava.twoDimenArrayObjects/employee.txt");
		Employee[][] emps = new Employee[5][];
		emps[0] = new Employee[3];
		emps[1] = new Employee[4];
		emps[2] = new Employee[5];
		emps[3] = new Employee[6];
		emps[4] = new Employee[7];
		
		
		transfer(e, emps);
		print(emps);
	}
	
	public static void transfer(Employee[] src, Employee[][] dest){
		int i, j;
		int count = 0;
		for(i=0; i<dest.length; i++){
			for(j=0; j<dest[i].length; j++){
				dest[i][j] = src[count];
				count++;
			}
		}
		
	}
	
	public static void print(Employee[][] data){
		int i, j;
		
		for(i=0; i<data.length; i++){
			for(j=0; j<data[i].length; j++){
				System.out.print(data[i][j] + " ");
			}
		System.out.println();
		}
	}
	
}
