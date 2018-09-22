                           package jrJava.inheritance16_dataStructure2;


import jrJava.inheritance13_abstract2.*;


public class Test {

	public static void main(String[] args) {
		
		Animal[] pets = new Animal[6];

		pets[0] = new Bird();
		pets[1] = new Fish();
		pets[2] = new Dog();
		pets[3] = new Human();
		pets[4] = new Retriever();
		pets[5] = new Husky();
		
		AnimalTrainer trainer = new AnimalTrainer();
		trainer.train(pets);
				
	}

}
