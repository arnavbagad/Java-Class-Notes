package jrJava.prep_objects_forDataStructures_3;

public class Thing implements Comparable {

	private int a;
	
	public Thing(int a){
		this.a = a;
	}
	
	public int getA(){ return a; }
	
	
	public String toString(){
		return "Thing: a=" + a; // should talk about its current state. 
	}
	
	
	public boolean equals(Object o){     // Donot do "public boolean equals(Thing o)".
		if(!(o instanceof Thing)) return false;  // make sure it is an object of Thing.
		Thing t = (Thing) o;
		return a==t.a;
	}
	
	//public int hashCode(){
	//}
	
	
	public int compareTo(Object o){
		Thing t = (Thing) o;
		if(a>t.a) return 1;
		else if(a<t.a) return -1;
		else return 0;
	}
}















