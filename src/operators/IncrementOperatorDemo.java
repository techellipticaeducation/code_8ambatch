package operators;

public class IncrementOperatorDemo {
	public static void main(String[] args) {

		// postincreament
		// pre increment 

		//		int i = 10;
		//		i++; // post increment add 1 to i
		//		System.out.println(i);
		//		++i; // pre increment add 1 to i
		//		System.out.println(i);


		// Pre-increment - first increase then assign
		// post-increment - first assign then increase
		//		
		int j = 10;

		//		int k = j++; // first it is assigning the value 10 to k and then increase by 1
		//		System.out.println("k-"+k);
		//		System.out.println("j-"+j);

		//		int k = ++j; // first it is assigning the value 10 to k and then increase by 1
		//		System.out.println("k-"+k);
		//		System.out.println("j-"+j);

		//		int k = j++ + ++j;
		//		     // 10  +  12 = 22
		//		System.out.println("k-"+k);
		//		System.out.println("j-"+j);

//		int k = ++j + ++j + j++ + j++;
		     //  11 + 12  + 12 + 13
		
		int k = j++ + ++j + j++ + ++j + --j;
			//  10 + 12   + 12 + 14 + 13
		System.out.println("k-"+k);
		System.out.println("j-"+j);
		
		// Pre increment is faster then post increment ? 
		// Assignment 

	}
}
