package operators;

public class OperatorDemo {
public static void main(String[] args) {
//	Arithmatic operators + - * / %
	
	int i = 10;
	int j = 7;
	System.out.println(i+j); // 17
	System.out.println(i-j); // 3
	System.out.println(i*j); // 70
	System.out.println(i%j); // 3

	
	int k = i/j;
	double k1 = (double)i/(double)j;  // always integer, Wrapper Class
	
	System.out.println(k); // 1
	System.out.println(k1); // 1.434
	
	
}
}
