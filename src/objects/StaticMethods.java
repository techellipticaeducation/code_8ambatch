package objects;

public class StaticMethods {
public static void main(String[] args) {
	Test3.i = 10;
	Test3.test2();
	
	Test3 t1 = new Test3();
	t1.test1();
	t1.j = 30;
	
	// 10 object  = 10 j = 4 bytes = 40 bytes
	//        1 // 4 bytes 
}
}


class Test3{
	
	static int i;
	int j = 10;
	// non static method
	void test1() {
		
	}
	
	static void test2() {
		
	}
	// static varible = constant variable in terms of memory
}