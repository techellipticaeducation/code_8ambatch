package datatype;

public class PrimeNumber {

	public static void main(String[] args) {
		// Create logic to find prime numbers
		
		for (int i = 2; i<100; i++) {
			
			boolean isPrimeNumber = true;
			
			for (int j=2; j<i; j++) {
				
				if (i%j == 0) {
					isPrimeNumber = false;
				break;
						}
			}
			if(isPrimeNumber) {
				System.out.print(i + " - ");
	}
}
}
}
//2 - 3 - 5 - 7 - 11 - 13 - 17 - 19 - 23 - 29 - 31 - 37 - 41 - 43 - 47 - 53 - 59 - 61 - 67 - 71 - 73 - 79 - 83 - 89 - 97 - 