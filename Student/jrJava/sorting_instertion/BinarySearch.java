package jrJava.sorting_instertion;

public class BinarySearch {

	
	public static void main(String[] args) {
		
		int[] values = Utility.loadIntArrayFromFile("jrJava/sorting_bubble/random.txt");
		Utility.print(values);
		
		//BubbleSorter.sort(values);
		Utility.print(values);
		
		int index = search(values, 541);
		System.out.println("index=" +index);
	}

	
	
	public static int search(int[] data, int searchKey){
		
		int low = 0, high = data.length-1; // current search range [low, high]
		int mid;
		
		int count = 0; // DELETE AFTER THIS!!!
		while(low<=high){
			count++;  // DELETE AFTER THIS!!!
			System.out.println(count); // DELETE AFTER THIS!!!
			mid = (low + high)/2;
			if(searchKey>data[mid]) low = mid + 1;
			else if(searchKey<data[mid]) high = mid - 1;
			else return mid;
		}
		
		return -1;
	}
	
}



