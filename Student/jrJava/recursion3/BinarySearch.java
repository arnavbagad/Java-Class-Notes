package jrJava.recursion3;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[] a = {2, 2, 3, 4, 6, 7, 7, 8, 11, 12, 14, 14, 17, 18, 21, 24, 31, 37, 39, 42, 43, 44, 48, 55, 70, 71, 71, 72, 81, 88, 91, 95};
		System.out.println( searchWORecursion(a, 35) );
		System.out.println( search(a, 35, 0, a.length-1) );
	}

	
	
	
	// binary search with using recursion.
	public static int search(int[] data, int key, int low, int high){
		if(low>high) return -1;
		
		int mid = (low+high)/2;
		if(key<data[mid]) return search(data, key, low, mid-1);
		else if(key>data[mid]) return search(data, key, mid+1, high);
		else return mid;
	}
	
	
	

	// binary search without using recursion.
	public static int searchWORecursion(int[] data, int key){
		
		int low = 0;;
		int high = data.length-1;
		int mid;
		
		while(low<=high){
			mid = (low + high)/2;
			if(key<data[mid]) high = mid - 1;
			else if (key>data[mid]) low = mid + 1;
			else return mid;
		}
				
		return -1;
	}
	

	
	
}
