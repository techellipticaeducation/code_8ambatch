package datatype;

public class SumofDigits {

	public static void main(String[] args) {
		// Sum of Digits
		int a = 234;
		int rem = 0;
		int sum = 0;
		
while (a > 0) {
	rem = a % 10;     //4, 3, 2
	sum = sum + rem;  //0+4 + 3 + 2
	a = a / 10;       //23 , 2, 0
	
}


System.out.println(sum);

	}
}
