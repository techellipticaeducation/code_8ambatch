package methods;


// public or default 
public class ExerciseDemo {

	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//  i want to create one method 
	// name = square
	// param = inputValue (1 value)
	// return = int - which must be square of inputvalue
	// 3 -> 9, 4 -> 16, 5-> 25
	
	// 3 Types
	// Single line comment
	// Multiline Comment
	// Doc Comment
	
//	test1 - Single line comment
 	
	/* - Multiline Comments
	test1
	test2
	test3
	test4
	*/
	
	

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ExerciseDemo ex1 = new ExerciseDemo();
		// prime number code
		
	}
	
	// How do we create Java Doc
	
	/**
	 * hello i am doc comment
	 * test1
	 * test2
	 * test3
	 * test4
	 */
	public int square(int inputValue) {
		return inputValue*inputValue;
	}
	
	/**
	 * hello this is Sum method
	 * @param inputValue
	 * @param inputValue2
	 * @return
	 */
	public int sum(int inputValue, int inputValue2) {
		return inputValue+inputValue2;
	}
	
}
