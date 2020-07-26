package Assignment;

public class StarProgram {

	public static void main(String[] args) {
	// Write a code to print Stars 1 to 5 increment a star in each line from left to right	
		/*output for below star pattern logic
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 */
		
//		int i, j;
//		
//		for (i=1; i<=5; i++) {
//			for (j=1; j<=i; j++) {
//				System.out.print("* ");
//			}
//				
//			System.out.println();
//		}
// Write a code to print Stars 1 to 5 decrease a star in each line from left to right 
		/*output for below star pattern logic
		 * *****
		 * ****
		 * ***
		 * **
		 * *
		 */
//		int a, b;
//		
//		for (a=5; a>=1; a--) {
//			for (b=1; b<=a; b++) {
//				System.out.print("* ");
//			}
//				
//			System.out.println();
//		}
// Write a code to print Stars 1 to 5 decrease a star in each line from left to right 
		/* Output print as below
		 *     *
		 *    **
		 *   ***
		 *  ****
		 * *****
		 */
//		int n=5;
//		for (int x=1; x<=n; x++) {
//			for (int y=n-x; y>0; y--) {
//				System.out.print(" ");
//			}
//			for (int y=1; y<=x; y++) {
//			System.out.print("*");
//		}
//			System.out.println();	
//		
//	}
//		// Write a code to print Stars 5 to 1 decrease a star in each line from left to right 
//				/* Output print as below
//				 * *****
//				 *  ****
//				 *   ***
//				 *    **
//				 *     *
//				 */
//		int num=5;
//		for (int x=1; x<=num; x++) {
//			for (int y=1; y<x; y++) {
//				System.out.print(" ");    // space printing
//			}
//			for (int y=num; y>=x; y--) {
//				System.out.print("*");
//		}
//			System.out.println();	
//		
//	}
		// Write a code to print Stars below pattern 
		/* Output print as below
		 * * * * * *
		 *  * * * *
		 *   * * *
		 *    * *
		 *     *
		 */
//int num=5;
//for (int x=1; x<=num; x++) {
//	for (int y=1; y<x; y++) {
//		System.out.print(" ");    // space printing
//	}
//	for (int y=num; y>=x; y--) {
//		System.out.print("* ");
//}
//	System.out.println();	
//
//}
//Write a code to print pyramid Stars 
		/* Output print as below
		 *     *
		 *    * *
		 *   * * *
		 *  * * * *
		 * * * * * *
		 */
		int n=5;
		for (int x=1; x<=n; x++) {
			for (int y=n-x; y>0; y--) {
				System.out.print(" ");
			}
			for (int y=1; y<=x; y++) {
			System.out.print("* ");
		}
			System.out.println();	
		
	}

	}
}
