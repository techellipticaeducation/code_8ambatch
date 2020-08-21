package inheritance;

public class AccessModifierDemo extends Child {
	public static void main(String[] args) {
//		Child ch = new Child();
//		ch.test();
		// static method
		// no we cannot use non-static method inside static method
		//test();
		
		AccessModifierDemo demo1 = new AccessModifierDemo();
		demo1.test2();
	}
	
	
	public void  test2() {
		test();
	}
	
}

class Parent{
	
	int i;
	
	public  void test() {
		int i = 10;
		
		System.out.println(this.i);
		
		System.out.println("parent logic");
	}
	public void test5() {
		
	}
}

class Child extends Parent{
	public void test() {
		System.out.println("child logic");
	}
	
	public void genericTest() {
		super.test();
	}
	
	
}
