package jrJava.declaration;

import trace.Trace;

public class Practice3 {

	
	public static void main(String[] args) {
		
	   int hisMoney = 50;
	   int herMoney = 100;
		
	   if(hisMoney>=herMoney){
	       int difference = hisMoney - herMoney;
		   int bonus = difference*2;
		   herMoney = herMoney + bonus;	   
	   }
	   else {
	       int difference = herMoney - hisMoney;     
	       int bonus = difference/2;
	       hisMoney = hisMoney + bonus;
	   }
	   System.out.println("His money is " + hisMoney + ". Wow that's a lot of money!");
	   System.out.println("Her money is " + herMoney + ". Wow that's a lot of money!");  
	   
	     	   
	   Trace.trace("jrJava.declaration", "Practice3");
	
	}

}
