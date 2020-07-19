package assignments;

public class Assignmentday6 {

	public static void main(String[] args) {
		
		

// Swap Two Numbers
//		int i = 30;
//		System.out.println(" 'i' value before swap "+i);
//		int j = 40;
//		System.out.println(" 'j' value before swap "+j);
		
		
//						 Logic 1
//						 int k = i+j; // third variable		//30+40=70		
//						 i = k-i;									//70-30=40
//						 System.out.println(" 'i' value after swap "+i);//40
//						 j= k-j;									//70-40=30
//						 System.out.println(" 'j' value after swap "+j);//30
		
//				         Logic 2
//						 int k = i;								//30
//					 	 i = j;										//40
//					 	 j = k;									//30
//					 	 System.out.println(" 'i' value after swap "+i);//40
//					 	 System.out.println(" 'j' value after swap "+j);//30
		
				         //Logic 3 - Failed because i value changed after 1st arithmetic operation 
//					 	 i = i+j;									//70
//					 	 j = i-j;									//70-40=30
//		 				 i = i-j;									//70-30-40
//					 	 System.out.println(" 'i' value after swap "+i);
//					 	 System.out.println(" 'j' value after swap "+j);	

		
//1)
//		int i = 10;
//		int j = 7;
//		System.out.println(i+j);//17
//		System.out.println(i-j);//3
//		System.out.println(i*j);//70
//		System.out.println(i/j);//1
//		System.out.println(i%j);//3
		
//2)
//		int i = 10;
//		int j= 7;
//
//		double db1 = i/j;
//		System.out.println(db1);
//		double db2 = (double)i/j;
//		System.out.println(db2);
//		double db3 = i/(double)j;
//		System.out.println(db3);
	
	
//3)
//		int i = 10;
//		int j = i++;
//		System.out.println(i);//11
//		System.out.println(j);//10


//4)
//		
//		int i = 10;
//		int j = ++i;
//		System.out.println(i);//11
//		System.out.println(j);//11

//5) 
//		int i = 10;
//		int j = i++ + ++i;
//		System.out.println(i);//12
//		System.out.println(j);//22
		
//6)
		int i = 10;
		int j = i++ + i++ + --i + ++i + ++i;//10+11+11+12+13
		System.out.println(i);//13
		System.out.println(j);//57
		
	}

}
