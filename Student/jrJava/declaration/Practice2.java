package jrJava.declaration;

import trace.Trace;

public class Practice2 {

	public static void main(String[] args) {
		
		
        int sirWeight = 104;  
        int myWeight = 220;
        
        myWeight = myWeight + sirWeight/2;
        sirWeight =sirWeight/2;
        
        System.out.println("My weight is "  + myWeight + ".");
        System.out.println("Sir's weight is "  + sirWeight + ".");            
        
        Trace.trace("jrJava.declaration", "Practice2");
	}

}


