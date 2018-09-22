package jrJava.sorting_selection;

public class SelectionSorter {


	public static void main(String[] args) {
		//int[] values = Utility.loadIntArrayFromFile("jrJava/sorting_selection/random.txt");
		//Utility.print(values);
		//sort(values);
		//Utility.print(values);
		
		int[] values = Utility.createIntArray(1000000);
		long time1 = System.currentTimeMillis();
		sort(values);
		long time2 = System.currentTimeMillis();
		System.out.println(time2-time1); 
	}
 
	
	// Performance:
	// 1. {2, 5, 6, 8, 11, 17}, how many times the comparisons? --> 5 + 4 + 3 + 2 + 1 --> 15
	// 2. {17, 11, 8, 6, 5, 2}, how many times the comparisons? --> 5 + 4 + 3 + 2 + 1 --> 15
	// 3. There is no b.c.s. or w.c.s. in selection sorting. They will do same amount of computation.
	// 4. If array length is n, how many times the comparisons? --> (n-1) + {n-2) + .. + 2 + 1 --> n(n-1)/2 --> ~n*n/2 (quadratic)
	
	public static void sort(int[] data){
		// Selection Sorting:
		// We shrink window by one index each time (window range [0, length-1] --> [length-2, length-1])
		// In each window, we locate(select) the minIndex (the index that holds the min value).
		// (We assume the beginning index of the window to be minIndex. Then, we challenge that with the rest of the elements in the window.)
		// Then, we swap the value at the minIndex with the value at the beginning index of the window.
		
		int i, j, minIndex, temp; 
		// 'i' will be used to shrink the window. 'i' will change from 0 to length-2. (window [0, length-1] --> [length-2, length-1].
		// 'minIndex' will hold the index of min value in the current window (minIndex<== i).
		// 'j' will be used to locate (select) the minIndex. 'j' will start right after the begin index of the window (j==i+1).
		
		for(i=0; i<data.length-1; i++){  // window range [0, length-1] --> [i, length-1] --> [length-2, length-1]
			minIndex = i;
			for(j=i+1; j<data.length; j++){
				if(data[j]<data[minIndex]) minIndex = j;
			}
			
			// We need to pull the data[minIndex to the front of the window by swapping data[minIndex] and data[i].
			temp =data[i];
			data[i] = data[minIndex];
			data[minIndex] = temp;
		}
		
	}

}














