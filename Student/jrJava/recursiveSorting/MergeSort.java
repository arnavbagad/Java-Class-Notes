package jrJava.recursiveSorting;

public class MergeSort {

	public static void main(String[] args) {
		
		int[] sample = {34, 11, 24, 9, 77, 43, 25, 21, 19, 5, 17,32, 39, 44, 28, 2};
		sort(sample, 0, sample.length-1, new int[sample.length]); 
		for(int i=0; i<sample.length; i++) System.out.print(sample[i] + " ");
	}

	
	public static void sort(int[] data){
		sort(data, 0, data.length-1, new int[data.length]);
	}
	
	
	
	private static void sort(int[] data, int low, int high, int[] temp){
		
		if(low>=high) return; // cannot break into smaller jobs.
		
		int mid = (low + high)/2;
		sort(data, low, mid, temp);
		sort(data, mid+1, high, temp);
		
		// merge them.
		for(int i=low; i<=high; i++) temp[i] = data[i];
		
		int i=low, j=mid+1, k=low;
		while(i<=mid && j<=high) {
			if(temp[i]<temp[j]) data[k++] = temp[i++];
			else data[k++] = temp[j++];
		}
		
		while(i<=mid) data[k++] = temp[i++];
	}
	
}













