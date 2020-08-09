package objects;

public class StaticVariable {
	public static void main(String[] args) {
		
		M.j = 60;
		
		M m1 = new M();
		m1.i = 10;
		
		
		M m2 = new M();
		m2.i = 20;
		
		M.j = 50;
		
		System.out.println(m1.i);
		System.out.println(m2.i);
		
		System.out.println(M.j); //
		System.out.println(M.j); //
		
	}
}

class TestCase{

	String testcasename;
	String testcasestatus;
	String starttime;
	String endtime;
	
   static String companyName;
}


class M{

	int i; // instance variable
	static int j; // static variable/ share variable/ Class Variable 

	public void Mmehtod() {

	}


}