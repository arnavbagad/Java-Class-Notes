package jrJava.sorting_more;

import jrJava.sorting_bubble.Utility;

public class DescendingOrderSorter {

	
	public static void main(String[] args) {
		int[] data = Utility.loadIntArrayFromFile("jrJava/sorting_bubble/random.txt");
		Utility.print(data);
		//bubbleSort(data);
		//selectionSort(data);
		insertionSort(data);
		Utility.print(data);
	}

	
	
	public static void bubbleSort(int[] values){
		int i, temp; 
		boolean sorted = false;
		
		while(!sorted){ 
			sorted = true; 
			for(i=0; i<values.length-1; i++){
				if(values[i]<values[i+1]){
					sorted = false;
					temp = values[i];
					values[i] = values[i+1];
					values[i+1] = temp;
				}
			}
		}
	}
	
	
	
	public static void selectionSort(int[] data){
		int i, j, maxIndex, temp; 
		for(i=0; i<data.length-1; i++){  
			maxIndex = i;
			for(j=i+1; j<data.length; j++){
				if(data[j]>data[maxIndex]) maxIndex = j;
			}
			temp =data[i];
			data[i] = data[maxIndex];
			data[maxIndex] = temp;
		}
	}
	
	
	
	public static void insertionSort(int[] data){
		int i, j, temp;
		for(i=1; i<data.length; i++){ 
			temp = data[i]; 
			for(j=i-1; j>=0; j--){
				if(data[j]<temp) data[j+1] = data[j];
				else break;
			}
			data[j+1] = temp; 
		}
	}
	
	
}








