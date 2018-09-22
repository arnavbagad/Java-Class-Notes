package jrJava.sorting_selection;

public class MinFinder {

	
	public static void main(String[] args) {
		int[] values = Utility.loadIntArrayFromFile("jrJava/sorting_selection/myData.txt");
		Utility.print(values);
		
		System.out.println(min(values));
		System.out.println(minIndex(values));
	}

	
	
	public static int min(int[] data){
		int min = data[0];
		for(int i=1; i<data.length; i++){
			if(data[i]<min) min = data[i];
		}
		return min;
	}
	
	
	
	public static int minIndex(int[] data){
		int minIndex = 0;
		for(int i=1; i<data.length; i++){
			if(data[i]<data[minIndex]) minIndex = i;
		}
		return minIndex;
	}
	
}













