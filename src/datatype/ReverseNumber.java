package datatype;

public class ReverseNumber {

	public static void main(String[] args) {
		// Write code to reverse the number and print
		
		int a = 346;
		int rem = 0;
		int reverse = 0;
		
		while (a>0) {
			rem = a % 10;                  //6, 4, 3
			reverse = reverse *10 + rem;   //0*10 + 6 = 6, 6*10+4= 64, 64*10 + 3 = 643  
			a = a / 10;                    //34, 3, 0
		}
			
			System.out.println(reverse);
			
					}

	}


