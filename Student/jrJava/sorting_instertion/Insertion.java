package jrJava.sorting_instertion;

public class Insertion {

	public static void main(String[] args) {

		int [] values = {2, 5, 8, 11, 17, 6};

	}

	public static void insert(int[] data){
		int temp;
		int j;
		int newGuyIndex = data.length-1;

		temp = data[newGuyIndex];
		for(j=newGuyIndex-1; j>=0; j--){
			if(data[j]>temp) data[j+1] = data[j];
			else{
				data[j+1] = temp;
				break;
			}
		}
		
		if(j==-1) data[0] = temp;
	}


}
