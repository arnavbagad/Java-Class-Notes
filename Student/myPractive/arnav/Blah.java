package myPractive.arnav;

import java.util.Scanner;

public class Blah {
	static //checks whether an int is prime or not.
	boolean isPrime(int n) {
	    for(int i=2;2*i<n;i++) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	     
	    public static void main(String a[]){
	       System.out.println(isPrime(10));
	    }
	}