package operators;

public class SwitchDemo {

	public static void main(String[] args) {

		String country = "Afg"; 
		String citizenship = "";
		
		
		switch(country) {

		case "India":
		case "india":
		case "IND":
			citizenship = "Indian";
			break;

		
		case "Pakistan":
		case "pak":
		case "pakistan":	
			citizenship = "Pakistani";
			break;

		default: 
			citizenship = "no citizenship found";
			break;

		}

		System.out.println(citizenship);

		// Generic Coding 
		
		// 
		

	}


}
