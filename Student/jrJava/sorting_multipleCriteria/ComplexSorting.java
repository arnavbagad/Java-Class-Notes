package jrJava.sorting_multipleCriteria;

import jrJava.sorting_bubble.Utility;

public class ComplexSorting {

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
				if(values[i]%2==0 && values[i+1]%2==1 || values[i]%2==values[i+1]%2 && values[i]>values[i+1]){
					sorted = false;
					temp = values[i];
					values[i] = values[i+1];
					values[i+1] = temp;
				}
			}
		}
	}
	
	
	
	public static void selectionSort(int[] data){
		int i, j, minIndex, temp; 
		for(i=0; i<data.length-1; i++){  
			minIndex = i;
			for(j=i+1; j<data.length; j++){
				if(data[j]%2==1 && data[minIndex]%2==0 || data[j]%2==data[minIndex]%2 && data[j]<data[minIndex]) minIndex = j;
			}
			temp =data[i];
			data[i] = data[minIndex];
			data[minIndex] = temp;
		}
	}
	
	
	
	
	public static void insertionSort(int[] data){
		int i, j, temp;
		for(i=1; i<data.length; i++){ 
			temp = data[i]; 
			for(j=i-1; j>=0; j--){
				if(data[j]%2==0 && temp%2==1 || data[j]%2==temp%2 && data[j]>temp) data[j+1] = data[j];
				else break;
			}
			data[j+1] = temp; 
		}
	}
	
}









