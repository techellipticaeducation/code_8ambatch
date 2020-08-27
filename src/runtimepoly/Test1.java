package runtimepoly;

public class Test1 {
	public static void main(String[] args) {
		//		
		//		Chrome ch1 = new Chrome();
		//		ch1.chromeclick();
		//		
		//		Mozilla moz = new Mozilla();
		//		moz.mozillaclick();

		String browsertype = "mozilla";
		Browser browser = null;
		if(browsertype.equals("chrome")) {
			browser = new Chrome();
		}else if(browsertype.contentEquals("mozilla")) {
			browser = new Mozilla();
		}else if(browsertype.contentEquals("ie")) {
		//	browser = new IE();
		}
		
		
		
		
		
		browser.click();

// ref part - method is visible 
		// object part - execute
	}
}


class Browser{
	public void click() {

	}
}

// chrome org
class Chrome extends Browser{
	public void click() {
		System.out.println("chrome click");
	}
	public void m1() {

	}
}

// mozilla org
class Mozilla extends Browser{
	public void click() {
		System.out.println("mozilla click");
	}
}
