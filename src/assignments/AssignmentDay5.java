package assignments;

public class AssignmentDay5 {

	public static void main(String[] args) {
		
		/*	1) what is type Casting
		  	
		  	Solution - https://www.geeksforgeeks.org/type-conversion-java-examples/
		 */

		
		/*	2) int In=1234_2343_22376; is this valid
		 	
		 	Solution - No it exceeded the int range
		 */
		
		
		/*	3)Solve the below code
		  	byte b1 = 128;
			what is the output?
			
			byte b1 = (byte)b1;
			what is the output?
			
			byte b1 = (byte)(b1*3);
			what is the output?
			
			Solution : 
			
			  	byte b1 = 128;
				what is the output? --> Compile time Error - cannot convert from int to byte
				
				byte b1 = (byte)b1;
				what is the output? --> If we use the above statement then it will throw compile 
										time error because b1 variable is not initialized to overcome this we have to use below code
										byte b1 = (byte)128; --> Output -128
					
				byte b1 = (byte)(b1*3);
				what is the output? --> If we use the above statement then it will throw compile 
										time error because b1 variable is not initialized to overcome this we have to use below code
										byte b1 = (byte)128; --> Output -128 
		 */
	
		
		/*	4) Write output for below code
		  	byte b1 = (byte)250;
			byte b1 = (byte)120;
			byte b1 = (byte)130;
			byte b1 = (byte)300;
			
			write output of b1;

		 	Solution : 
		 	
		 		byte b1 = (byte)250;
				System.out.println(b1); --> -6
				byte b2 = (byte)120;
				System.out.println(b2); --> 120
				byte b3 = (byte)130;
				System.out.println(b3); --> -126
				byte b4 = (byte)300;
				System.out.println(b4); --> 44 
		 */
		
		
		/*	5) Solve below code
		  		int i = 020;
				int j = 20;
				int k = 0X20;
				print output? 
				
			Solution :
			
				int i = 020;
				System.out.println(i); --> Converted in to Octal due to prefix 0 = 1*0+8*2
				int j = 20;
				System.out.println(j); --> considerd as int value only because there is no prefix
				int k = 0X20;
				System.out.println(k); --> considerd as Hexadecimal due to prefix 0X = 1*0+16*2
		 */
	}

}
