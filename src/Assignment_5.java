
public class Assignment_5 {
	public static void toBinary(int decimal){    
	     int binary[] = new int[20];    
	     int index = 0;    
	     while(decimal > 0){    
	       binary[index++] = decimal%2;    
	       decimal = decimal/2;    
	     }    
	     for(int i = index-1;i >= 0;i--){    
	       System.out.print(binary[i]);    
	     }    
	System.out.println();//new line  
	}    
	public static void main(String args[]){      
	System.out.println("Decimal of 39 is: ");  
	toBinary(39);    
	System.out.println("Decimal of 49 is: ");  
	toBinary(49);    
	System.out.println("Decimal of 28 is: ");    
	toBinary(28);  
	System.out.println("Decimal of 126 is ");
	toBinary(126);
	System.out.println("Decimal of 156 is ");
	toBinary(156);
	}}      

