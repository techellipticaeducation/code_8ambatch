package Assignment;

public class Fibonacci {

	public static void main(String[] args) {
		// Write code to find Fibonacci numbers
		
		int i = 1, j=1, k;
		k=0;
 
		while (k<=50) {		
			k= i+j;
			
			System.out.print(k + " - "); 
			
			i=j;                       
			j=k;
}

	}
}
