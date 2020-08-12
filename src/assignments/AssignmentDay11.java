package assignments;

public class AssignmentDay11 {

	public static void main(String[] args) {

		// 1) Visibility for all the Access Modifiers
		// Ref -
		// https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html#:~:text=A%20class%20may%20be%20declared,visible%20to%20all%20classes%20everywhere.&text=The%20protected%20modifier%20specifies%20that,its%20class%20in%20another%20package.
		// Ref - https://www.geeksforgeeks.org/access-modifiers-java/
		// Ref -
		// http://tutorials.jenkov.com/java/access-modifiers.html#:~:text=The%20Java%20access%20modifiers%20private,access%20modifier%20assigned%20to%20them.
		// private - visible and accessible within same class , private keyword used
		// with variable/class/method
		// default - visible and accessible within package , no keyword need to be
		// defined
		// protected - visible and accessible within same package or sub classes in
		// different package , protected keyword used with variable/class/method
		// public - visible and accessible everywhere , public keyword used with
		// variable/class/method

		// 2) What class cannot have access modifier as private and protected?
		// Class cannot have access modifier as private and protected. Only
		// Method/Variable insider class can have access modifier as private protected.
		// Error while defining private/protected - Illegal modifier for the class test;
		// only public, abstract & final are permitted

		// 3) O/p for below code snippetv - 0 0
		// class Test {
		// protected int x, y;
		// }
		//
		// class Main {
		// public static void main(String args[]) {
		// Test t = new Test();
		// System.out.println(t.x + " " + t.y);
		// }
		// }

	}

}
