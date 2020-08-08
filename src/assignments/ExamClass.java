package assignments;

public class ExamClass {

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
