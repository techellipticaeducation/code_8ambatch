package Assignment;

public class PreIncrement_Assignment {

	public static void main(String[] args) {
		// Pre Increment Assignment
		int i = 10;
		int j = i++ + ++i;
		      //10 + 12
		int x = 10;
		int y = x++ + x++ + --x + ++x + ++x;
		  ///   10 + 11 + 11 + 12 + 13 
		System.out.println("i value is " + i); // 12
		System.out.println("j value is " + j); // 10 + 12 = 22

		
		System.out.println("x value is " + x); //10+1 + 1 -1 +1 +1 = 13
		System.out.println("y value is " + y); //10+1 + 11+1 + (12-1=)11 + 1+11 + 1+12 = 53
		
	}

}
