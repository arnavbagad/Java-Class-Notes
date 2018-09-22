package jrJava.inheritance13_abstract2;

public class Test {

	public static void main(String[] args) {
		
		//new Animal();
		//new Mammal();
		
		Animal ref = new Fish();
		ref.move();
		
		Animal ref2 = new Retriever();
		ref2.move();
	}

}
