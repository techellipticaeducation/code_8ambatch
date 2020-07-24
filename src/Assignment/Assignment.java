// Data Types Assignment 11-Jul-2020
package Assignment;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Convert Decimals to Binary, Decimals to Octal and Decimals to Hexadecimal
		int b1 = 20;   // Convert Decimal to Binary
		int b2 = 39;   // Convert Decimal to Binary
		int b3 = 49;   // Convert Decimal to Binary
		int b4 = 28;   // Convert Decimal to Binary
		int b5 = 126;  // Convert Decimal to Binary
		int b6 = 156;  // Convert Decimal to Binary
		
		int o1 = 20;   // Convert Decimal to Octal
		int o2 = 100;  // Convert Decimal to Octal
		int o3 = 56;   // Convert Decimal to Octal
		int o4 = 78;   // Convert Decimal to Octal
		int o5 = 1453; // Convert Decimal to Octal
		int o6 = 544;  // Convert Decimal to Octal
		
		int h1 = 245;  // Convert Decimal to Hexadecimal
		int h2 = 45;  // Convert Decimal to Hexadecimal
		int h3 = 67;  // Convert Decimal to Hexadecimal
		int h4 = 98;  // Convert Decimal to Hexadecimal
		int h5 = 712;  // Convert Decimal to Hexadecimal
		
		// Print convert Decimal to Binary values
		System.out.println(Integer.toBinaryString(b1));
		System.out.println(Integer.toBinaryString(b2));
		System.out.println(Integer.toBinaryString(b3));
		System.out.println(Integer.toBinaryString(b4));
		System.out.println(Integer.toBinaryString(b5));
		System.out.println(Integer.toBinaryString(b6));
		
		// Print convert Decimal to Octal values
		System.out.println(Integer.toOctalString(o1));
		System.out.println(Integer.toOctalString(o2));
		System.out.println(Integer.toOctalString(o3));
		System.out.println(Integer.toOctalString(o4));
		System.out.println(Integer.toOctalString(o5));
		System.out.println(Integer.toOctalString(o6));
		
		// Print convert Decimal to Hexadecimal values
		System.out.println(Integer.toHexString(h1));
		System.out.println(Integer.toHexString(h2));
		System.out.println(Integer.toHexString(h3));
		System.out.println(Integer.toHexString(h4));
		System.out.println(Integer.toHexString(h5));

	}

}
