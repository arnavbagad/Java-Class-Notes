package jrJava.recursiveSorting;

import jrJava.sorting_selection.SelectionSorter;

public class PerformanceTest {

	public static void main(String[] args) {
		
		int[] sample = Utility.createIntArray(200000);
		int[] sample2 = Utility.clone(sample);
		
		long t1 = System.currentTimeMillis();
		MergeSort.sort(sample);
		long t2 = System.currentTimeMillis();
		System.out.println(t2-t1); 
		
		SelectionSorter.sort(sample2);
		long t3 = System.currentTimeMillis();
		System.out.println(t3-t2);
		
	}

}
 