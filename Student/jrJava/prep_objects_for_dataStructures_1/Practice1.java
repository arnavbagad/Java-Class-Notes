package jrJava.prep_objects_for_dataStructures_1;

public class Practice1 {

	public static void main(String[] args) {
		
		Thing[] things = new Thing[3];
		
		things[0] = new Thing(100);
		things[1] = new Thing(200);
		things[2] = new Thing(300);
		
		removeThing(things, 200);

	}

	
	public static void removeThing(Thing[] things, int aValue){
		// This will remove from the array the Thing whose a is aValue.
		
		Thing toRemove = new Thing(aValue);
		for(int i=0; i<things.length; i++){
			if(things[i]==toRemove) things[i] = null;  
		}
		
	}
	
}
