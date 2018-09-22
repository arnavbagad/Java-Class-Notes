package jrJava.inheritance16_dataStructure2;

import jrJava.inheritance13_abstract2.Animal;


public class AnimalTrainer {

	
	public void train(Animal[] animals){
		
		for(int i=0; i<animals.length; i++){
			animals[i].move();
			animals[i].eat();
			System.out.println();
		}
		
	}
}
