package test1;

public class FinalDemo {
	
	public static int k = 10;
	
	static {
		System.out.println("i am in static block");
		System.out.println(k);
	}
	public static void main1() {
		System.out.println("amin" + k);
	}
	
	public static void main(String[] args) {
		System.out.println("i am in main block");
		main1();
//		FinalTest.test2();
//
//		FinalTest test1 = new FinalTest();
//		FinalTest test2 = new FinalTest();
//		FinalTest test3 = new FinalTest();
//
//		int j = 10;
//		FinalTest.test5(j);
		
	}
}

class FinalTest{
	// final - make you value as constant

	
	int j = k;
	static int k = 45;
	
	
	public static void test5(int i ) {
		
	}
	
	
	public static final double PI = 3.14d;  // Constant

	// static - one memory - never change
	// final - one value - value will never change
	
	// pure 

	public static void test1() {
		System.out.println(PI);
	}

	// static block
	static{
		System.out.println("static block");	
	}
	static{
		System.out.println("static block1");	
	}
	static{
		System.out.println("static block2");	
	}


	// instance block
	{
		System.out.println("isntance block");
	}



	// static method only allow static variable
	// non static mehtod allow all type of variable


	// Local Variable
	public static void test2() {
		int i = 10; // 4 byte
		System.out.println(i);
	}

	// static - class variable - highest scope
	// instance - until your object in memory till that time instace variable
	// Local - until that block or method is executing

	// class - static variables
	// object




}
