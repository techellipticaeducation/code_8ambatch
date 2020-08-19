package inheritance;

public class IDemo {
	public static void main(String[] args) {
	
		Audi au = new Audi();
		au.gears();
		
		
	}
}


class Car{
	public void gears() {
		System.out.println("3 gears - default");
	}
}


class Audi extends Car{
	public void test2() {
		System.out.println("Child.test2");
	}
	
	public void gears() {
		System.out.println("7 gears");
	}
}
