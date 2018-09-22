package jrJava.inheritance2;

public class Test {

	public static void main(String[] args) {
		
		Husky ref1 = new Husky();
		ref1.eat();
		ref1.move();
		ref1.takeCareBabies();
		ref1.bark();
		ref1.pullSleds();
		
		Dog ref2 = new Husky();
		ref2.move();
		ref2.eat();
		ref2.takeCareBabies();
		ref2.bark();
		//ref2.pullSleds();
		
		Animal ref3 = new Husky();
		ref3.move();
		ref3.eat();
		//ref3.takeCareBabies();
		//ref3.bark();
		//ref3.pullSleds();
		
	}

}
