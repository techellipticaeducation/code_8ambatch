package assignments;

public class AssignmentAdhoc2 {
	
	void t(){
		System.out.println("D");
	}

	static {
		System.out.println("Test A");
	}

	static {
		System.out.println("Test B");
	}

	public static void main(String args){
		AssignmentAdhoc2 t=new AssignmentAdhoc2();
	}

	{
		System.out.println("Test 3");
	}

	{
		System.out.println("Test 4");
	}
}
