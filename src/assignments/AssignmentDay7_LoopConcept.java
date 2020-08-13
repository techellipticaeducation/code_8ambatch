package assignments;

public class AssignmentDay7_LoopConcept {

	public static void main(String[] args) {

//1) Write code to get first 20 prime numbers
						System.out.println(2);
						for (int i = 3; i < 1000; i = i +2) {
							boolean isPrimeNumber = true;
							for(int j = 2; j < i/2 ; j++) {
								if(i%j == 0) {
									isPrimeNumber = false;
								}
							}
							if(isPrimeNumber) {
								System.out.println(i);
							}
						}
//						
//						 by itself or 1
//						/ i = 34
//						 2 , 23, 4,5 6,7,,9 till 34/2 = 17

		// 11 - is a prime number?
		// 11/1 = 11
		// 11/2 = 5.5
		// 11/3 = 3.66
		// 11/4 = 2.75
		// 11/5 = 2.2
		// 11/6 = 1.888
		// 11/7 = 1.sd
		// 11/8 = 1.43
		// 11/9 =
		// 11/10 =
		// 11/11 =

//2) Write Code to sum all digit a value

//						int number=445000;
//						int sum=0;
//						System.out.println("Number to be sum : "+number);
//						
//						Logic 1
//						for(int i=1;i<=4;i++) {
//							sum=sum+number%10;
//							number=number/10;
//						}
//				
//						Logic 2
//						while(number!=0) {
//							sum=sum+number%10;
//							number=number/10;
//						}
//						
//						System.out.println("Sum of all number : "+sum);

//3) write code to reverse number
//								suppose a = 346
//								output should be 643

//							int number = 346;
//							int rev = 0;
//							System.out.println("Number before reverse : " + number);
//							System.out.print("Number before reverse : ");
//							while (number != 0) {
//								rev = number % 10;
//								number = number / 10;
//								System.out.print(rev);
//							}						
						
						
//4) Write Code to write Fibonacci Code
//		1 1 2 3 5 8 13 21 34 ....
//							int start_number = 1;
//							int end_number = 10;
//							int temp1 = 1;
//							int temp2 = 1;
//					
//							while (start_number <= end_number) {
//								System.out.print(temp1+"		");
//								int sum = temp1 + temp2;
//								temp1 = temp2;
//								temp2 = sum;
//								start_number++;
//							}

//5) Write Code to get Armstrong number 	
//		Armstrong number is a number that is equal to the sum of cubes of its digits. For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers.
//
//		153 = (1*1*1) + (5*5*5) + (3*3*3)		

//							int start_number = 0;
//							int end_number = 200;
//							int n = start_number;
//							int total = 0;

//							Logic 1
//							for (int i = 0; i <= end_number; i++) {
//								start_number = i;
//								while (start_number > 0) {
//									n = start_number % 10;
//									total = total + (n * n * n);
//									start_number = start_number / 10;
//								}
//								if (total == i) {
//									System.out.print(i + "	");
//								}
//								total = 0;
//							}

//							Logic 2 - Failed
//							while(start_number<end_number) {								
//								while (start_number > 0) {
//									n = start_number % 10;
//									total = total + (n * n * n);
//									start_number = start_number / 10;
//								}
//								start_number++;
//								if (total == start_number) {
//									System.out.print(start_number + "	");
//								}
//								total = 0;
//								start_number++;								
//							} 

//6) write two ways to write infinite while loop
		// 1
		// int number=0;
		// while(number<=0) {
		// System.out.println(number);
		// number --;
		// }

		// 2
		// int number=100;
		// while(number==100) {
		// System.out.println(number);
		// }

//7) write 3 real life examples for while loop
		// 1) Until and Unless we don't receive the goal -
		// For Example - in case of Armstrong number, inner while loop will run till the
		// value is greater than zero

		// 2) Playlist Songs - it will play until and unless we stop or it reaches the
		// last song

		// 3)Automated Tech support - it will try to resolve till the query is resolved
		// or user forcefully cancel the call

//8) write a scenario where we use do-while loop
		// Automated Voice Support

//9) why we have do-while loop when for & while loop is available
		// Do-While loop will execute at least once but for & while loop will only
		// execute if condition check pass

//10) Write Diff between while , do-while & for loop
		// For Loop - All Initialization+Condition+Increment defined in single line.
		// Condition check perform before entering into the loop
		// While loop - We can use if end condition is not cleared. Condition check
		// perform before entering into the loop
		// do-while loop - Execute at least once. Condition check perform after entering
		// into the loop

//11) Why we use for loop when we have while & do-while loop
		// For Loop - All Initialization+Condition+Increment defined in single line.
		// Condition check perform before entering into the loop
		// While loop - We can use if end condition is not cleared. Condition check
		// perform before entering into the loop
		// do-while loop - Execute at least once. Condition check perform after entering
		// into the loop

// 12) Write o/p of below question - Solution : condition is int but expected value should is boolean either true or false
//		class Test {
//			public static void main(String[] args) {
//			for(int i = 0; 1; i++) {
//			System.out.println("Hello");
//			break;
//			}
//			}
//
//	}

//13) Write output of below question - Solution :Infinite loop , there is no condition defined
//		class Test {
//			public static void main(String[] args) {
//			for(;;) {
//			System.out.println("Hello");
//			}
//			}
//			}	

//14) Write two ways to write infinite for loop

//		1
//		for(;true;) {
//			System.out.println(true);
//		}
//		2
//		for(int i=1;i<100;i--) {
//			System.out.println(true);
//		}


//16) why do we need break in switch case
		// Break is used to terminate the switch case once condition is passed,
		// otherwise the control will go to last case and same will be executed

//17) what is limitation in switch case		
		// Case datatype should be similar to datatype in switch
		// Duplicate case values are not allowed - compile time error
		// Default and break are optional
		// String country =" ";
		// switch (country) {
		// case "India":
		// System.out.println("String");
		// break;
		//
		// case "1":
		// System.out.println("Integert data type not accepted");
		// break;
		//
		// case "3.4":
		// System.out.println("Integert data type not accepted");
		// break;
		//
		// default:
		// break;
		// }

	}
}
