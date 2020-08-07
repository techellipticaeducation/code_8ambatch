package objects;

import methods.ExerciseDemo;

public class ObjectMethod {

	public static void main(String[] args) {

//Define Object#1 
		Fibnacci O1 = new Fibnacci();  //defining Fibnacci class here
		int i = O1.fobinacci();     // defining Fobinacci method here which is present in the Fibnacci class 
		
		System.out.println(i);
				
// Define Object#2			
ExerciseDemo O2 = new ExerciseDemo(); /// Defining ExerciseDemo class as object here
  
int j = O2.square(10);     /// Calling a square method as integer from ExerciseDemo class 
 
int k = O2.sum(25, 30);   /// Calling sum method as integer from Exercise class

System.out.println(j);
System.out.println(k);

//Define Object#3
PrimeNumber O3 = new PrimeNumber();
int a = O3.calculatePrimeNumber();
System.out.println(a);


//Define Object#4
AddMethod O4 = new AddMethod();   //Check with Vaibhav
int b = O4.addition(10, 25);
System.out.println(b);
	}

}
