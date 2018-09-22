package jrJava.prep_objects_forDataStructures_3;

import java.net.SocketOption;

public class Practice1 {

	public static void main(String[] args) {
		
		int[] num = {0, 0, 123, 121, 135};
		for(int i=0; i<num.length; i++) System.out.println(num[i]);
		
		if(num[2]<num[3]) System.out.println("Yes, [2] is less than [3].");
		
		int temp = num[2];
		num[2] = num[3];
		num[3] = temp;;
		
		System.out.println();
		for(int i=0; i<num.length; i++) System.out.println(num[i]);
		
		// ------------------------------------------------------
		
		String s1 = "abcde";
		String s2 = "df";
		//if(s1<s2) System.out.println("Yes s1 is less than s2.");
 
		Thing t1 = new Thing(100);
		Thing t2 = new Thing(110);
		//if(t1<t2) System.out.println();
		
		Integer a1 = 45;
		Integer a2 = 39;
		if(a1<a2) System.out.println();  // if(a1.intValue()<a2.intValue()) sop(); auto-unboxing.
		
		if(t1.compareTo(t2)<0) System.out.println("t1 is lesss than t2.");
		if(t1.compareTo(t2)>0) System.out.println("t1 is greater than t2.");
		
	}

}






