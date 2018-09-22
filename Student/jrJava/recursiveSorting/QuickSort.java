package jrJava.recursiveSorting;

public class QuickSort {

	public static void main(String[] args) {
		int[] sample = Utility.createIntArray(1000000);
		
		long t1 = System.currentTimeMillis();
		sort(sample, 0, sample.length-1);
		long t2 = System.currentTimeMillis();
		System.out.println(t2-t1);
		//Utility.print(sample); 
	}
 
	
	public static void sort(int[] data, int low, int high){
		
		if(low>=high) return;
		
		int pivot = data[(low+high)/2]; // data[low], data[high]
		int i=low, j=high, temp;
		
		while(i<=j){
			while(data[i]<pivot) i++;
			while(data[j]>pivot) j--;
			
			if(i<=j){
				temp = data[i];
				data[i] = data[j];
				data[j] = temp;
				i++;
				j--;
			}
		}
		
		sort(data, low, j);
		sort(data, i, high);
	}

}
