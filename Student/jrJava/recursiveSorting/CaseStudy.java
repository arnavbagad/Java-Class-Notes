package jrJava.recursiveSorting;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CaseStudy {

	public static void main(String[] args) {

		try {
			//String[] data = loadFromFile("jrJava/recursiveSorting/text2.txt");
			
			Ball[] data = createBalls(1000);
			print(data);
			System.out.println();
			//sort(data, 0, data.length-1);
			print(data);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

	
	public static Ball[] createBalls(int n){
		Ball[] balls = new Ball[n];
		for(int i=0; i<n; i++){
			balls[i] = new Ball((int)(Math.random()*21), (int)(Math.random()*21));
		}
		return balls;
	}
	

	public static void print(Object[] data){
		
		for(int i=0; i<data.length; i++){
			System.out.print(data[i] + " ");
			if(i>0 && i%20 == 0) System.out.println();
		}
		System.out.println();
	}
	
	
	public static String[] loadFromFile(String filePath) throws FileNotFoundException{
		String[] words;
		Scanner scanner = new Scanner(new File(filePath)); 
		int count = 0;
		String each;
		
		while(scanner.hasNext()){
			each = scanner.next();
			if(each.length()>3) count++;
		}
		scanner.close();
		
		words = new String[count];
		scanner = new Scanner(new File(filePath)); 
		count = 0;
		
		while(scanner.hasNext()){
			each = scanner.next();
			if(each.length()>3) words[count++] = each;
		}
		scanner.close();
		
		return words;
	}


	private static void sort(Comparable[] data, int low, int high, Comparable[] temp){

		if(low>=high) return; // cannot break into smaller jobs.

		int mid = (low + high)/2;
		sort(data, low, mid, temp);
		sort(data, mid+1, high, temp);

		// merge them.
		for(int i=low; i<=high; i++) temp[i] = data[i];

		int i=low, j=mid+1, k=low;
		while(i<=mid && j<=high) {
			if(temp[i].compareTo(temp[j])<0) data[k++] = temp[i++];
			else data[k++] = temp[j++];
		}

		while(i<=mid) data[k++] = temp[i++];
	}

	public static void sort(Comparable[] data, int low, int high){

		if(low>=high) return;

		Comparable pivot = data[(low+high)/2]; // data[low], data[high]
		int i=low, j=high;
		Comparable temp;

		while(i<=j){
			while(data[i].compareTo(pivot)<0) i++;
			while(data[j].compareTo(pivot)>0) j--;

			if(i<=j){
				temp = data[i];
				data[i] = data[j];
				data[j] = temp;
				i++;
				j--;
			}
		}

		sort(data, low, j);
		sort(data, i, high);
	}


}
