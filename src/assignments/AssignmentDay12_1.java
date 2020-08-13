package assignments;

import java.util.Scanner;

public class AssignmentDay12_1 {

	public static void main(String[] args) {
		
//		Scanner sc=new Scanner(source)
//		AssignmentDay12_1 AD = new AssignmentDay12_1();
//		AD.testPrimeNumber(500);

	}
	
	public static void testPrimeNumber(int number) {
		boolean flag = true;
		for (int i = 2; i <= number / 2; i++) {
			int number1 = number % i;
			if (number1 == 0) {
				flag = false;
				break;
			}
		}
		if (flag)
			System.out.println(number + " is a Prime Number");
		else
			System.out.println(number + " is not a Prime Number");
	}

}
