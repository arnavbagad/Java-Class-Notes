package jrJava.sorting_instertion;

public class BubbleSorter {

	public static void main(String[] args) {
		
		//int[] data = {45, 37, 25, 11, 5, 64, 77, 55, 88, 29, 91, 9};
		//int[] data = Utility.createIntArray(300);
		int[] data = Utility.loadIntArrayFromFile("jrJava/sorting_bubble/random.txt");
		Utility.print(data);
		
		sort(data);
		Utility.print(data);
	}

	
	// Performance:
	// 1. {2, 5, 6, 8, 11, 17} --> It will scan once for confirmation.
	// 2. {2, 5, 8, 6, 11, 17} --> It will scan twice, one for ordering and one for confirmation.
	// 3. {17, 2, 5, 6, 8, 11} --> It will scan twice, one for ordering ('17' will be carried over all the way to the end in one scan.), one for confirmation.
	// 4. {5, 6, 8, 11, 17, 2} --> (w.c.s.) It will scan six times, five for ordering, one for confirmation.
	// 5. {17, 11, 8, 6, 5, 2} --> (w.c.s.) It will scan six times, five for ordering, one for confirmation.
	// 6. If array size is 10, (w.c.s.) how many times the comparison has to happen? 10 scans and 9 comparison in each scan --> 10*9 -> 90 --> ~10*10
	// 7. If array size is 100, (w.c.s.) how many times the comparison has to happen? 100 scans and 99 comparison in each scan --> 100*99 -> 9900 --> ~100*100
	// 8. If array size is n, (w.c.s.) how many times the comparison has to happen? n scans and (n-1) comparison in each scan --> n*(n-1) --> ~n*n (quadratic)
	
	public static void sort(int[] values){
		int i, temp; // 'temp' is for swap operation.
		boolean sorted = false;
		
		while(!sorted){ //  while(sorted==false){
			// We scan the whole array. While we scan it,
			// we compare two consecutive elements, the values at [i] and the value at [i+1].
			// (Careful: the index'i' will have the range [0, len-2], not [0, len-1].)
			// When we compare, if we find that they are in incorrect order, we swap them.
			
			sorted = true; // Each time we scan, we make an assumption that the whole array is already sorted.
			
			for(i=0; i<values.length-1; i++){
				if(values[i]>values[i+1]){
					// Being here means: there are elements in wrong order.
					// They need to be swapped.
					// Means: the assumption was wrong.
					sorted = false;
					temp = values[i];
					values[i] = values[i+1];
					values[i+1] = temp;
				}
			}
		}
	}
	
	
}





