package assignments;

public class AssignmentDay7_StarProgram {

	public static void main(String[] args) {

// 	15) Star Programs

//	Pattern 1
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j <= i; j++) {
//				System.out.print('*');
//			}
//			System.out.println();
//		}		
//System.out.println();
//
//	Pattern 2
//		for (int i = 0; i < 5; i++) {
//			for (int j = 4; j > i; j--) {
//				System.out.print(" ");
//			}
//			for (int k = 0; k <= i; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//System.out.println();
//
//Pattern 3
//						for(int i=0;i<=5;i++) {
//							for(int j=5;j>i;j--) {
//								System.out.print('*');
//							}
//							System.out.println();
//						} 
//System.out.println();						
//	Pattern 4
//		for (int i = 0; i < 5; i++) {
//			for (int k = 0; k < i; k++) {
//				System.out.print(" ");
//			}
//			for (int j = 4; j >= i; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//System.out.println();
//	Pattern 5
//		for (int i = 0; i < 5; i++) {
//		for (int j = 4; j > i; j--) {
//			System.out.print(" ");
//		}
//		for (int k = 0; k <= i; k++) {
//			System.out.print("*");
//		}
//		for (int l = 1; l <= i; l++) {
//			System.out.print("*");
//		}
//		System.out.println();
//	}
//	System.out.println();
//		
//	Pattern 6
//		for (int i = 0; i < 5; i++) {
//			for (int k = 0; k < i; k++) {
//				System.out.print(" ");
//			}
//			for (int j = 4; j >= i; j--) {
//				System.out.print("*");
//			}
//			for (int l = 3; l >= i; l--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//System.out.println();		
//	Pattern 7
//for (int i = 0; i < 5; i++) {
//for (int j = 4; j > i; j--) {
//	System.out.print(" ");
//}
//for (int k = 0; k <= i; k++) {
//	System.out.print("*");
//}
//for (int l = 1; l <= i; l++) {
//	System.out.print("*");
//}
//System.out.println();
//}
//for (int i = 1; i < 5; i++) {
//for (int k = 0; k < i; k++) {
//	System.out.print(" ");
//}
//for (int j = 4; j >= i; j--) {
//	System.out.print("*");
//}
//for (int l = 3; l >= i; l--) {
//	System.out.print("*");
//}
//System.out.println();
//}
//System.out.println();
//	Pattern 8
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j <= i; j++) {
//				System.out.print('*');
//			}
//			System.out.println();
//		}
//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j < 4-i; j++) {
//				System.out.print('*');
//			}
//			System.out.println();
//		}
//System.out.println();
//	Pattern 9
//		for (int i = 0; i < 5; i++) {
//			for (int j = 4; j > i; j--) {
//				System.out.print(" ");
//			}
//			for (int k = 0; k <= i; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j <= i; j++) {
//				System.out.print(" ");
//			}
//			for (int k = 4; k > i; k--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//System.out.println();		
//	Pattern 10
//		for (int i = 0; i < 5; i++) {
//			for (int j = 4; j > i; j--) {
//				System.out.print(" ");
//			}
//			for (int k = 0; k < 5; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//System.out.println();		
//	Pattern 11
//		for (int i = 0; i < 5; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(" ");
//			}
//			for (int k = 0; k < 5; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//System.out.println();
//	Pattern 12
//		for (int i = 0; i < 5; i++) {
//			for (int j = 5; j > i; j--) {
//				System.out.print('*');
//			}
//			System.out.println();
//		}
//		for (int i = 1; i < 5; i++) {
//			for (int j = 0; j <= i; j++) {
//				System.out.print('*');
//			}
//			System.out.println();
//		}
//System.out.println();
//	Pattern 13 
//		for (int i = 0; i < 5; i++) {
//			for (int k = 0; k < i; k++) {
//				System.out.print(" ");
//			}
//			for (int j = 4; j >= i; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for (int i = 1; i < 5; i++) {
//			for (int j = 4; j > i; j--) {
//				System.out.print(" ");
//			}
//			for (int k = 0; k <= i; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//System.out.println();
// Pattern 14
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < i; j++) {
//				System.out.print(" ");
//			}
//			for (int k = 0; k <= 4 - i; k++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		for (int i = 1; i < 5; i++) {
//			for (int j = 5 - i; j > 1; j--) {
//				System.out.print(" ");
//			}
//			for (int k = 0; k <= i; k++) {
//				System.out.print("* ");
//			}
//
//			System.out.println();
//		}
//System.out.println();
//	Pattern 15
//	Logic 1
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= i; j++) {
//					if (i==3 && j==2 || i==4 && j==2 || i==4 && j==3 ) {
//					System.out.print(" ");	
//					}
//					else {
//						System.out.print('*');
//					}
//			}
//			System.out.println();
//		}		
//	Logic 2
//		int n = 6;
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= (2 * i - 1); j++) {
//				if (j == 1 || i == n || j == (2 * i - 1)) {
//					System.out.print("*");
//				} else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
//System.out.println();
//Pattern 16
// Logic 1
//		for (int i = 0; i < 5; i++) {
//			for (int j = 4; j > i; j--) {
//				System.out.print(" ");
//			}
//			for (int k = 0; k <= i; k++) {
//				if (i == 2 && k == 1 || i == 3 && k == 1 || i == 3 && k == 2) {
//					System.out.print(" ");
//				} else {
//					System.out.print('*');
//				}
//			}
//			System.out.println();
//		}

	}
}
