package objects;

public class HumanDemo {
	public static void main(String[] args) {
		Person.planet = "Earth";
		
		Person p1 = new Person();
		p1.name = "Abhishek";
		p1.height = 5.7;
		p1.age= 30;
		
		Person p2 = new Person();
		p2.name = "xyz";
		p2.height = 5.6;
		p2.age= 35;
		
		System.out.println(p1.planet);
		
		p1 = null;
		// p1 is not at all connect to  any object
//		p1.name = "Test";
		System.out.println(p2.name);
		
		p1.planet = "jk";
		System.out.println(p1.planet);
		
		
		
	}
}

class Person{

	// instance
	String name;
	double height;
	int age;

	// common
	static String planet; // this property is common for everyone

}
