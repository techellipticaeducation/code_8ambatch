package pac1;

import java.util.Comparator;

public class Test1 {

	static class MySort implements Comparator{

		public int compare(String arg0, String arg1) {
			return arg1.compareTo(arg0);
		}
		
	}
}
