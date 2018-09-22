package jrJava.inheritance17_ObjectMethodsOverride;

public class MyOwnClass {

	private int id;
	private int value;
	
	public MyOwnClass(int id, int value){
		this.id = id;
		this.value = value;
	}
	
	public boolean equals(Object o){
		MyOwnClass o2 = (MyOwnClass) o;
		if(id==o2.id && value==o2.value) return true;
		return false;
	}
	
	public String toString(){
		return "MyOwnClass: id=" + id + ", value=" + value;
	}
	
}
