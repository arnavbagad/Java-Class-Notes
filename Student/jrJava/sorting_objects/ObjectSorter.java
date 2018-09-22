package jrJava.sorting_objects;

public class ObjectSorter {

	public static void main(String[] args) {
		
		/*
		Employee[] employees = Utility.loadEmployeeArrayFromFile("jrJava/sorting_objects/employee.txt");
		Utility.print(employees);
		//bubbleSort(employees);
		//selectionSort(employees);
		insertionSort(employees);
		Utility.print(employees);
		*/
		Ball[] balls = Utility.loadBallArrayFromFile("jrJava/sorting_objects/balls.txt");
		Utility.print(balls);
		insertionSort(balls);
		Utility.print(balls);
	}

	
	
	public static void insertionSort(Comparable[] data){
		int i, j;
		Comparable temp;
		for(i=1; i<data.length; i++){
			temp = data[i];
			for(j=i-1; j>=0; j--){ 
				if(data[j].compareTo(temp)>0) data[j+1] = data[j]; 
				else break;
			}
			data[j+1] = temp;
		}
	}
	
	
	
	public static void selectionSort(Comparable[] data){
		int i, j, minIndex;
		Comparable temp;
		for(i=0; i<data.length-1; i++){ 
			minIndex = i;
			for(j=i+1; j<data.length; j++){
				if(data[j].compareTo(data[minIndex])<0) minIndex = j;
			}
			temp = data[i]; 
			data[i] = data[minIndex];
			data[minIndex ] =temp;
		}
	}
	
	
	
	public static void bubbleSort(Comparable[] data){
		int i;
		Comparable temp; 
		boolean sorted = false;;
		
		while(!sorted){  
			sorted = true; 
			for(i=0; i<data.length-1; i++){
				if(data[i].compareTo(data[i+1])>0){  // if(data[i+1].compareTo(data[i])<0){
					sorted = false;
					temp = data[i];
					data[i] = data[i+1];
					data[i+1] = temp;
				}
			}
			
		}
	}
	
	
	
	
	
}







