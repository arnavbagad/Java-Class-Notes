package jrJava.recursiveSorting;

public class MergeAlgorithm {

	
	public static void main(String[] args) {
		
		int[] a = {1, 4, 6, 6, 9, 12, 16, 18};
		int[] b = {2, 3, 5 ,8, 9, 11};
		
		int[] merged = merge(a, b);
		for(int i=0; i<merged.length; i++) System.out.println(merged[i] + " ");
	}

	

	public static int[] merge(int[] a, int[] b){
		// Remember that 'a' and 'b' are already in sorted order.
		int[] c = new int[a.length + b.length];
		int i=0, j=0, k=0;
		
		while(i<a.length && j<b.length){
			if(a[i]<=b[j]) c[k++] = a[i++];
			else  c[k++] = b[j++];
		}	
		
		while(i<a.length) c[k++] = a[i++];
		while(j<b.length) c[k++] = b[j++];
		
		return c;
	}
}











