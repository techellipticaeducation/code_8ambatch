package assignments;

public class AssignmentDay8_MainClass {

	public static void main(String[] args) {

// Object Created of SubClass (Same Package) and method are called from the main class		
		// Object Creation for Calculator Class (Subclass in same package)
		AssignmentDay8_CalculatorClass obj1 = new AssignmentDay8_CalculatorClass();

		// Calling add method with two parameters
		int sum = obj1.add(5, 6);
		System.out.println("Addition of two number : " + sum);

		// Calling Subtraction method with two parameters
		int diff = obj1.diff(5, 8);
		System.out.println("Subtraction of two number : " + diff);

		// Calling Multiplication method with two parameters
		int product = obj1.product(5, 8);
		System.out.println("Multiplication of two number : " + product);

		// Calling Divide method with two parameters and it will return quotient
		int quotient = obj1.quotient(8, 5);
		System.out.println("Divide of two number : " + quotient);

		// Calling remainder method with two parameters and it will return remainder
		int remainder = obj1.remainder(8, 5);
		System.out.println("Modulus of two number : " + remainder);

	}

}
