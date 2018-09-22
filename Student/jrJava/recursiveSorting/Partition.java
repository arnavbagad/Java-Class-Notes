package jrJava.recursiveSorting;

public class Partition {

	public static void main(String[] args) {
		
		int[] sample = {21, 14, 32, 19, 25, 29, 7, 11, 43, 17, 22, 20, 9, 10};
		partition(sample, 20);
		
		Utility.print(sample);
	}

	
	public static void partition(int[] data, int pivot){
		
		int i=0, j=data.length-1, temp;
		
		while(i<j){
			while(data[i]<=pivot) i++;
			while(data[j]>pivot) j--;
			
			if(i<j){
				temp = data[i];
				data[i] = data[j];
				data[j] = temp;
			}
		}
	}
	
}












