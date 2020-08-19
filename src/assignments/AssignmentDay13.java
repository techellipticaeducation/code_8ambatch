package assignments;

public class AssignmentDay13 {
	public static void main(String args[]) {
		Main1 p = new Main1();
		System.out.println("x = " + p.x + ", y = " + p.y);
	}

}

class Main1 {
	protected int x, y;
	public void Main1(int _x, int _y) {
		x = _x;
		y = _y;
	}
}

//class Point {
//protected int x, y;
//public Point(int _x, int _y) {
//x = _x;
//y = _y;
//}
//}
//public class Main {
//public static void main(String args[]) {
//Point p = new Point();
//System.out.println("x = " + p.x + ", y = " + p.y);
//}
//}