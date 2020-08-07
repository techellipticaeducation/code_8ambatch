package objects;

import methods.ExerciseDemo;

public class ObjectIntroduction {
	public static void main(String[] args) {
	
//	Human h1 = new Human();
//	 h1.name = "Vaibhav";
//	 h1.age = 30;
//	 h1.speak("test");
//	 h1.read();
//	 
//	 Human h2 = new Human();
//	 h2.name = "ramesh";
//	 h2.age = 35;
//	 h2.speak("How r u?");
	 
	 
	 PrimeNumber pm = new PrimeNumber();
	 int i = pm.calculatePrimeNumber();
	 
	 
	Fibnacci fb = new Fibnacci();
	int j = fb.fobinacci();
			
	
	System.out.println(i);
	System.out.println(j);
	 
	ExerciseDemo ec = new ExerciseDemo();
	ec.square(45);
	int z = ec.sum(23, 2);
	System.out.println(z);
	}
}

class Human{
	// charactistics
	String name;
	int age;
	double weight;
	
	
	// behaviour
	void speak(String content) {
		System.out.println(name + " is speaking "+content);
	}
	
	void read() {
		System.out.println(name + " is reading");
	}
	
	
}