package constructors;

public class ConstructorDemo {
	public static void main(String[] args) {
		
		Human.k = 50;
		
//		Human h1 = new Human();
//		System.out.println(h1);
//		
//		
//		h1.speak();
//		h1.speak();
//		h1.speak();
//		
//		Human h2 = new Human();
//		System.out.println(h2);
		

//		h1.speak();
//		
//		int i = 10;
	}
}


class Human{

	Human(){
		
	}

	Human(int i){
		
	}
	
	String name = "test";
	int age;
	
	static int k= 20;
	
	int i = 20; // instance
	public void speak() {
		int i = 10; // local variable
		String name = "test1";
		//System.out.println(i);  // local variable
		System.out.println(Human.k); // static 
		System.out.println(i); // local variable // so this keyword - which help us to get instance level 
		System.out.println(this.i); // instance variable
		this.write();
		this.speak();
	}
	
	
	public void write() {
		System.out.println(i);
	}
	
}

class Person{
	static {
		
	}
	
	public void write() {
		
	}
}



