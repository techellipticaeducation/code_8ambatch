package datatype;

public class DataType {
	public static void main(String[] args) {
		//  Datatype - 
		// Numerical
		
		// byte -  1 byte 
		// short - 2 byte = 16 bit , 2 power 16 = maximum 
		// int - 4 byte = 32 bits , 2 power 32 
		// long - 8 byte , 64 bits ,  2power 64 
		
		// what is byte? unit, 
		// 1 byte - 8 bits 
		
		
		// memory saving  roll number - 1000 
		
		int a = 100; 
		int i = 0106;  // if you put 0 before any integer = octal
		int j = 0XA6;  //  if i put 0X = hexadecimal number System 
		
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
		
		//256 
		// 256/2 = 128 
		
		// positive  0 to 127
		// negative  -128 to 0
		
		//  -128 to 127
		//byte b1 = -128;
		
		System.out.println(a);
		System.out.println(i);
		System.out.println(j);
		
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
		
		
		
		
		// Realtime sceanrio -> coding language
	}
}
