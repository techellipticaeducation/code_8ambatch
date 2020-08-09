package accessmodifier2;

import accessmodifiers1.Test1;
import accessmodifiers1.Test2;

public class Test3 {
	
	
	
	// public modifier
	public static  void test3() {
		
		Test1.test1();
		Test1.test1();
		Test2.test2();
		test5();
	}
	
	// default
	static void test4() {
		test5();
	}
	
	// private
	private static void test5() {
		
	}
}
