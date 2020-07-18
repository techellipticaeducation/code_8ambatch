package operators;

public class ComparisonOperators {
public static void main(String[] args) {
	// > < >= <= != ==
	// Comparison always return true and false
	
	
	int i = 10;
	int j = 10;
	
	System.out.println(i > j); //  false
	System.out.println(i < j); // false
	System.out.println(i <= j); // true
	System.out.println(i >= j); // true
	System.out.println(i == j); // true
	System.out.println(i != j); // false
	
	// Bitwise operation
	
	// AND = & 
//	true & true = true
//	true & false = false
//	false & true = false 
//	false & false = false
// if my first condition coming as false, should i check second condition?
	
	// OR  = |
//	true | true = true
//	true | false = true
//	false | true = true
//	false | false = false
// if my first condition is true , should i check for second condition?
	
	System.out.println("=== and===");
	System.out.println(true & true);
	System.out.println(true & false);
	System.out.println(false & true);
	System.out.println(false & false);
	
	System.out.println("=== or===");
	System.out.println(true | true);
	System.out.println(true | false);
	System.out.println(false | true);
	System.out.println(false | false);
	
// Bitwise operator always check both condition
	
	// Logical operator
	
	System.out.println("=== and===");
	System.out.println(true && true);
	System.out.println(true && false);
	System.out.println(false && true);
	System.out.println(false && false);
	
	System.out.println("=== or===");
	System.out.println(true || true);
	System.out.println(true || false);
	System.out.println(false || true);
	System.out.println(false || false);
	
	
	
}

}
