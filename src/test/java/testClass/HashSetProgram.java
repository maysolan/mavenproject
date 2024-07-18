package testClass;

import java.util.HashSet;

public class HashSetProgram {

	public static void main(String[] args) {

		HashSet<String> names = new  HashSet<String>();

		names.add("Mayank");
		names.add("Shreya");
		names.add("Syed");
//		names.remove("Shreya");
		names.add("Neel");
		names.add("Lata");
		
		System.out.println(names);
		
	}

}
