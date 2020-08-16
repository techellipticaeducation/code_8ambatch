package assignments;

public class AssignmentAdhoc3 {

	public static void main(String[] args) {
		int j = 2;
		TestHelper Help = new TestHelper(5);
		Help.test();
		Help.test1();
		System.out.println(TestHelper.p);
		System.out.println(Help.j);
	}

}

class TestHelper {

	int j = 5;
	static int p = 6;

	public TestHelper(int k) {
		System.out.println("I am boss :)"+k);
	}

	static {
		System.out.println(7);
	}

	{
		System.out.println(2);
	}

	static {
		System.out.println(1);
	}

	{
		System.out.println(3);
	}

	void test1() {
		System.out.println("I am test1 method");

	}

	static void test5() {
		System.out.println("13");
	}

	void test() {
		System.out.println("I am test method");
		test5();
	}

}
